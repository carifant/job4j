package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;

public class StubInput implements Input {
    private List<String> answers;
    private int index;


    public StubInput(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public int askInt(String question, int max) {
        return askInt(question);
    }

    @Override
    public String askStr(String question) {
        return answers.get(index++);
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}

