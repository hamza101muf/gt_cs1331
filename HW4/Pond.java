
public class Pond {
    public static void main(String[] args) {
        Frog frog = new Frog("Peepo");
        Frog frog1 = new Frog("Pepe", 10, 15);
        Frog frog2 = new Frog("Peepaw", 4.6, 5);
        Frog frog3 = new Frog("Froggington", 12, 23);

        Fly fly = new Fly(1, 3);
        Fly fly1 = new Fly(6);
        Fly fly2 = new Fly(34, 5);

        frog1.setName("1331 Frogs");
        System.out.println(frog.toString());
        frog.eat(fly1);
        System.out.println(fly1.toString());
        frog.grow(8);
        frog.eat(fly1);
        System.out.println(fly1.toString());
        System.out.println(frog.toString());
        System.out.println(frog3.toString());
        frog2.grow(4);
        System.out.println(frog2.toString());
        System.out.println(frog1.toString());

    }
}
