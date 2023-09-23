//I worked on the assignment alone, using only course-provided materials.

public class PrimitiveOperations {
    public static void main(String[] args) {
        int turtle = 2;
        double walrus = 3.435;
        System.out.println(turtle);
        System.out.println(walrus);

        double walurtle = turtle * walrus;
        System.out.println(walurtle);

        double newTurtle = (double) turtle;
        System.out.println(newTurtle);

        int newWalrus = (int) walrus;
        System.out.println(newWalrus);

        char letter = 'T';
        System.out.println(letter);
        letter = (char) ((double)  letter + 32);
        System.out.println(letter);
    }
}