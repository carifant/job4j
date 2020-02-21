package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String fName;
    private String lName;
    private int nGroup;
    private Date entrance;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getnGroup() {
        return nGroup;
    }

    public void setnGroup(int nGroup) {
        this.nGroup = nGroup;
    }

    public Date getEntrance() {
        return entrance;
    }

    public void setEntrance(Date entrance) {
        this.entrance = entrance;
    }
}
