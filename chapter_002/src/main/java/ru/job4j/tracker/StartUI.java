package ru.job4j.tracker;


public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("Вывожу хранящиеся заявки");
        Item[] item = tracker.findAll();
        for (Item x : item) {
            System.out.println(x.getName() + " - " + x.getId());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        String id = input.askStr("Введите id заявки, которую необходимо заменить");
        String name = input.askStr("Введите имя новой заявки: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно заменена");
        } else {
            System.out.println("Введённый id заявки не найден");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Введите id заявки, которую необходимо удалить");
        if (tracker.delete(id)) {
            System.out.println("Заявка успешно удалена");
        } else {
            System.out.println("Введённый id заявки не найден");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        String id = input.askStr("Введите id заявки, которую необходимо найти");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Заявка найдена:" + item.getName() + " - " + item.getId());
        } else {
            System.out.println("Заявка не найдена");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя заявки, которую необходимо найти");
        Item[] items = tracker.findByName(name);
        for (Item x : items) {
            System.out.println("Заявка найдена: " + x.getName() + " - " + x.getId());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);

            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}