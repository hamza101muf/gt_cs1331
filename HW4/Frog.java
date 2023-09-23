
public class Frog extends Pond {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private String species;

    public Frog(String frogName, int frogAge, double frogTongueSpeed) {
        name = frogName;
        age = frogAge;
        tongueSpeed = frogTongueSpeed;
        species = "Rare Pepe";
        isFroglet = (age > 1 && age < 7);
    }

    public Frog(String frogName, double ageInYears, double frogTongueSpeed) {
        this(frogName, (int) (ageInYears * 12), frogTongueSpeed);
    }

    public Frog(String frogName) {
        this(frogName, 5, 5);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public double getTongueSpeed() {
        return tongueSpeed;
    }

    public void setTongueSpeed(double newTongueSpeed) {
        tongueSpeed = newTongueSpeed;
    }

    public boolean isFroglet() {
        return isFroglet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    public void grow(int ageIncrease) {
        while (age < 12 && ageIncrease > 0) {
            age += 1;
            tongueSpeed += 1;
            isFroglet = (age > 1 && age < 7);
            ageIncrease -= 1;
        }
        while (age >= 30 && ageIncrease > 0) {
            age += 1;
            isFroglet = (age > 1 && age < 7);
            tongueSpeed -= 0.5;
            ageIncrease -= 1;
        }
    }

    public void grow() {
        this.grow(1);
    }

    public void eat(Fly fly) {
        if (fly.isDead()) {
            return;
        } else {
            if (fly.getSpeed() < tongueSpeed) {
                if (fly.getMass() >= 0.5 * age) {
                    fly.setMass(0);
                    this.grow();
                } else {
                    fly.setMass(0);
                }
            } else {
                fly.grow(1);
            }
        }
    }

    public String toString() {
        if (isFroglet) {
            return ("\nMy name is " + name + " and I'm a rare froglet! I'm " + age
                    + " months old and my tongue has a speed of " + ((int) (100 * tongueSpeed)) / 100.0 + ".");
        } else {
            return ("\nMy name is " + name + " and I'm a rare frog. I'm " + age
                    + " months old and my tongue has a speed of " + ((int) (100 * tongueSpeed)) / 100.0 + ".");
        }
    }
}
