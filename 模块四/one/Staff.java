//员工类
public class Staff {
    private String name;
    
    private int age;
    
    public  Staff(){}
    
    public  Staff(String name,int age) throws Exception
    {
        setName(name);
        setAge(age);
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name) throws NameException
    {
        if(name!=null||name!=""){this.name=name;}
        else{
           // System.out.println("姓名异常");
           throw new NameException("姓名异常");
        }
        
    }
    public void setAge(int age) throws AgeException{
        if(age>18&&age<150){
        this.age=age;
     }else{
        // System.out.println("年龄异常");
        throw new AgeException("年龄不合理啊！！");
     }
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString()
    {
        return "Staff{"+
           "name="+getName()+" , age="+getAge();
    }
    
}