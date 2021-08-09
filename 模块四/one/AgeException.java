//自定义age异常类
public class AgeException extends Exception{

    //1、序列化
    static final long serialVersionUID=781837528146090155L;
   
	//2、无参构造函数
    public  AgeException()
    {
        super();
    }
    //3、有参构造
    public  AgeException(String message)
    {
        super(message);
    }
}