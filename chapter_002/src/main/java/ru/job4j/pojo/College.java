package ru.job4j.pojo;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setfName("Alexander");
        student.setlName("Ivanon");
        student.setnGroup(3);
        student.setEntrance(new Date());
        System.out.println("Студент: " + student.getfName() + " " + student.getlName() + " зачислен в группу № " + student.getnGroup() + " - " + student.getEntrance());
    }

}
