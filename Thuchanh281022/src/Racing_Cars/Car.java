package Racing_Cars;

import java.util.Random;

public class Car implements Runnable{
    private static final double DISTANCE = 100;
    private static final int STEP = 16;
    private String name;
    public Car(String name){
        this.name = name;
    }
    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = (int) ((runDistance * 100) / DISTANCE);
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }

    public static void main(String[] args) {
        Car car1 = new Car("A");
        Car car2 = new Car("B");
        Car car3 = new Car("C");
        Thread t1 = new Thread(car1);
        Thread t2= new Thread(car2);
        Thread t3 = new Thread(car3);

        t1.start();
        t2.start();
        t3.start();
    }
}
