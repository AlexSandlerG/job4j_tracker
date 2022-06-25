package ru.job4j.tracker;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        Store store = new FileStore();
        Service service = new Service(store);
        service.extract();
    }
}
