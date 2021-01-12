package Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhangpeishi
 * 字符输出流
 * java.io.Writer 所有的字符输出流的顶层父类 是抽象类
 * 共性的成员方法：
 * 我们使用它的子类 FileWriter extends OutputStreamWriter extends Writer
 * FileWriter 的构造方法：
 * public FileWriter(String name)
 * public FileWriter(String name,boolean append)
 * public FileWriter(File f)
 * public FileWriter(File f,boolean append)
 *
 */
public class WriterTest {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("e.txt");
        /*
        fw.write(98);//不会直接写到硬盘中，会将字节字符转换为字节存到内存中，只有调用flush 或者 close方法才会写到硬盘中，这是与字节输出流的区别
        fw.flush();
        fw.close();
        */
        //一次写多个字符
        char [] ch = new char[]{'你','好'};
        fw.write(ch);


        fw.flush();
    }

}
