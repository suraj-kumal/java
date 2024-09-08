//class
public class classandobject {
    private String data;
    private int number;

    // constructor
    classandobject(String data, int number) {
        this.data = data;
        this.number = number;
        System.out.println(this.data);
        System.out.println(this.number);

    }

    public static void main(String[] args) {
        // object
        new classandobject("abc", 32);
    }

}
