package practice.test.base.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        /*
        * String: 문자열 변경이 일어나면 기존 인스턴스를 수정하는 것이 아니라 새로운 인스턴스를 반환
        *
        * StringBuilder: 문자열에 append() 메소드를 통해 기존 인스턴스 수정
        *
        * => 자주 바뀌는 문자열은 StringBuilder 쓰자.
        * */
        StringBuilder sb = new StringBuilder("java");

        System.out.println("sb=" + sb);

        System.out.println("sb의 해쉬코드=" + sb.hashCode());

        sb.append("oracle");

        System.out.println("append 이후 sb=" + sb);

        System.out.println("append 이후 sb의 해쉬코드=" + sb.hashCode());

        /*
        * delete(): 시작 인덱스와 종료 인덱스를 이용해 문자열에서 원하는 부분 제거
        * deleteChartAt(): 문자열 인ㄷ게스를 이요해서 문자 하나 제거
        * */
        System.out.println("delete():" + sb.delete(2,5));
        System.out.println("sb= "+ sb);

        /*
        * insert(): 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스에 추가
        * */
        System.out.println("insert():" + sb.insert(1,"vao"));

        /*
        * reverse()*/
        System.out.println("revers(): "+ sb.reverse());
    }
}
