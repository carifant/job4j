package ru.job4j.test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(student -> student.getUnits().stream().map(x -> new Holder(x, student.getName())))
                .collect(Collectors.groupingBy(t -> t.key,
                        Collector.of(
                                HashSet::new,
                                (set, t) -> set.add(t.value),
                                (left, right) -> {
                                    left.addAll(right);
                                    return left;
                                }
                        )
                        )
                );
    }
}
