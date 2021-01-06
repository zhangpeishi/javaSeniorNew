import java.io.File;

/**
 *
 * 文件目录的遍历
 */
public class demo02 {


    public static void main(String[] args) {
        show1();
    }

    private static void show1(){
        File f1 = new File("./");
        String[] arr = f1.list();
        for (String filename : arr){
            System.out.println(filename);
        }
        System.out.println("-----------------");
        File [] files = f1.listFiles();
        for (File file : files){
            System.out.println(file);
        }
    }
}
