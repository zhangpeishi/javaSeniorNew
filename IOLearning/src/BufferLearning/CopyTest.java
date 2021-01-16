package BufferLearning;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;

/**
 * @author zhangpeishi
 * 使用缓冲流实现文件复制
 * 步骤：
 *  1.创建字节缓冲输入流对象，构造方法中传递字节输入流
 *  2.创建字节缓冲输出流对象，构造方法中传递字节输出流
 *  3.使用字节缓冲输入流对象的read()方法，读取文件
 *  4.使用字节缓冲输出流对象的write()方法，将文件内容读取到内存缓冲区中
 *  5.释放资源（先flush，后关闭资源）
 */
public class CopyTest {
    public static void main(String[] args) throws IOException{

        long s = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("i.txt"));

        int len = 0;
        while((len = bis.read()) != -1){
            bos.write(len);
            System.out.println((char)len);

        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();

        System.out.println("程序共耗费"+(e-s)+"毫秒");
    }
}
