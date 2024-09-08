package inheritance;

public class customhandle extends Exception {
    public customhandle(String message) {
        super(message);
    }

    public customhandle() {
        super();
    }

    public static void main(String[] args) {
        try {
            boolean abc = false;
            if (!abc) {
                throw new customhandle("Custom exception occurred because abc is false.");
            }
        } catch (customhandle ex) {
            // Handle the custom exception
            System.out.println("Caught a custom exception: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions if necessary
            System.out.println("Caught an exception: " + ex.getMessage());
        }
    }
}
