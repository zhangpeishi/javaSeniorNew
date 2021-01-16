package InputStreamReaderLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * java.io.InputStreamReader extends Reader
 *
 * 有继承自父类的方法
 *
 * 构造方法两个
 */
public class test01 {
    public static void main(String[] args) throws IOException{
        read_gbk();
    }

    private static void read_gbk() throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("c.txt"),"gbk");

        int len = 0;
        while((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();

    }
}
