package practice.citizens.dao;

import practice.citizens.model.Person;
import practice.citizens_v2.dao.Citizens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CitizensImpl implements Citizens {

    // fields
    private List<Person> idList; // список граждан по id

    private List<Person> lastNameList; // список граждан по фамилиям

    private List<Person> ageList; // список граждан по годам

    private static Comparator<Person> lastNameComparator;

    private static Comparator<Person> ageComparator;

    // constructor
    // пустой конструктор
    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        for (Person person : citizens) {
            add(person);
        }
    }

    @Override
    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        int index = Collections.binarySearch(idList, person);
        if (index >= 0) {
            return false;
        }
        index = -index - 1;
        idList.add(index, person);


        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : -index - 1;
        idList.add(index, person);

        index = Collections.binarySearch(ageList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        idList.add(index, person);

        return true;
    }

    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        return true;
    }

    @Override
    public Person find(int id) {
        Person pattern = new Person(id, null, null, null);
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        return null;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        Person pattern = new Person(Integer.MIN_VALUE, null, lastName, null);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, null, lastName, null);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from,to);
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
