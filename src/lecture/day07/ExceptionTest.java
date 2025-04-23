package lecture.day07;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("1.나는 프린트가 잘 될 예정");

        // 실행할 때 에러가 발생해서 중단될 예정
        try {
            System.out.println("2. 문제 발생 코드" + 10/0);
        } catch (Exception e) {
            // 에러 발생했을 때 처리 내용
            System.out.println("에러 발생!!!");
            e.printStackTrace(); // 자세하게 에러정보 추적해서 프린트
            System.out.println(e.getMessage()); // 간단하게 에러정보 프린트
         } finally {
            // db, network, file, cpu 연결 통로(stream)를 만든 경우, 닫아주는 코드 작성.
            System.out.println("에러발생 유무와 상관 없이 무조건 실행");
        }

        System.out.println("3. 나는 프린트 될 수 있을가?");
    }
}
