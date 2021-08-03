public class TestExceptionList {
    public static void main(String[] args){
        ExceptionList tester = new ExceptionList();
        try {
            tester.tryAndCatch();
            System.out.println("Its done!! No need to worry");
        }
        catch (ClassCastException e) {
            System.out.println("Oh! That's what expected!!");
        }
    }
}
