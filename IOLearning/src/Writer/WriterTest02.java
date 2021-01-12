package Writer;

import sun.tools.tree.FinallyStatement;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 续写和换行
 */
public class WriterTest02 {
    public static void main(String[] args) throws IOException{
        /*
        FileWriter fw = new FileWriter("f.txt",true);

        for (int i = 0; i < 10; i++) {
            fw.write("张先生");
            fw.write("\r");

        }
        fw.flush();
        fw.close();
        */
        //使用try catch 处理
        FileWriter  fw = new FileWriter("f.txt");
        try{

            char [] ch = {'A','B'};
            for (int i = 0; i < 10; i++) {
                fw.write(ch);
            }

        }catch(IOException e){
            System.out.println(e);

        }finally{
            fw.close();
        }

    }
}
