import java.io.File;

/**
 *
 * FileFilter用来过滤文件对象的
 * 使用FileFilter 优化Demo03中文件搜索的过程
 * FilenameFilter 用于过滤文件名称
 *
 *
 * FileFilter原理：
 * 1.是文件对象过滤器，是一个接口，有一个accept抽象方法 返回布尔值.
 * 2.需要继承FileFilter重写里面的accept方法，例如 public class FileFilterImpl implements FileFilterTest{ 重写accept方法}
 * 3.在file.listFiles(new FileFilterImpl)方法中传递对象new FileFilterImpl。
 * 4.首先file.listFiles会将结果封装成一个一个的File对象，每个对象调用传递的FileFilterImpl类的accept方法，如果返回true，则将此对象返回到
 *   File [] files 数组中，若为false 则过滤掉。
 */
public class FileFilterTest {
    public static void main(String[] args) {
        File file = new File("./");
        getAllFile(file);
    }
    public static void getAllFile(File file){
//        System.out.println(file);
        File [] files = file.listFiles(new FileFilterImpl());
            for(File f : files){
                if(f.isDirectory()){
                    getAllFile(f);
                }else{
                    System.out.println(f);
                }
            }

            }




}
