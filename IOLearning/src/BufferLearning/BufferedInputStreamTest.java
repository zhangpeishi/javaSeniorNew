package BufferLearning;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *@author zhangpeishi
 * java.io.BufferedInputStream extends InputStream 字节缓冲输入流
 * 除了继承自父类的方法。。。
 *
 * 构造方法有两个
 *  BufferedInputStream(InputStream in)
 *  BufferedInpurStream(InputStream in, int size)创建指定缓冲区大小的字节缓冲输入流
 *  参数：
 *  InputStream in ： 可以传FileInputStream 为文件字符输入流创建内存缓冲区 提高效率
 *  int size : 内存缓冲区的大小
 *
 * 使用步骤：
 * 1.创建文件字符输入流对象，指定写入目的地
 * 2.创建文件缓冲字符输入流对象，参数写第一步创建的文件字符输入流对象
 * 3.调用read()方法
 * 4.释放资源
 *
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        /*
            int len = 0;
            while((len = bis.read()) != -1){
                System.out.println(len);
            }
        */
        byte [] bytes = new byte[1024];
        int len = 0;//记录每次读取的有效字符个数
        while((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        bis.close();

    }
}
