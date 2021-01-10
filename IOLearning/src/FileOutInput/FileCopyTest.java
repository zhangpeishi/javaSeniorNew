package FileOutInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhangpeishi
 * 文件复制练习:一读一写
 * 文件复制步骤：
 *  创建字节输入流
 *  创建字节输出流对象 ，构造方法中写入目的地
 *  使用字节输入流对象read()方法
 *  使用字节输出流对象write()
 *  关闭流资源
 */
public class FileCopyTest {
    public static void main(String[] args) throws IOException{

        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("c.txt");
        FileOutputStream fos = new FileOutputStream("d.txt");

//        int len = 0;
//        while((len = fis.read()) != -1){
//            fos.write(len);
////            System.out.println(len);
//        }

        //优化： 数组缓冲读取
        int len = 0;
        byte [] bytes  = new byte[1024];
        while((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        };
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("程序执行共耗费 "+(e-s)+"毫秒");


    }
}
