package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("All Items are loaded");
        System.out.println("All Items:");
        Item[] array = tracker.findAll();
        for (Item i : array) {
            System.out.println(i);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = input.askInt("Enter the Item "
                + "id you want to change");
        String name = input.askStr("Enter Item name you "
                + "want to replace: ");
        Item item = new Item(name);
        boolean success = tracker.replace(id, item);
        if (success) {
            System.out.println("Replacement was successful");
        } else {
            System.out.println("An error has occurred");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("Enter the Item id you want to remove: ");
        boolean success = tracker.delete(id);
        if (success) {
            System.out.println("Deletion was successful");
        } else {
            System.out.println("An error has occurred");
        }
    }

    public static void findItemId(Input input, Tracker tracker) {
        int id = input.askInt("Enter the Item id you want to find: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Name Item: " + item.getName()
                    + System.lineSeparator() + "Id Item: " + item.getId());
        } else {
            System.out.println("Item with this id was not found");
        }
    }

    public static void findItemName(Input input, Tracker tracker) {
        String name = input.askStr("Enter the Item name you"
                + " want to search: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (Item i : item) {
                System.out.println(i);
            }
        } else {
            System.out.println("Item with this name were not found.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select >= 0 && select <= 6) {
                if (select == 6) {
                    System.out.println("Exit");
                    run = false;
                } else if (select == 0) {
                    StartUI.createItem(input, tracker);
                } else if (select == 1) {
                    StartUI.showAllItem(tracker);
                } else if (select == 2) {
                    StartUI.replaceItem(input, tracker);
                } else if (select == 3) {
                    StartUI.deleteItem(input, tracker);
                } else if (select == 4) {
                    StartUI.findItemId(input, tracker);
                } else {
                    StartUI.findItemName(input, tracker);
                }
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}