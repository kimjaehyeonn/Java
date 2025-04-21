package practice.advanced.ch07.exam01;

public class HttpsServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }
    public static void method(HttpServlet httpServlet){
        httpServlet.service();

    }
}
