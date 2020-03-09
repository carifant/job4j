package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            String temp = persons.get(i).getSurname();
            String temp2 = persons.get(i).getAddress();
            String temp3 = persons.get(i).getName();
            String temp4 = persons.get(i).getPhone();
            if (temp.contains(key) || temp2.contains(key) || temp3.contains(key) || temp4.contains(key)) {
                result.add(persons.get(i));
            }
        }
        return result;
    }
}
