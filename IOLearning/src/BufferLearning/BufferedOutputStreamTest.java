package BufferLearning;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException{

        FileOutputStream fos = new FileOutputStream("h.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("把数据提交到内部缓冲区".getBytes());
        bos.flush();
        bos.close();

    }
}
