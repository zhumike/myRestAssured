package demo;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/4/28 21:18
 * @Version 1.0
 * @Description ： ArrayList 类是一个可以动态修改的数组，
 * 与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素
 */

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> demosites = new ArrayList<String>();
        demosites.add("d1");
        demosites.add("d2");
        demosites.add("d3");
        demosites.add("e4");
        demosites.add("f5");
        System.out.println(demosites);
        System.out.println("动态字符数组长度为："+demosites.size());
        Collections.sort(demosites);//排序
        for (String member:  demosites){
            System.out.println(member);
        }
    }

}
