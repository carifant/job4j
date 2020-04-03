package ru.job4j.collection;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("GazpromCeo@mail.ru", "Miller A.A.", "Rosneft@mail.ru", "Stepashin N.T.");
        map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
