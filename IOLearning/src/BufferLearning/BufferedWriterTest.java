package BufferLearning;
/**
 *
 * 两个构造方法
 * 特有的成员方法：
 *
 * void newLine() 写一个行分隔符 会根据不同的操作系统，获取不同的行分隔符
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("你好你好");
            bw.newLine();
        }


        bw.close();
    }
}
