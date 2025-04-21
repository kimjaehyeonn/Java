package lecture.day05;


public class SmartPhoneUse {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("white", "iphone");
        // myPhone: 주소, 참조형변수, 필드들 3개가 저장된 힙영역의 주소
        // 만약 yourPhone 객체 생성 시, 객체마다 각각 저장할 공간 필요.
        // 필드들이 다 무더기로 생성됨(필드 3개가 다 복상되어 생성됨)
        // 원본영역(메서드/static 영역)/stack 영역(호출되는 메서드 변수를 만들어쓰라고 주는 영역) / heap 영역(필드들 생성, 배열리스트)
        System.out.println(myPhone.color); // Phone
        System.out.println(myPhone.model); // Phone
        System.out.println(myPhone.wifi);  //SmartPhone

        myPhone.bell();  // Phone
        myPhone.setWifi(true); // SmartPhone
        myPhone.internet();  // SmartPhone


    }
}
