package day02;

/**
 * 模拟延时
 */
public class testyield implements Runnable{


    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"开始执行");
        Thread.yield();
        System.out.println("线程"+Thread.currentThread().getName()+"执行结束");

    }

    public static void main(String[] args) {
        testyield ty = new testyield();
        new Thread(ty,"线程一").start();
        new Thread(ty,"线程二").start();

    }
}
