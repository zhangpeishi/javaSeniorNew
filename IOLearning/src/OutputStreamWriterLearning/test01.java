package OutputStreamWriterLearning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zhangpeishi
 * java.io.OutputStreamWriter extends Writer
 * 字符通向字节的桥梁，可以指定编码表把字符转换为字节
 *
 * 有Writer的共性方法
 * 构造方法：
 *  OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter
 *  OutputStreamWriter(OutputStream out,String charsetName)创建使用指定字符编码的 OutputStreamWriter
 *
 *  参数：
 *      OutputStream out:字节输出流，可以用来写转换之后的字节到文件中
 *      String charsetName：编码表名称，不区分大小写 utf-8,GBK 都可以 不指定默认使用IDE默认编码
 *
 *  流的使用步骤：
 *      1.创建对象，构造方法中传递
 *      2.使用write，把字符转换为字节存储到缓冲区中
 *      3.使用flush方法，刷新
 *      4.资源释放
 */
public class test01 {
    public static void main(String[] args) throws IOException{
        write_utf_8();
    }

    private static void write_utf_8() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"),"gbk");
        osw.write("你好");
        osw.flush();
        osw.close();

    }
}
