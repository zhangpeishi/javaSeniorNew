import java.io.File;

/**
 * File的静态方法
 * File的构造方法 3个
 * File 的常用方法
 */
public class demo01 {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        //构造方法
        File f1 = new File("a.txt");
        System.out.println(f1);
        File parent = new File("//Users//zhangpeishi//");
        File f2 = new File(parent,"Desktop");
        System.out.println(f2);
        File  f3 = new File("//Users//zhangpeishi//","Desktop//1.txt");
        System.out.println(f3);

        //方法
        String abpath = f1.getAbsolutePath();
        System.out.println(abpath);

        //..............
        System.out.println(f3.exists());
        //创建文件方法


    }
}
