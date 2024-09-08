
interface MakeCar {
    void addTires();

    void addPaint();
}

class Son implements MakeCar {
    @Override
    public void addTires() {
        System.out.println("toyo Tires added.");
    }

    @Override
    public void addPaint() {
        System.out.println("red Paint added.");
    }
}

class daughter implements MakeCar {
    @Override
    public void addTires() {
        System.out.println("pink Tires added.");
    }

    @Override
    public void addPaint() {
        System.out.println("pink Paint added.");
    }
}

// Test the implementation
public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.addTires();
        son.addPaint();

        daughter d = new daughter();
        d.addTires();
        d.addPaint();
    }
}
