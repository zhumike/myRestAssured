package demo;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/5/21 09:40
 * @Version 1.0
 * @Description ： *与 ArrayList 相比，LinkedList 的增加和删除的操作效率更高，
 * 而查找和修改的操作效率较低。
 * 以下情况使用 LinkedList :
 * 你需要通过循环迭代来访问列表中的某些元素。
 * 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
 */

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("hello");
        sites.add("wuhan");
        sites.add("tianjin");
        sites.addFirst("beijin");
        sites.addLast("hangzhou");
        System.out.println(sites);
        sites.removeFirst();
        System.out.printf("移除首元素后的列表为:%s,长度为%d \n", sites, sites.size());
        sites.removeLast();
        System.out.printf("移除尾元素后的列表为:%s,长度为%d \n", sites, sites.size());

        for (String mem : sites) {
            System.out.println(mem);
        }
    }
}
