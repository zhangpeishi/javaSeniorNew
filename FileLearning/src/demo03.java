import java.io.File;
/**
 *
 * 遍历给定路径下的所有文件和子文件
 * 结果只要.java结尾的文件
 *
 */
public class demo03 {
    public static void main(String[] args) {
        File f = new File("./");
        getAllFile(f);
    }
    public static void getAllFile(File file){
//        System.out.println(file);
        File []filename  = file.listFiles();
        for(File f:filename){
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                //1.把文件转换为字符串类型,三种方法都可以
                String name = f.getName();  //只返回文件名称
                //把字符串转换为小写
                name = name.toLowerCase();
//                f.getPath();  返回路径
//                f.toString(); 返回路径
                //2.调用String类中的方法endWith判断字符串是否以.java结尾
                boolean b = name.endsWith(".java");
                if(b) {
                    System.out.println(f);
                }
            }

        }

    }
}

