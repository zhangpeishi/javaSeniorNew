package InputStreamReaderLearning;

import java.io.*;

/**
 * @author zhangpeishi
 * 练习：转换文件编码：
 *  将GBK编码的文件，转换为UTF-8编码的文件。
 * 案例分析：
 *  1.指定GBK编码的转换流，读取文本文件
 *  2.使用UTF-8编码的转换流，写出文本文件
 *  步骤：
 *      1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
 *      2.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
 *      3.使用read方法读取文件
 *      4.使用write方法，把读取的数据写入到文件中
 *      5.释放资源
 *
 */


public class test02 {
    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"),"utf-8");

        int len = 0;
        while((len = isr.read()) != -1){
            osw.write(len);
        }
        osw.close();
        isr.close();

    }
}
