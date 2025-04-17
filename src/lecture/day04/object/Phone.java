package lecture.day04.object;

public class Phone {
    // 멤버변수, 필드
    //클래스 내에서 선언되었으므로 클래스 전체 영역에서 사용 가능
    //멤버변수는 자동 초기화
    //기본형은 0, 0.0, false등으로 초기화
    //참조형은 null로 초기화
    String color;
    int price;

    // 필드를 초기화 목적 --> 생성자(constructor)
    // 기본 생성자
    // 만약에 생성자가 하나도 없으면
    // 컴파일러가 기본생성자를 넣어줌
    // new Phone();
    // 동일한 이름으로 생성자 메서드를 여러개 만들 수 있음.
    // 메서드 오버로딩
    public Phone() {
        System.out.println("전화기가 만들어짐");
    }

    // 객체 생성 시 필드 자동 초기화
    public Phone(int price, String color) {
        this.price = price;
        this.color = color;
    }

    // 멤버 메서드
    public void text() {
        System.out.println("문자 보내기");
    }

    public void kakao() {
        System.out.println("카톡");
    }

    public static class Calc {
        //계산기

        //필드나 메서드가 없을 수도 있음.
        //생성자가 하나도 없는 경우 컴파일시 자동으로 생성해줌.
        //기본 생성자
        //    public Calc(){
    //        //처리내용은 비어있는 생성자 자동 생성됨.
    //    }

        //메서드는 같은 이름으로 여러개 쓸 수 있다.
        //오버로딩 : 하나의 동일한 이름으로 부를 수 있다라는 의미
        //단, 입력 매개변수의 순서, 개수, 타입이 달라야 한다.
        //반환값을 가지고 오버로딩을 구분하지 않음.
        //void는 리턴값이 없다라는 의미
        //(해당 메서드의 결과를 리턴하지 않는다라는 의미)
        public void add(int x){
            System.out.println(x + 100);
        }
        public void add(int x, int y){
            System.out.println(x + y);
        }
        public void add(String x, int y){
            System.out.println(x + "가 입력한 값은 " + y + "원임.");
        }

        //리턴해야 하는 경우
        //void대신 return키워드 뒤에 오는 데이터의 타입을 써줌.
        public int minus(int x, int y){
            return x - y; //return되는 데이터의 타입은 int
        }
    }
}
