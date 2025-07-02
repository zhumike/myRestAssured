package demo;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/5/21 09:59
 * @Version 1.0
 * @Description ：
 * HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
 * HashSet 允许有 null 值。
 * HashSet 是无序的，即不会记录插入的顺序。
 * HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
 */
import java.util.HashSet;


public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> sets = new HashSet<String>();
        sets.add("Google");
        sets.add("Runoob");
        sets.add("Taobao");
        sets.add("Zhihu");
        sets.add("Runoob");
        System.out.println(sets);

//        判断某个元素是否存在
        System.out.println(sets.contains("Google"));
        System.out.println(sets.contains("zhu"));
        if (sets.size()>10){
            System.out.println("大于10");
        }
        else{
            System.out.println("小于等于10");
        }

        if (sets.contains("Google")){
            System.out.println("存在google");
        }

        for (String i : sets){
            System.out.println(i);
        }

    }
}
