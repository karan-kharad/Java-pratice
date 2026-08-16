package thread;

public class MyThread extends Thread {

    public MyThread(String name, int newpriority){
        super(name);
        setPriority(newpriority);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
    }


    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread 1", 3);
        MyThread t2 = new MyThread("Thread 2", 7);
        MyThread t3 = new MyThread("Thread 3", 5);
        MyThread t4 = new MyThread("Thread 4", 8);
        MyThread t5 = new MyThread("Thread 5", 2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try{
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
