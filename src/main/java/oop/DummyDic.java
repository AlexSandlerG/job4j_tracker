package oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic text = new DummyDic();
        text.engToRus("Job");
    }
}
