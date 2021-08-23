package Three;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;doux

public class StudentMapTest {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<Student,String>();
        map.put(new Student("张三",12),"北京");
        map.put(new Student("李四",13),"重庆");
        map.put(new Student("王五",11),"河北");

        //对于利用四种方式遍历循环，是指是通过for循环、while、迭代器、for each吗?
        //第一种for each map.key
        System.out.println("-----------------第一种for each---------------------");
        for (Student key:map.keySet()){
          System.out.println(key+":"+map.get(key));//
        }
        System.out.println("-----------第二种迭代器--------------");
        //第二种迭代器
        Iterator<Map.Entry<Student, String>> it = map.entrySet().iterator();
        while(((Iterator) it).hasNext()){
            Map.Entry<Student, String> entry = it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("------------------for循环--------------------");
        //第三种 for循环
        for (Map.Entry<Student, String> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        System.out.println("------------------for循环--------------------");
        //第四种 Map.Value 拿不到Key 的值
        for (Object o:map.values()) {
            System.out.println(o);
        }
    }
}
