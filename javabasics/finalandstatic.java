public class finalandstatic {
    int i = 10;
    // static keyword is used to define class variable
    static String name = "Suraj";
    // final variable cannot be modified
    final String surname = "Kumal";

    void display() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(i);
    }

    public static void main(String[] args) {
        finalandstatic data = new finalandstatic();
        data.display();
    }
}
