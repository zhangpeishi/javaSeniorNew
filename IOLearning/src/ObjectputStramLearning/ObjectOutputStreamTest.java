package ObjectputStramLearning;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));

        oos.writeObject(new Person("焦淑婷",18));

    }

}
