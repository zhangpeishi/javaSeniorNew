package propertiiesLearning;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * 把硬盘中的文件读到内存使用
 * void load(InputStream inStream) 不能写入中文 否则会乱码
 * void load(Reader reader)
 */
public class loadmethodTest {
    public static void main(String[] args) throws IOException{
        show02();
    }

    private static void show02() throws IOException{
        /**
         *
         * 注意：
         *  1.存储键值对的文件中，键与值默认的连接符号可以使用=，空格
         *  2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会被读取
         *  3.存储键值对的文件中，键与值默认都是字符串，不用再加引号
         */
        Properties prop = new Properties();
        FileReader fr = new FileReader("g.txt");
        prop.load(fr);
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+ " = "+ value);
        }


    }

}
