/* I worked on the homework assignment alone, using only course materials. */

/**
 * This class represents a Fly object in the Pond Driver class.
 *
 * @author Hamza Mufti
 * @version 1.0
 */
public class Fly extends Pond {
    private double mass;
    private double speed;

    /**
     * This is the 2 param constructor for the Fly class.
     *
     * @param flyMass  initial mass of fly
     * @param flySpeed initial speed of fly
     */
    public Fly(double flyMass, double flySpeed) {
        mass = flyMass;
        speed = flySpeed;
    }

    /**
     * This is the 2 param constructor for the Fly class.
     *
     * @param flyMass  initial mass of fly
     */
    public Fly(double flyMass) {
        this(flyMass, 10.0);
    }

    /**
     * This is the 0 param constructor for the Fly class.
     */
    public Fly() {
        this(5.0, 10.0);
    }

    /**
     * This gets the Fly's mass.
     *
     * @return the mass of the fly
     */
    public double getMass() {
        return mass;
    }

    /**
     * This gets the Fly's speed.
     *
     * @return the speed of the fly
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * This sets the Fly's mass.
     *
     * @param newMass new mass of the fly
     */
    public void setMass(double newMass) {
        mass = newMass;
    }

    /**
     * This sets the Fly's speed.
     *
     * @param newSpeed new speed of the fly
     */
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    /**
     * Groews the fly's weight by a specified amount and changes speed accordingly
     *
     * @param weightGain specifies the weight gain of the fly
     */
    public void grow(int weightGain) {
        while (mass < 20 && weightGain > 0) {
            mass += 1;
            setSpeed(getSpeed() + 1);
            weightGain -= 1;
        }
        while (mass >= 20 && weightGain > 0) {
            mass += 1;
            setSpeed(getSpeed() - 0.5);
            weightGain -= 1;
        }

    }

    /**
     * Checks if the fly is dead or not
     *
     * @return true if the fly is dead, false otherwise
     */
    public boolean isDead() {
        return (mass == 0);
    }

    /**
     * This method describes the fly object's speed, mass, and whether it is alive
     * or not
     *
     * @return String describing the fly object
     */
    public String toString() {
        if (isDead()) {
            return ("I'm dead, but I used to be a fly with a speed of " + ((int) (100 * speed)) / 100.0
                    + ".");
        } else {
            return ("I'm a speedy fly with " + ((int) (100 * speed)) / 100.0 + " speed and "
                    + ((int) (100 * mass)) / 100.0 + " mass.");
        }
    }
}
