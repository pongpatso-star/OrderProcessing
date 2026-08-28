/** Observer (Part 5): ส่งอีเมลยืนยันเมื่อมีคำสั่งซื้อใหม่ */
public class EmailService implements OrderObserver {
    @Override public void update(Order order) {
        System.out.println("Confirmation email sent to " + order.customerEmail());
    }
}
