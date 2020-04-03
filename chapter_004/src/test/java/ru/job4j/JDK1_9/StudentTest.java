package ru.job4j.JDK1_9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void whenTest1() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(35));
        students.add(new Student(45));
        students.add(new Student(55));
        students.add(new Student(65));
        students.add(new Student(68));
        students.add(new Student(99));
        School s = new School();
        List<Student> result = s.levelOf(students, 50);
        List<Student> expected = Arrays.asList(new Student(99), new Student(68),
                new Student(65), new Student(55));
        assertThat(result, is(expected));
    }

    @Test
    public void whenTestWithNull() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(35));
        students.add(null);
        students.add(new Student(55));
        students.add(new Student(65));
        students.add(null);
        students.add(null);
        School s = new School();
        List<Student> result = s.levelOf(students, 40);
        List<Student> expected = Arrays.asList(new Student(65), new Student(55));
        assertThat(result, is(expected));

    }
}