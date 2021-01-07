import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 学习 使用FilenameFileter匿名内部类 优化文件搜索功能
 */

public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File("./");
        getAllFile(file);
    }
    public static void getAllFile(File file){
//        System.out.println(file);
        File [] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java")){
                    return true;
                }
                return false;
            }
        });
            for(File f : files){
                if(f.isDirectory()){
                    getAllFile(f);
                }else{
                    System.out.println(f);
                }
            }

            }




}
