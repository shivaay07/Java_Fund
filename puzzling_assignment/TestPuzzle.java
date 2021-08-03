import java.util.Arrays;
public class TestPuzzle {
    public static void main(String[] args) {
        Puzzle randint = new Puzzle();
        // String result = randint.getTenRolls();
        // String output = randint.getNewPasswordSet();
        String output = randint.getNewPasswordSet(12);
        System.out.println(output);
        // System.out.println(result);
    }
}