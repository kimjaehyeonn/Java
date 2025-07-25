package lecture.day08.lombok_practice;


// 메서드 호출시 전달한 데이터를
// 묶어서 전달하기 위해
// 가방을 만들어서 값을 넣어 전달함.
// DTO(Data Transfer Object)/ VO(Value Object)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bag {
    private String name;
    private int age;
}
