//自定义name异常类
public class NameException extends Exception{
    static final long serialVersionUID=781837528146090155L;
    public NameException(String message) {
        super(message);
	}
	public  NameException()
    {
        super();
    }
}