package lecture.day11.lambda;

@FunctionalInterface // 함수형 이터페이스 설정
// 추상메서드를 하나만 가져야 한다.!
// @(표시, 엣): Annotation.
public interface Calculable {
    // 일반적으로 interface에 선언된 함수는 다 public abstract.
    // 함수형 인터페이스는 추상 메소드 한개만!
    void calculate(int x, int y);}