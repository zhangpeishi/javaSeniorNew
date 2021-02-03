package day01;

/**
 *
 * 放大问题的发生性
 */
public class testSleep implements Runnable{

    private int ticket = 10;

    @Override
    public void run() {
        while (true) {
            if(ticket <= 0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第 " + ticket-- + " 张票");
        }

    }
    public static void main(String[] args) {
        testSleep ts = new testSleep();
        new Thread(ts,"小明").start();
        new Thread(ts,"张老师").start();
        new Thread(ts,"王姐大大").start();
    }
}
