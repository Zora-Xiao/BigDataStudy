import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class InputIOFile {
    public static void main(String[] args) {
        //System.out.println("sdf ");
        //定义一个集合
        ArrayList<String> arrayList=new ArrayList<String>();
        // //创建文件
        File fe = new File("./模块四/two/abc.txt");
         //不存在即创建
         if (!fe.exists()) {
            try {
                 fe.createNewFile();
            } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         System.out.println(fe.getParent());
        Scanner sc=new Scanner(System.in);
        boolean falg=true;
        String content=null;
        while(falg){
            content=sc.next();
            if(content.contains("end")){
                falg=false;
                break;
            }
            arrayList.add(content);
            
        }
        arrayList.sort(Comparator.reverseOrder());
        //写入流
        FileWriter fw=null;
        try {
            fw = new FileWriter(fe.getPath());
            for (String str : arrayList) {
                System.out.println(str);
                fw.write(str);
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
       
    }

}