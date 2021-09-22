package app;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDruid {

    // 需求 查询 薪资在3000 到 5000之间的员工的姓名
    public static void main(String[] args) {

        // 1.获取连接
        Connection con = DruidUtils.getConnection();

        // 2.获取Statement对象
        Statement statement;
        ResultSet resultSet;
        try {
            statement = con.createStatement();
             //3.执行查询
           resultSet = statement.executeQuery("select name from employee where salary between 3000 and 5000");

        //4.处理结果集
        while(resultSet.next()){
            String ename = resultSet.getString("name");
            System.out.println(ename);
        }

        //5.释放资源
        DruidUtils.close(con,statement,resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        }

       
    }
}