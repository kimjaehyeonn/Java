package practice.basic.ch05;

public class CharAtExample
{
    public static void main(String[] args) {
        /*
        * charAt(index)
        * 문자열의 지정한 인덱스에 해당하는 문자 하나를 char 타입으로 반환
        */
        String ssn = "9506241230123";
        if (ssn.charAt(6) == '1') {
            System.out.println('남');
        } else {
            System.out.println('여');
        }
    }
}
