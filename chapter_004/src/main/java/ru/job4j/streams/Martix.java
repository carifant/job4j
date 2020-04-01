package ru.job4j.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Martix {

    Integer[][] array = {{-9, 1, 0}, {4, 1, 1}, {-2, 2, -1}};

    List<Integer> list = Arrays.stream(array)
            .flatMap(Arrays::stream)
            .collect(Collectors.toList());

}


