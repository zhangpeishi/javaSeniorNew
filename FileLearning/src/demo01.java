import java.io.File;
import java.io.IOException;

/**
 * File的静态方法
 * File的构造方法 3个
 * File 的常用方法
 */
public class demo01 {
    public static void main(String[] args) throws IOException{
        show();
    }

    public static void show() throws IOException{
        //构造方法
        File f1 = new File("a.txt");
        System.out.println(f1);
        File parent = new File("//Users//zhangpeishi//");
        File f2 = new File(parent,"Desktop");
        System.out.println(f2);
        File  f3 = new File("//Users//zhangpeishi//","Desktop//1//2.txt");
        System.out.println(f3);

        //方法
        String abpath = f1.getAbsolutePath();
        System.out.println(abpath);

        //..............
        System.out.println(f3.exists());
        //创建文件,文件夹方法
        System.out.println(f1.createNewFile());
        System.out.println(f3.mkdirs());
        //删除文件 文件夹，返回值都是Boolean  直接从硬盘删除 不会走回收站
        System.out.println(f1.delete());

    }
}
