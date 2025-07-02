package demo;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/5/21 21:44
 * @Version 1.0
 * @Description ：HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
 * HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
 * HashMap 是无序的，即不会记录插入的顺序。
 */
import java.util.HashMap;


public class HashMapTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);

        //    输出key和value值
        for (Integer i : Sites.keySet()) {
            System.out.println("key:" + i + "   value:" + Sites.get(i));
        }
        if (!Sites.isEmpty()) {
            System.out.println("HashMap Sites 不为空");
        }
    }
}
