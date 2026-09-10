class TicketBooking extends Thread {
    String customerName;
    boolean isBooked = false;

    synchronized void bookTicet(String customerName) {
        if (!isBooked) {
            System.out.println("Seat Reserved for " + customerName);
            isBooked = true;
        } else {
            System.out.println("Seat not available for " + customerName);
        }
    }

    public void run() {
        bookTicet(customerName);
    }
}

public class onlineBooking {
    public static void main(String[] args) {
        TicketBooking obj = new TicketBooking();

        Thread t1 = new Thread(() -> obj.bookTicet("Ran Vijay"));
        Thread t2 = new Thread(() -> obj.bookTicet("Vivek"));
        t1.start();
        t2.start();

    }
}