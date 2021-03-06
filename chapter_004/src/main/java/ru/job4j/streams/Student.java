package ru.job4j.streams;

import java.util.Objects;

public class Student {

    private int score;
    private String surName;

    public Student(int score) {
        this.score = score;
    }

    public Student(String name) {
        this.surName = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null
                || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surName);
    }
}
