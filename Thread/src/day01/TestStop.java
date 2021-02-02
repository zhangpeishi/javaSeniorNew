package day01;

public class TestStop implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程一 :" + i);
        }

    }

    public static void main(String[] args) {

        TestStop ts = new TestStop();
        Thread t1 = new Thread(ts);
        t1.start();
//        for (int i = 0; i < 100; i++) {
//            System.out.println("主线程 ：" + i);
//       }
    }
}
