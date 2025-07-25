package practice.test.lambda;

import java.time.LocalDateTime;
import java.util.function.*;

public class Example {
    public static void main(String[] args) {
        /*
         * 표준 함수형 인터페이스
         * JDK 8 자주 사용되는 함수적 인터페이스를 표준 API로 제공하고있다.
         * Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다. (매개변수 소비자 역할)
         * Supplier : 매개변수가 없고, 리턴값이 있는 getXXX() 메소드를 가지고 있다.
         * Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑)
         * Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있는데, 매개변수로 연산을 한 후 통일된 타입으로 리턴
         * Predicate : 매개변수와 boolean 값을 반환하는 testXXX() 메소드를 가지고 있다. (매개변수를 활용해서 Boolean값 리턴)
         * */

        /*Consumer<T>#accpet(T t): void : 객체 t를 받아 소비*/
        Consumer<String> consumer = (str )-> System.out.println(str + " 출력됨");
        consumer.accept("안녕하세요");

        /*Supplier<T>#get() : T : 객체 T를 리턴// 매개변수 x 리턴값 o*/
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);

        /*Function<T,R>#apply(T t) : R : 하나의 입력 T를 받아 출력 R로 변환한다.  // 매개변수 o 리턴값 o*/
        Function<String, Integer> function = (str1)-> Integer.parseInt(str1);
        String str1 = "12345";
        System.out.println(function.apply(str1).doubleValue());  // integer에 해당하는 메서드 사용할 수 있음.

        /*BinaryOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴*/
        BinaryOperator<String> binaryOperator = (str2, str3) -> str2+str3;
        System.out.println(binaryOperator.apply("hello", "world"));

        /*Predciate<T>#test(T t) : boolean : T를 조사하여 boolena을 리턴 */
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인: " + predicate.test("123"));
        System.out.println("문자열인지 확인: " + predicate.test(123));

    }
}
