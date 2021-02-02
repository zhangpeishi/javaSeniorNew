package day01;

/**
 *
 * 用lambda实现的接口只能有一个方法，简称函数式接口
 * 接口的这个方法内只有一行代码的话可以省略大括号，只有一个参数的话可以省略小括号
 * 多个参数可以去掉参数类型，要去掉都去掉
 */
public class lambda {


    public static void main(String[] args) {

        ILove love = null;
        /*
        love = (a)->{
            System.out.println("i love "+ a);
        };
        */
        love = a -> System.out.println("i love "+ a);

        love.love(3);

    }


    interface  ILove{

        void love(int a);
    };

}
