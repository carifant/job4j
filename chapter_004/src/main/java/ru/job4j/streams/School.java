package ru.job4j.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class School {


    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> list = students.stream().filter(
                predict).collect(Collectors.toList());
        return list;
    }

    Map<String, Student> collectToMap(List<Student> students) {
        Map<String, Student> map = students.stream()
                .collect(Collectors.toMap(Student::getSurName, Function.identity(), (x, y) -> x));
        return map;
    }
}

