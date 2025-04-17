package Java.src.practice.basic.ch04;

public class IfElseExample {
    public static void main(String[] args) {
        //int score = 85;
        int score = 93;
        if (score >= 90) {
            System.out.println("""
                    점수가 90보다 큽니다.
                    등급은 A입니다.
                    """);
        } else if (score < 90) {
            System.out.println(
                    """
                            점수가 90보다 작습니다.
                            등급은 B입니다. 
                            """
            );

        }

    }
}
