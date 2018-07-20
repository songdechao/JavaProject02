package com.sjzc.java;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


/**
 *
 * 自动生成变量值：alt+shift+l或者alt+enter(idea)
 * 向下复制一行：alt+ctrl+down
 * sout快捷键生成(idea)： System.out.println()
 * 查看继承F4
 * 返回到前一个编辑的页面：alt+left
 * 进入到下一个编辑：alt+right
 * 格式化代码：ctrl+shift+f
 * 提示方法参数类型：alt+ctrl+/
 * 重构修改变量名与方法名：alt+shift+r
 * 大小写切换：ctrl+shift+y
 *
 */

public class HelloWorld {

    private static final int INITIALSIZE = 10 ;

    public static void main(String[] args) {
        //fgghbf
        System.out.println("司法考试了");
        //shift+enter:切换到下一行
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("张三", 23));
        boolean r1 = list.contains(new Customer("张三", 23));
        System.out.println(r1);

        Map map = new ConcurrentHashMap();
        //HashMap
//            Map<String,Customer> map = new HashMap<>();
        map.put("c1", new Customer("zs", 24));
        map.put("c2", new Customer("zs", 23));
        //sout快捷键
        System.out.println();
        System.out.println();

        System.out.println();
        Set<Map.Entry<String, Customer>> entries = map.entrySet();
        for (Map.Entry<String, Customer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            System.out.println(entry.getValue().hashCode());
        }

        Set<Customer> set = new HashSet<>();
        set.add(new Customer("zs", 20));
        set.add(new Customer("li", 21));
        set.add(new Customer("zs", 20));

        for (Customer c : set
                ) {
            System.out.println(c + "," + c.hashCode());
        }

        testHashSet();

    }


    public static  void testHashSet() {

        ArrayList<Object> objects = new ArrayList<>();


    }

    //注：加入@Test时，需要加入jar包；光标放到Test上,alt +enter即可
    @Test
    private String test01() {


        return "";
    }

}
