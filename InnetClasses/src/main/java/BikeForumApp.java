class SportsBike {
    String brand;
    String model;
    SportsBike(String b, String m) {
        brand=b;
        model=m;
    }
    class Engine {
        int cc;
        int hp;
        Engine(int c, int h) {
            cc=c;
            hp=h;
        }
        void rev() {
            System.out.println(brand + " " + model + "Has " + cc + "cc engine and " + hp + "hp");
        }
    }
    static class AbsSystem {
        String type;
        AbsSystem(String t) {
            type=t;
        }
        void status() {
            System.out.println("has " + type + " ABS");
        }
    }
}

public class BikeForumApp {
    public static void main(String[] args) {
        SportsBike myBike=new SportsBike("KTM", "Duke 390");
        SportsBike.Engine myEngine=myBike.new Engine(398, 45);
        myEngine.rev();
        SportsBike.AbsSystem abs=new SportsBike.AbsSystem("dual channel");
        abs.status();
    }
}