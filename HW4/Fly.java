/* I worked on the homework assignment alone, using only course materials. */

public class Fly extends Pond {
    private double mass;
    private double speed;

    public Fly(double flyMass, double flySpeed) {
        mass = flyMass;
        speed = flySpeed;
    }

    public Fly(double flyMass) {
        this(flyMass, 10.0);
    }

    public Fly() {
        this(5.0, 10.0);
    }

    public double getMass() {
        return mass;
    }

    public double getSpeed() {
        return speed;
    }

    public void setMass(double newMass) {
        mass = newMass;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public void grow(int weightGain) {
        while (mass < 20 && weightGain > 0) {
            mass += 1;
            setSpeed(getSpeed() + 1);
            weightGain -= 1;
        } while (mass >= 20 && weightGain > 0) {
            mass += 1;
            setSpeed(getSpeed() - 0.5);
            weightGain -= 1;
        }

    }

    public boolean isDead() {
        return (mass == 0);
    }

    public String toString() {
        if (isDead()) {
            return ("\nI'm dead, but I used to be a fly with a speed of " + ((int) (100 * speed)) / 100.0
                    + ".");
        } else {
            return ("\nI'm a speedy fly with " + ((int) (100 * speed)) / 100.0 + " speed and "
                    + ((int) (100 * mass)) / 100.0 + " units of mass.");
        }
    }
}
