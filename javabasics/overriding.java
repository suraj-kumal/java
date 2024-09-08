import inheritance.*;

public class overriding extends sound {
    @Override
    public void makesound() {
        System.out.println("cry");
    }

    public static void main(String[] args) {
        overriding sound = new overriding();
        sound.makesound();
    }
}
