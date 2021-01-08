package FileOutInput;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 数据的追加写和换行写
 * FileOutputStream的两个构造方法：public FileOutputStream(String name, boolean append)；public FileOutputStream(File file)；
 * boolean append 追加写开关
 * 如果不追加写 每次new一个File都要覆盖掉之前的文件
 *
 * 写换行
 * Windows: \r\n
 * linux \n
 * mac \r
 *
 */

public class OutputStreamTest03 {


    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(new File("b.txt"),true);
//        fos.write(97);
        for (int i = 0; i <10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();

    }
}
