package propertiiesLearning;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author zhangpeishi
 * Properties extends Hashtable<k,v> implements Map<k,v>
 * Properties类表示了一个持久的属性集。Properties 可保存在流中或从流中加载
 * Properties集合是一个唯一和IO流相结合的集合
 *  可以使用Properties集合中的方法store,把集合中的临时数据，持久化写入到硬盘中存储
 *  可以使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用。
 *
 *  属性列表中每个键及其对应值都是一个字符串
 *  Properties集合 是双列集合 key和value默认都是字符串 不用再写泛型
 *
 */
public class storemethodTest {
    public static void main(String[] args) throws IOException{
        show01();

    }
    /*
        使用Properties集合存储数据,遍历取出Properties集合中的数据
        有一些操作字符串的特有方法
            Object setProperty(String key,String value) 调用 Hashtable 的方法put.
            String getProperty(String key) 通过key找到value值，此方法相当于Map集合中的get(key).
            Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，此方法相当于Map集合中的keySet方法



     */
    public static void show01() throws IOException{

        Properties prop = new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("古力娜扎","165");
        prop.setProperty("焦淑婷","155");
        /**
        //使用stringPropertyNames把Properties集合中的键取出，存储到一个Set集合中


        Set<String> set = prop.stringPropertyNames();

        //遍历Set集合，取出Properties集合的每一个键
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+" = "+value);
         */
        //字符流可以写中文 字节流不可以写中文
        //void store(OutputStream outStream)不能写出中文，否则会乱码
        //void store(Writer writer)
        FileWriter fw = new FileWriter("g.txt");
        prop.store(fw,"save data");
        fw.close();
        }

    }


