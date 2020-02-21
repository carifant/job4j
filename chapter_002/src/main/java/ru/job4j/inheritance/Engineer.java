package ru.job4j.inheritance;

public class Engineer extends Profession {
    int tasks;
    String projects;

    public String makeNewProject(Task task) {
        return projects;
    }
}
