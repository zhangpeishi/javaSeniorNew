package day02;

public class testPriority implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName()+i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        testPriority tp = new testPriority();
        Thread thread1 = new Thread(tp,"线程一");
        Thread thread2 = new Thread(tp,"线程二");
        Thread thread3 = new Thread(tp,"线程三");
        Thread thread4 = new Thread(tp,"线程四");

        thread1.setPriority(1);
        thread2.setPriority(4);
        thread3.setPriority(7);
        thread4.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
