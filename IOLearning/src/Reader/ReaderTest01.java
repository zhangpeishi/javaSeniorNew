package Reader;

import sun.font.GlyphLayout;

import java.io.FileReader;
import java.io.IOException;

/*
    字符输入流的顶层父类
    FileReader 读取文件的字符输入流
    java.io.Reader extends InputStreamReader extends Reader
 */
public class ReaderTest01 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("a.txt");
        /*

        int len = 0;
        while((len = fr.read() ) != -1) {
            System.out.println((char) len);

        }
        fr.close();
        */

        //多个字符一起读
        char[] chars = new char[2];
        int len = 0;
        while((len = fr.read(chars)) != -1 ){
            System.out.print(new String(chars,0, len));
        }


    }

}
