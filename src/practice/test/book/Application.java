package practice.test.book;

public class Application {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.title = "채식주의자";
        myBook.author = "한강";
        myBook.coverType = "하드커버";
        myBook.pageCount = 320;

        // 다른 객체
        Book myBook2 = new Book();
        myBook2.title = "흰";
        myBook2.author = "한강";
        myBook2.coverType = "하드커버";
        myBook2.pageCount = 210;

        myBook.getTitle();
        myBook2.getTitle();

        System.out.println(myBook2.toString());

        Book myBook3 = new Book("영");

        System.out.println(myBook3);

    }
}
