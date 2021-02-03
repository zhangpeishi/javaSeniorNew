package day01;

public class TestStop extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程一 :" + i);
        }

    }

    public static void main(String[] args) {

        TestStop ts = new TestStop();

        ts.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 ：" + i);
       }
    }
}
