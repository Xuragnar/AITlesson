package practice.linked_list;

public interface NodeList<E> extends Iterable<E> {
    //прописываем методы
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    boolean add(E element);

    void clear();

    default boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o){
        int index =indexOf(o);
        if(index <0){
            return false;
        }
        remove(index);
        return false;
    }

    boolean add(int index,E element);
    E get (int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    E remove(int index);
    E set(int index , E element);


}
