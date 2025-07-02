package demo;

import java.util.*;
import java.text.*;
import java.time.Instant;

public class TimeTest {
    public static void main(String[] args) {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));
        long datalong = Instant.now().getEpochSecond();
        System.out.println("当前时间秒数为: " + datalong);


    }
}
