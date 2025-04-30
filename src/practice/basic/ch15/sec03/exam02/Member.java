package practice.basic.ch15.sec03.exam02;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
/*HashSet은 객체가 중복되는지 판단할 때 두 단계로 확인

1. 먼저 hashCode() 메소드를 호출하여 해시코드가 같은지 비교
2. 해시코드가 같으면 equals() 메소드로 내용이 같은지 비교
*/
public class Member {
    public  String name;
    public int age;
}
