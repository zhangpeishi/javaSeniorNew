import java.io.File;
/**
 *
 * 遍历给定路径下的所有文件和子文件
 *
 */
public class demo03 {
    public static void main(String[] args) {
        File f = new File("./");
        getAllFile(f);
    }
    public static void getAllFile(File file){
        System.out.println(file);
        File []filename  = file.listFiles();
        for(File f:filename){
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                System.out.println(f);
            }

        }

    }
}
