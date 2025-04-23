package practice.test.excep.section3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        // BufferedReader: 파일을 읽어오는 클래스
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("Java/hello.txt"));

            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }
            // catch 블럭을 여러개 작성할 대
            // 상위 타입이 하단에 오고
            // 후손 타입이 상단에 온다.

        } catch (FileNotFoundException e) {

            System.out.println("FilenotFoundException 발생!");
        }
        catch (IOException e)   {

            System.out.println("IOException 발생!");
        }

    }
}
