package practice.test.book;

public class Book {
    // 필드 생성 - author, title, pageCount, coverType
    String author;
    String title;
    int pageCount;
    String coverType;

    // 생성자
    // 반드시 클래스 이름과 동일
    // 반환형 작성X

    // 기본생성자(매개변수가 없는 생성자)
    // 매개 변수가 있는 생성자가 하나라도 있으면 compiler가 자동으로 기본생성자를 만들어주지 않는다.
// 오버로딩
    // -> 같은 일므의 메소드나 생성자를 매개변수의 갯수나 타입에 따라 여러 개 선언하는것.
    public Book() {
        System.out.println("기본생성자 호출함");
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String author, String title) {
        System.out.println("2개");
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, int pageCount, String coverType) {
        System.out.println("4개");
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.coverType = coverType;
    }
    // 메소드

    public String getTitle() {
        System.out.println(title + " 책의 작가는 " + author + "입니다.");
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", coverType='" + coverType + '\'' +
                '}';
    }
}
