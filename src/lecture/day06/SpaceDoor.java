package lecture.day06;

public class SpaceDoor extends Door{
    public boolean night = false; // 저녁 여부

    @Override
    public void open() {
        if (night){
            System.out.println("문을 리모컨으로 열다");
        } else {
            super.open();
        }
    }
}
