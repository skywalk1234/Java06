import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<Order>();
        //List用了一个泛型，表示传入的只能说Order类或者它的子类
        TableCustomer tableCustomer = new TableCustomer(12);
        WechatCustomer wechatCustomer = new WechatCustomer("欣苑3栋",false);
        WechatCustomer wechatCustomer2 = new WechatCustomer("欣苑3栋",true);
        orders.add(new Dish_0());
        orders.add(new Dish_1());
        orders.add(new Dish_2());
        System_ cooker = new System_();
        cooker.manageOrder(orders,tableCustomer);
        System.out.println();
        cooker.manageOrder(orders,wechatCustomer);
        System.out.println();
        cooker.manageOrder(orders,wechatCustomer2);
        //Dish_0 dish0 = new Dish_0();

    }
}
