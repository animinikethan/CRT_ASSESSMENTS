package CRT;

class Demo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("User Thread is executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Some problem occurred");
            }
        }
    }
}

class Demo2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Daemon Thread is executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Some problem occurred");
            }
        }
    }
}

public class TypesOfThreads {
    public static void main(String[] args) {
        System.out.println("Main() started executing");

        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();

        d2.setDaemon(true); // Daemon thread

        d1.start(); // User thread
        d2.start(); // Daemon thread

        System.out.println("Main() stopped working");
    }
}
