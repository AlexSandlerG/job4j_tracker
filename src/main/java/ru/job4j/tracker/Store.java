package ru.job4j.tracker;

public interface Store {

    void save(String value);

    String[] load();
}
