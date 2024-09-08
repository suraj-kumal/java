public class innercl {
    public class inne {
        void data() {
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
        innercl o = new innercl();
        innercl.inne ok = o.new inne();
        ok.data();
    }
}
