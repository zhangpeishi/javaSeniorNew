import java.io.File;
import java.io.FileFilter;

/**
 * 使用匿名内部类 优化文件搜索功能
 */

public class FileFilterTest02 {
    public static void main(String[] args) {
        File file = new File("./");
        getAllFile(file);
    }
    public static void getAllFile(File file){
//        System.out.println(file);
        File [] files = file.listFiles(new FileFilter() {
            //写过滤规则
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return  true;
                }
                return pathname.toString().toLowerCase().endsWith(".java");
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
