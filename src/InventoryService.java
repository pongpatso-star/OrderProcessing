/** Observer (Part 5): ตัดสต๊อกเมื่อมีคำสั่งซื้อใหม่ */
public class InventoryService implements OrderObserver {
    @Override public void update(Order order) {
        System.out.println("Inventory updated for order " + order.orderId());
    }
}
