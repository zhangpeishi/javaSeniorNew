import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * java.io.OutputStream 抽象类 是所有字节输出流的顶级父类
 * 定义了一些子类共性的成员方法
 * public void close():关闭此输出流并释放与此流相关联的任何系统资源
 * public void flush()：刷新此输出流并强制任何缓冲的输出字节被写入
 * public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流
 * public void write(byte[] b,int off,int len)：从指定的字节数组写入 len 字节，从偏移量off开始输出到此输入流。
 * public abstract void write(int b)：将指定的字节输出流。
 * 由于它是抽象类，所以我们不能创建实例，只能使用它的子类
 * 这里重点练习FileOutputStream类-->往文件中写数据，从内存写入硬盘的文件中
 * FileOutputStream extends OutputStream 文件字节输出流
 *
 */

public class OutputStreamTest {

    /**
     * 两种构造方法：
     * public FileOutputStream(String name)
     * public FileOutputStream(File file)
     * 构造方法的作用：
     *  1.创建 向指定目的地写数据 的文件输出字节流
     *  2.根据参数给出的路径/文件 创建空文件
     *  3.把FileOutputStream对象指向这个文件
     *写入数据的原理
     * java程序-->jvm-->os-->os调用写入数据
     * 文件字节输出流的写入步骤（重点）
     *  1.创建 向指定目的地写数据 的文件输出字节流
     *  2.调用write方法
     *  3.释放资源 ，使用流会占用内存
     *
     */
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("a.txt");// String name,File f 都是我们写入数据的目的地
        fos.write(97);//写入一个字节
        fos.close();
    }

}
