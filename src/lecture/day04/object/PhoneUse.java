package lecture.day04.object;

public class PhoneUse {
    public static void main(String[] args) {
        Phone phone = new Phone(); // 폰이 메모리에 준비됨.
        // Phone의 실제 대상(object) -> phone
        // 멤버변수가 힙영역에 복사됨.
        // color, price 변수
        // phone에 color, price가 저장된 주소가 들어있음.
        // --> 참조형 변수
        phone.color = "red";
        phone.price = 10;
        System.out.println(phone); //주소 프린트
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.text(); // 객체(인스턴스) 생성 후 메서드 호출하면 동작 가능
        // 자바에서는 객체를 만들고 난 다음에 메서드를 호출함.
        // 메서드만 독립적으로 실행 불가. ex) alert();

        phone.kakao();

        Phone phone1 = new Phone(20,"silver");
        System.out.println(phone1.price);
        System.out.println(phone1.color);

    }

    public static class CalcUse {
            public static void main(String[] args) {
                lecture.day04.object.Phone.Calc calc = new lecture.day04.object.Phone.Calc();

                calc.add(100);
                calc.add(100, 200);
                calc.add("내돈은", 300);

                int result = calc.minus(5000, 4500); //500
                if (result >= 1000) {
                    System.out.println("더 쓰자.");
                } else {
                    System.out.println("그만 쓰자");
                }

                // int result2 = calc.add(100);
                // void인 경우 변수에 저장할 값이 없음!
                //System.out.println(calc.add(300));
                // void인 경우 프린트할 값이 없음
            }
        }
}
