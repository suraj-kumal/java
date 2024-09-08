import inheritance.*;

public class child extends father {
    child() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new child();
    }

}