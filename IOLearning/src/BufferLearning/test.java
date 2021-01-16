package BufferLearning;

import sun.jvmstat.perfdata.monitor.PerfStringConstantMonitor;

import java.io.*;
import java.util.HashMap;

/**
 *
 * 练习：对文本内容进行排序
 * 步骤：
 *  1.创建一个Map集合对象，可以：存储每行文本的序号（1，2，3..）;value:存储每行的文本
 *  2.创建字符缓冲输入流对象，构造方法中绑定字符输入流
 *  3.创建字符缓冲输出流对象，构造方法中绑定字符输出流对象
 *  4.使用字符缓冲输入流中的方法readLine，逐行读取文本
 *  5.对读取到的文本进行切割，获取行中的序号和文本内容
 *  6.把切割好的序号和文本内容存储到HashMap集合中（key序号是有序的，会自动排序1，2，3
 *  7.遍历HashMap集合，获取每一个键值对
 *  8.把每一个键值对，拼接为一个文本行
 *  9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
 *  10.释放资源
 *
 */
public class test {
    public static void main(String[] args) throws IOException{

        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
//        String []s ;
//        while((s = br.readLine().split("\\.")) != null) {
//
//
//            map.put(s[0], s[1]);
//        }
//        String line;
//        while((line = br.readLine()) != null){
//
//            String arr[] = line.split("\\.");
//            map.put(arr[0],arr[1]);
//        }
//        //System.out.println(map);
//        for(String key:map.keySet()){
//            String value = map.get(key);
//            bw.write(key +"."+value);
//            bw.newLine();
//
//        }
//        bw.close();
//        br.close();


    }
}
