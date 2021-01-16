package ObjectputStramLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectInputStream extrends InputStream 将文件中的对象读取到内存中
 *
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oip = new ObjectInputStream(new FileInputStream("d.txt"));

        Object o = oip.readObject();

        oip.close();
        System.out.println(o);

    }
}
