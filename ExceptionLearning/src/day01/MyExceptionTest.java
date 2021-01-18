package day01;

import java.util.Scanner;

/**
 *
 * 自定义异常练习：
 *  要求：我们模拟注册操作，如果用户名已经存在，则抛出异常并提示：亲，该用户名已经被注册。
 *
 * 步骤：
 *      1.使用数组保存已经注册过的用户名（数据库）
 *      2.使用Scanner获取用户输入的注册的用户名（前端页面）
 *      3.定义一个方法，对用户输入的注册用户名进行判断
 *          遍历数组，获取每一个用户名、
 *          比较  true,false
 *          true: 用户名已经存在 抛出RegisterException 告知用户名已经被注册
 *          false: 继续遍历比较
 *       如果循环结束，则提示 恭喜注册成功
 *
 */
public class MyExceptionTest {
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args) /*throws MyException*/{
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String username = sc.next();
        checkUsername(username);

    }
    //定义一个方法，检验
    public static void checkUsername(String username) /*throws MyException*/ {
        for (String s : usernames) {
            if(s.equals(username)){
                throw new MyException02("该用户被注册了");//运行时异常无需处理，交给jvm处理，中断处理

            }
        }
        System.out.println("恭喜，注册成功");
    }
}
