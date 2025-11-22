package e36;
import java.util.*;
class Order{
    String orderName;
    String drinkName;
    Double price;
    Boolean isIced;
    char size;
    Boolean toGo;

    // 存储所有订单的列表
    private static List<Order> allOrders = new ArrayList<>();

    // 构造方法
    public Order(String orderName, String drinkName, double price,
                 Boolean isIced, Character size, Boolean toGo) {

        this.orderName = orderName;
        this.drinkName = drinkName;
        this.price = price;

        // 设置默认值
        this.isIced = (isIced != null) ? isIced : true;
        this.size = (size != null) ? size : 'M';
        this.toGo = (toGo != null) ? toGo : false;

        // 将订单添加到全局列表
        allOrders.add(this);
    }
}
public class Main {
    public static void main(String[] args) {
        // 创建订单示例 - 使用您提到的名字
        Order order1 = new Order("Jack", "抹茶拿铁", 5.99, true, 'L', true);
        Order order2 = new Order("Ryan", "美式咖啡", 3.99, false, 'S', null);
        Order order3 = new Order("Julien", "抹茶拿铁", 5.99, null, null, false);
        Order order4 = new Order("Jack", "美式咖啡", 3.99, true, 'M', true);
        System.out.println("Order for " + order1.orderName + ": " + order1.drinkName + " size: " + order1.size + " iced? " + order1.isIced);
        System.out.println("Order for " + order2.orderName + ": " + order2.drinkName + " size: " + order2.size + " iced? " + order2.isIced);
        System.out.println("Order for " + order3.orderName + ": " + order3.drinkName + " size: " + order3.size + " iced? " + order3.isIced);
        System.out.println("Order for " + order4.orderName + ": " + order4.drinkName + " size: " + order4.size + " iced? " + order4.isIced);

    }
}

