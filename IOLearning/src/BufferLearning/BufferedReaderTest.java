package BufferLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * 特有的成员方法
 *  String readLine()读取一个文本行，读取一行数据
 *  行的终止符：下列字符之一即可认为某行已经终止 换行\n 回车\r 或者 回车跟着换行 \r\n
 *  返回值：
 *      包含该行内容的字符串，不包含任何终止符，如果已达到末尾，则返回null
 *
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String s = br.readLine();
        while(s != null){

            System.out.println(s);
            s = br.readLine();
        }
        br.close();


    }
}
