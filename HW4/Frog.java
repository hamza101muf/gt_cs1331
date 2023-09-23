/**
 * This class represents a frog object in the Pond Driver class.
 *
 * @author Hamza Mufti
 * @version 1.0
 */
public class Frog extends Pond {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species;

    /**
     * This is the 3 param constructor for the Frog class.
     *
     * @param frogName        initial name
     * @param frogAge         initial age
     * @param frogTongueSpeed initial tongue speed
     */
    public Frog(String frogName, int frogAge, double frogTongueSpeed) {
        name = frogName;
        age = frogAge;
        tongueSpeed = frogTongueSpeed;
        species = "Rare Pepe";
        isFroglet = (age > 1 && age < 7);
    }

    /**
     * This is the 2 param constructor for the Frog class.
     *
     * @param frogName initial name
     * @param ageInYears  initial age
     * @param frogTongueSpeed initial tongue speed
     */
    public Frog(String frogName, double ageInYears, double frogTongueSpeed) {
        this(frogName, (int) (ageInYears * 12), frogTongueSpeed);
    }

    /**
     * This is the 1 param constructor for the Frog class.
     *
     * @param frogName initial name
     */
    public Frog(String frogName) {
        this(frogName, 5, 5);
    }

    /**
     * This gets the Frog's name.
     *
     * @return name of frog
     */
    public String getName() {
        return name;
    }

    /**
     * This sets the Frog's name.
     *
     * @param newName new name of frog
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * This gets the Frog's age.
     *
     * @return age of frog
     */
    public int getAge() {
        return age;
    }

    /**
     * This sets the Frog's age.
     *
     * @param newAge new age of frog
     */
    public void setAge(int newAge) {
        age = newAge;
    }

    /**
     * This gets the Frog's tongue speed.
     *
     * @return tongue speed of frog
     */
    public double getTongueSpeed() {
        return tongueSpeed;
    }

    /**
     * This sets the Frog's tongue speed.
     *
     * @param newTongueSpeed new tongue speed of frog
     */
    public void setTongueSpeed(double newTongueSpeed) {
        tongueSpeed = newTongueSpeed;
    }

    /**
     * This gets the Frog's species.
     *
     * @return whether the frog object is a grown frog or a froglet
     */
    public boolean isFroglet() {
        return isFroglet;
    }

    /**
     * This gets the Frog's species.
     *
     * @return species of all the Frog objects
     */
    public static String getSpecies() {
        return species;
    }

    /**
     * This sets the Frog's species for all the Frog objects
     *
     * @param newSpecies what the new species is
     */
    public static void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    /**
     * This grows the Frog object.
     *
     * @param ageIncrease how much the frog object grows
     */
    public void grow(int ageIncrease) {
        while (getAge() < 12 && ageIncrease > 0) {
            setAge(getAge() + 1);
            setTongueSpeed(getTongueSpeed() + 1);
            isFroglet = (getAge() > 1 && getAge() < 7);
            ageIncrease -= 1;
            if (getTongueSpeed() < 5) {
                setTongueSpeed(5);
            }
        }
        while (getAge() >= 12 && getAge() < 30 && ageIncrease > 0) {
            setAge(getAge() + 1);
            isFroglet = (getAge() > 1 && getAge() < 7);
            ageIncrease -= 1;
            if (getTongueSpeed() < 5) {
                setTongueSpeed(5);
            }
        }
        while (getAge() >= 30 && ageIncrease > 0) {
            setAge(getAge() + 1);
            isFroglet = (getAge() > 1 && getAge() < 7);
            setTongueSpeed(getTongueSpeed() - 1);
            ageIncrease -= 1;
            if (getTongueSpeed() < 5) {
                setTongueSpeed(5);
            }
        }

    }

    /**
     * This grows the Frog object by 1.
     */
    public void grow() {
        this.grow(1);
    }

    /**
     * This eats the Fly object.
     *
     * @param fly the Fly object that is being eaten
     */
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

    /**
     * Describes the Frog's name, age, tongue speed, and whether it is a froglet or
     * not.
     *
     * @return description of the Frog object
     */
    public String toString() {
        if (isFroglet) {
            return ("My name is " + name + " and I'm a rare froglet! I'm " + age
                    + " months old and my tongue has a speed of " + ((int) (100 * tongueSpeed)) / 100.0 + ".");
        } else {
            return ("My name is " + name + " and I'm a rare frog. I'm " + age
                    + " months old and my tongue has a speed of " + ((int) (100 * tongueSpeed)) / 100.0 + ".");
        }
    }
}
