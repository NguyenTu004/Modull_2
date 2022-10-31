package Even_Odd;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Even even = new Even();
        Odd odd = new Odd();
        Thread thread1 = new Thread(even);
        Thread thread2 = new Thread(odd);
        thread1.start();
        thread2.join();
        thread2.start();

    }
}
