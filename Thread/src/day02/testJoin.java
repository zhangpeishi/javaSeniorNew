package day02;

/**
 *
 * 测试插队
 *
 */
public class testJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("vip" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        testJoin tj = new testJoin();
        Thread t1 = new Thread(tj);
        t1.start();
        for (int i = 0; i < 100; i++) {
            if(i == 10){
                t1.join();
            }
            System.out.println("主线程："+ i);
        }
    }
}
