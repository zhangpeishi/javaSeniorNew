package day01;

/**
 * @author zhangpeishi
 * 设置一个标志位，使线程自己停止
 */
public class StopMethod implements Runnable{
    boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while(flag){
            System.out.println("Thread "+ i++);
        }
    }

    /**
     * stop方法
     */
    public void stop(){
        this.flag = false;
    }


    public static void main(String[] args) {
        StopMethod sm = new StopMethod();
        new Thread(sm).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程 "+i);
            if(i == 999){
                //调用stop方法
                sm.stop();
                System.out.println("该线程停止了");
            }


        }
    }
}
