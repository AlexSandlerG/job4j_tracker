package oop;

public class Error {

    private String message;
    private boolean active;
    private int status;

    public Error() {

    }

    public Error(String message, boolean active, int status) {
        this.message = message;
        this.active = active;
        this.status = status;
    }

    public void show() {
        System.out.println(this.message);
        System.out.println(this.active);
        System.out.println(this.status);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.show();
        System.out.println("");
        Error error1 = new Error("text", true, 5);
        error1.show();
    }
}
