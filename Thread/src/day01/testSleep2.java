package day01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 模拟倒计时
 */
public class testSleep2 {

    public static void main(String[] args) throws InterruptedException{
//        System.out.println("=========倒计时开始=======");
//        tenDown();
//        System.out.println("=======焦淑婷我爱你=============");

        Date startTime = new Date(System.currentTimeMillis());
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("hh:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public  static void tenDown() throws InterruptedException{
        int num = 10;
        while(true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0){
                break;
            }

        }
    }
}
