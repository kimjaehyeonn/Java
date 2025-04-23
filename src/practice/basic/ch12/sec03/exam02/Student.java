package practice.basic.ch12.sec03.exam02;


public class Student {
    private int no;
    private String name;

    // 필드 초기화 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    //getter

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    //setter

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }
}
