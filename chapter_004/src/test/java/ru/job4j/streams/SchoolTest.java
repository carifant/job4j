package ru.job4j.streams;

import org.junit.Test;
import ru.job4j.lambda.LambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void whenClassA() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(35));
        students.add(new Student(45));
        students.add(new Student(55));
        students.add(new Student(65));
        students.add(new Student(68));
        students.add(new Student(99));
        School school = new School();
        List<Student> result = school.collect(students, (student) -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = Arrays.asList(new Student(99));
        assertThat(result, is(expected));
    }

    @Test
    public void whenClassB() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(35));
        students.add(new Student(45));
        students.add(new Student(55));
        students.add(new Student(65));
        students.add(new Student(68));
        students.add(new Student(99));
        School school = new School();
        List<Student> result = school.collect(students, (student) -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = Arrays.asList(new Student(55), new Student(65), new Student(68));
        assertThat(result, is(expected));
    }

    @Test
    public void whenClassC() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(35));
        students.add(new Student(45));
        students.add(new Student(55));
        students.add(new Student(65));
        students.add(new Student(68));
        students.add(new Student(99));
        School school = new School();
        List<Student> result = school.collect(students, (student) -> student.getScore() >= 0 && student.getScore() < 50);
        List<Student> expected = Arrays.asList(new Student(35), new Student(45));
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectToMap() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sergey"));
        students.add(new Student("Alex"));
        students.add(new Student("Sergey"));
        students.add(new Student("Timofey"));
        students.add(new Student("Oleg"));
        students.add(new Student("Oleg"));
        School school = new School();
        Map<String, Student> result = school.collectToMap(students);
        Map<String, Student> expected = Map.of("Sergey", new Student("Sergey"), "Alex", new Student("Alex"),
                "Timofey", new Student("Timofey"), "Oleg", new Student("Oleg"));
        assertThat(result, is(expected));
    }
}