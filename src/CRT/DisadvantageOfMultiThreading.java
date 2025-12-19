package CRT;

class Printer implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " printing started");

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is printing");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Some problem in printing");
            }
        }

        System.out.println(name + " printing finished");
    }
}

public class DisadvantageOfMultiThreading {

    public static void main(String[] args) {

        Printer p = new Printer();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);

        t1.setName("Nari");
        t2.setName("Rani");
        t3.setName("Suman");

        // START threads
        t1.start();
        t2.start();
        t3.start();
    }
}
