import java.io.File;
import java.io.FilenameFilter;

/**
 * 学习 使用Lambda表达式优化匿名内部类 （接口中只有一个抽象方法）
 */

public class FilenameFilterTest02 {
    public static void main(String[] args) {
        File file = new File("./");
        getAllFile(file);
    }
    public static void getAllFile(File file){
//        System.out.println(file);
//        File [] files = file.listFiles((File dir,String name)->{
//            return(new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java"));
//        });

        File [] files1  = file.listFiles((dir,name)->(new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java")));
            for(File f : files1){
                if(f.isDirectory()){
                    getAllFile(f);
                }else{
                    System.out.println(f);
                }
            }

            }




}
