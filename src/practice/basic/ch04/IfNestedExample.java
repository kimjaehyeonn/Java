package practice.basic.ch04;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81;
        System.out.println("점수 " +  score);
        String grade;

        if (score >= 85) {
            if (score >= 90) {
                if (score >= 95) {
                    grade = "A+";
                } else {
                    grade = "A";
                }
            } else {
                grade = "B+";
            }
        } else {
            grade = "B";
        }
        /*if (score>= 95) {
            grade = "A+";
            System.out.println("점수: " + score);
            System.out.println("등급: " + grade);
        } else if ( (score>=90) && (score < 95)) {
            grade = "A";
            System.out.println("점수: " + score);
            System.out.println("등급: " + grade);

        } else if ( (score>=85) && (score < 90)) {
            grade = "B+";
            System.out.println("점수: " + score);
            System.out.println("등급: " + grade);

        } else {
            grade = "B";
            System.out.println("점수: " + score);
            System.out.println("등급: " + grade);

        }*/
        System.out.println("등급: " + grade);
    }
}
