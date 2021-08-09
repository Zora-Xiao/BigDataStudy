
public class StaffTest {
    public static void main(String[] args)
    {
        
        Staff staff=null;
        try {
            staff = new Staff("", -1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    System.out.println("st="+staff);
    }
}