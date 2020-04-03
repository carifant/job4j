package ru.job4j.JDK1_9;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {

    private String name;
    private int scope;

    public Student(int scope) {
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return scope == student.scope;

    }

    @Override
    public int hashCode() {
        return Objects.hash(scope);
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(scope, o.scope);
    }

    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted(Comparator.reverseOrder()).takeWhile(temp -> temp.getScope() > bound)
                .collect(Collectors.toList());
    }
}
