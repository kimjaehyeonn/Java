package practice.basic.ch11.sec02.exam01;

public class ExceptionalHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        try{ for(int i=0; i<=array.length; i++) {
            int value = Integer.parseInt(array[i]);
            System.out.println("array[" + i + "]" + value);
        }}
        catch (NumberFormatException e){
                System.out.println(e.getMessage());

            } catch(RuntimeException e){            // ArrayIndex
                System.out.println(e.getMessage());
            }
        }
    }

