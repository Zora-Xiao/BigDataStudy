package app;

import java.sql.Statement;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DruidUtils {

    public static DataSource dataSource;
    static {
        try {
            Properties p = new Properties();
            InputStream inputStream = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            p.load(inputStream);
            dataSource = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    // 获取连接的方式
    public static Connection getConnection() {
        try {
            return dataSource.getConnection();

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // 获取Druid连接池对象的方法
    public static DataSource getDataSource() {
        return dataSource;
    }

    // 释放资源
    public static void close(Connection con, Statement statement) 
    {
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    public static void close(Connection con,Statement statement,ResultSet resultSet)
    {
        if(resultSet!=null)
        {
            try {
                resultSet.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        close( con,  statement);
    }


}