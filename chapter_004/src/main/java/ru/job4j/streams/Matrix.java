package ru.job4j.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {


    List<Integer> reMakeArraysToList(Integer[][] x) {
        return Arrays.stream(x).flatMap(Arrays::stream).collect(Collectors.toList());
    }


}


