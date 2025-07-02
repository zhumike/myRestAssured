package errorDemo;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/4/28 20:58
 * @Version 1.0
 * @Description ：异常捕获并打印
 */
import java.io.*;
public class ExcepTest{

    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("越界异常了  :" + e);
        }
        System.out.println("Out of the block");
    }
}
