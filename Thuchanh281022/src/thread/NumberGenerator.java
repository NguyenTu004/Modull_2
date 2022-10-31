package thread;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator n1 = new NumberGenerator();
        NumberGenerator n2 = new NumberGenerator();
        Thread thread1 = new Thread(n1);
        Thread thread2 = new Thread(n2);
        thread1.start();
        thread2.start();
    }
}
