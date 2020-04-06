package ru.job4j.jdk9;

import java.util.Objects;

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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
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

}

