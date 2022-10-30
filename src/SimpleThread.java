public class SimpleThread extends Thread {

    private int counter = 0;
    private String name;


    public SimpleThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        initThread();
    }

    public void initThread() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " : " + " our counter is - " + counter++ + " " + Thread.currentThread().getName());
        }
    }
}
