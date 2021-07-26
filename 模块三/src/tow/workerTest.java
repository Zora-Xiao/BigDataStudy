package tow;

import java.util.ArrayList;
import java.util.List;

public class workerTest {
    public static void main(String[] args) {
        //Worker work=new Worker();
        List<Worker> Workerlist=new ArrayList<>();
        Workerlist.add(new Worker("凤姐",18,20000));
        Workerlist.add(new Worker("欧阳锋",60,8000));
        Workerlist.add(new Worker("刘德华",40,30000));
        Workerlist.add(1,new Worker("张柏芝",35,3300));
        Workerlist.remove(Workerlist.size()-1);
        for (Worker worker:Workerlist) {
           // work.setName(worker.getName());
            System.out.println(worker);
            worker.work();
            System.out.println("------------------------");
        }
    }
}
