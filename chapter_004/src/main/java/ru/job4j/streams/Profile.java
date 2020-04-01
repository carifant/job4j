package ru.job4j.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream().sorted(new ProfileCompare()).distinct().map(Profile::getAddress).collect(Collectors.toList());
        return list;
    }
}
