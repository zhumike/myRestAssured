package demo;
import java.util.Arrays;

//import static jdk.nashorn.internal.objects.Global.print;


//java 数组
public class ArrayTest {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        String ret = Arrays.toString(array); // 将数组转化成字符串存在ret中
        System.out.println(ret); // 打印ret
        Object obj =  "sderff";
        System.out.println( obj instanceof Boolean);

    }

}
