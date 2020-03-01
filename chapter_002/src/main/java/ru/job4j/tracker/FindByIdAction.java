package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Введите id заявки, которую необходимо найти");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка найдена:" + item.getName() + " - " + item.getId());
        } else {
            System.out.println("Заявка не найдена");
        }
        return true;
    }
}