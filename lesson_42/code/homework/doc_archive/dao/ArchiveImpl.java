package homework.doc_archive.dao;

import homework.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate());
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };

    //fields
    private Document[] documents;
    private int size;

    // constructor
    public ArchiveImpl(int capacity) {
        documents = new Document[capacity];
    }

    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || getDocFromFolder(document.getFolderId(), document.getDocumentId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean removeDocument(int folderId, int documentId) {
        // ищем фото
        for (int i = 0; i < size; i++) {
            if (documents[i].getFolderId() == folderId && documents[i].getDocumentId() == documentId) {
                // надвигаем массив на найденную позицию i удаляемого фото
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                // size--;
                documents[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, String url) {
        Document document = getDocFromFolder(folderId, documentId);
        if (document == null) {
            return false;
        }
        document.setUrl(url);
        return true;
    }

    @Override
    public Document getDocFromFolder(int folderId, int documentId) {
        Document pattern = new Document(folderId, documentId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(documents[i])) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocFromFolder(int folderId) {
        return findByPredicate(p -> p.getFolderId() == folderId);// передаем в метод findByPredicate сам предикат(условие для поиска)
    }

    private Document[] findByPredicate(Predicate<Document> predicate) {
        Document[] res = new Document[size];
        int j = 0; // это счетчик найденных документов
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j] = documents[i];
                j++;
            }

        }
        return Arrays.copyOf(res, j);//скопировали массив сам на себя, теперь он без элементов null
    }

    @Override
    public Document[] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
        //ввели объектную переменную, шаблон
        int from = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1;//находим индекс начального фото левый
        // край from = from>=0 ? from : -from-1;
        pattern = new Document(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));// находим
        // правый край
        int to = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1;
        // to = to >=0 ? to : -to-1;
        return Arrays.copyOfRange(documents, from, to);// диапазон, создаем новый массив с нужными документами
    }

    @Override
    public int size() {
        return size;
    }

    public void viewArchive() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
        System.out.println("You have " + size + " documents.");
    }
}
