import java.util.ArrayList;
import java.util.ArrayList;public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava number = new BasicJava();
        String result =  number.printNumber();
        String output = "Number is :" + result;
        System.out.println(output);
        number.oddNumber();
        String sum_sigma = number.sigma();
        String element_of_array = number.loopArray();
        int [] arr = {-5,-3,7,-8};
        Integer resultArray = number.findMax(arr);
        System.out.println(resultArray);
        System.out.println(element_of_array);
        System.out.println(sum_sigma);
        ArrayList<Integer> oddArrayResult = number.oddArray();
        System.out.println(oddArrayResult);
    }
}