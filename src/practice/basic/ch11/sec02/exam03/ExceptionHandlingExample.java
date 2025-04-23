package practice.basic.ch11.sec02.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo",null,"200"};
        try {
            for (int i =0; i<= array.length; i++){
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]:" + value);
            }
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());;
        } catch ( ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
