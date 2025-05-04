package practice.advanced.ch14;

public class ThreadExample {
    public static void main(String[] args) {
        Thread movie = new Thread(new MovieThread());
        Thread Music = new Thread(new MusicThread());
        movie.start();
        Music.start();


    }
}
