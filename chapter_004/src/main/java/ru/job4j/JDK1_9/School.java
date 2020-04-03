package ru.job4j.JDK1_9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted(Comparator.reverseOrder()).takeWhile(temp -> temp.getScope() > bound)
                .collect(Collectors.toList());
    }
}
