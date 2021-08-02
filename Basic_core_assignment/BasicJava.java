import java.util.Arrays;
import java.util.ArrayList;
public class BasicJava {
    public String printNumber(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
        return "";
    }
    public void oddNumber() {
        int count = 0;
        for (int i = 1; i < 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count = count+1;
            }
        }
        System.out.println("The count is :" + count);
    }
    public String sigma() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            sum = sum + i;
            String print_sum = String.format("sum is %s and number is %s", sum, i);
            System.out.println(print_sum);
        }
        return "";
    }
    public String loopArray() {
        int [] myArray = {1,3,5,7,9,13};
        for(int i = 0; i < myArray.length; i++) {
            // int element = myArray[i];
            // String.valueOf(element)
            System.out.println(String.valueOf(myArray[i]));
        }
        return "";
    }
    public Integer findMax(int [] arr) {
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.println(max);
        }
        return max;
    }
    public ArrayList<Integer> oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        return y;
    }
}



