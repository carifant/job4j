package ru.job4j.condition;

public class DummyBot {

    public static void main(String[] args) {
  DummyBot db = new DummyBot();
  System.out.println(DummyBot.answer("Привет, Бот."));
  System.out.println(DummyBot.answer("Пока."));
  System.out.println(DummyBot.answer("Сколько времени?"));
    }

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            return "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            return "До скорой встречи.";
        } else {
            return rsl;
        }
    }
}
