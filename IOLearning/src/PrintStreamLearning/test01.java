package PrintStreamLearning;

import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * java.io.PrintStream:打印流
 *  为其他输出流添加了功能，使他们能够方便的打印各种数据值表示形式
 *  PrintStream的特点：
 *      1.只负责数据的输出，不负责数据的读取
 *      2.与其他输出流不同，永远不会抛出IOException
 *      3.特有的方法：print,println
 *          void print(任意类型的值）
 *          void println(任意类型的值并换行)
 *  构造方法：
 *      PrintStream(File file):输出的目的地是一个文件
 *      PrintStream(OutputStream out)：输出的目的地是一个字节输出流
 *      PrintStream(String fileName):输出的目的地是文件名
 *
 *  extends OutputStream
 *  拥有继承自父类的成员方法： close flush write
 *
 *  注意：
 *      如果使用继承自父类的write方法写数据，那么查看数据时会查询编码表 97->a
 *      如果使用自己特有的方法print/println方法写数据，写的数据原样输出 97->97
 *
 */
public class test01 {
    public static void main(String[] args) throws IOException{
        PrintStream ps = new PrintStream("f.txt");

//        ps.write(97);
//        ps.close();

        ps.print(97);
        ps.close();


    }
}
