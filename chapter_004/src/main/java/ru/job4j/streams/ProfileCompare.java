package ru.job4j.streams;

import java.util.Comparator;

public class ProfileCompare implements Comparator<Profile> {

    @Override
    public int compare(Profile o1, Profile o2) {
        return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
    }
}
