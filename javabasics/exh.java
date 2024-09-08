public class exh {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;
        int div;
        try {
            div = num1 / num2;
            System.out.println(div);

        } catch (Exception e) {
            System.out.println("divide by zero is infinite");

        }
    }
}
