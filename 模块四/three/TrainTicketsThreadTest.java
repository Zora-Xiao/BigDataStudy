
//火车票类
public class TrainTicketsThreadTest extends Thread {

    private int ticket;

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getTicket() {
        return this.ticket;
    }

    public TrainTicketsThreadTest() {
    }

    public TrainTicketsThreadTest(int ticket) {
        setTicket(ticket);
    }

    @Override
    public synchronized void run() {
        System.out.println("-----线程" + Thread.currentThread().getName() + "已启动-----");
        int ticket = getTicket();

        if (ticket > 0) {
            System.out.println("正在出票------");
            ticket--;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println("-----余票不足，请改日购买！----");
        }
        setTicket(ticket);
        System.out.println("余票还有" + getTicket());
        
    }

    public static void main(String[] args) {
        TrainTicketsThreadTest trainTickets = new TrainTicketsThreadTest(100);
        Thread thread1 = new Thread(trainTickets);
        Thread thread2 = new Thread(trainTickets);
        Thread thread3 = new Thread(trainTickets);
        thread1.start();
            thread2.start();
            thread3.start();
    // try {
    //     thread1.join();
    //     thread2.join();
    //     thread3.join();
    // } catch (InterruptedException e) {
    //     e.printStackTrace();
    // }
 }

}