package practice.ilist;

// зададим абстрактные методы для работы со структурой данных "лист/list" (список чего-то),
// для любых типов данных Integer, String, StringBuilder, Employee, Car, Pet, Photo, Book ...

import java.util.Objects;

public interface IList<E> {

    int size(); // узнать размер списка

    boolean isEmpty(); // есть ли что-то в списке или он пустой

    void clean(); // удалить все из списка

    boolean add(E element); // добавить элемент списка

    boolean contains(Object o);// есть ли элемент в списке

    boolean remove(Objects o);// удалить элемент, если он есть (а все ли элементы мы удалим?)

    // добавить (вставить) элемент по индексу

    // удалить элемент из списка по индексу

    // обновить элемент в списке по его индексу

    // найти элемент по его индексу

    // зная элемент, найти его индекс


    // ищем индекс элемента с конца списка

}
