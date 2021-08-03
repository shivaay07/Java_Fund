import java.util.Arrays;
import java.util.Random;
public class Puzzle {
    String[] alphas = {
    "a", "b", "c", "d", "e",
    "f", "g", "h", "i", "j",
    "k", "l", "m", "n", "o",
    "p", "q", "r", "s", "t",
    "u", "v", "w", "x", "y", "z",
};
    // Random randMachine = new Random();
    // String[] myArray;
    // public String[] getTenRolls() {
    //     myArray = new String[10];
    //     for(int i = 0; i < 10; i++){
    //         myArray[i] = getRandomLetter();
    //     }
    //     return myArray;
    // }
    // Random randMachine = new Random();
    // String[] myArray;
    // public String getTenRolls() {
    //     myArray = new String[10];
    //     for(int i = 0; i < 10; i++){
    //         myArray[i] = getRandomLetter();
    //     }
    //     return Arrays.toString(myArray);
    // }
    Random randMachine = new Random();
    String[] myArray;
    public String getTenRolls() {
        myArray = new String[8];
        for(int i = 0; i < 8; i++){
            myArray[i] = getRandomLetter();
        }
        return Arrays.toString(myArray);
    }
    public String getRandomLetter() {
        return alphas[randMachine.nextInt(26)];
    }
    // public String getNewPasswordSet(int length) {
    //     String [] arr = new String[length];
    //     for (int i = 0; i < arr.length; i++ ){
    //         arr[i] = getTenRolls();
    //     }
    //     return Arrays.toString(arr);
    // }
    public String getNewPasswordSet(int length) {
        String [] arr = new String[length];
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = getRandomLetter();
        }
        return Arrays.toString(arr);
    }
}


