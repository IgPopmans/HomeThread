public class App {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread("Java");
        SimpleThread simpleThread1 = new SimpleThread("PHP");
        SimpleThread simpleThread2 = new SimpleThread("Json");
        SimpleThread simpleThread3 = new SimpleThread("python");

        simpleThread.start();
        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();

        try {
            simpleThread.join();
            simpleThread1.join();
            simpleThread2.join();
            simpleThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Main");
    }
}
