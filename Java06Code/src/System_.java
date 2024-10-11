import java.util.List;

public class System_ {//因为类名System和System.out.println重名了，所以要改类名
    public static int id=1;//订单编号
    //请补全处理订单的函数
    public void manageOrder(List<Order> dishes,Customer customer){
        customer.deliver();//通过动态绑定机制，可以执行不同的deliver方法
        for(Order order : dishes){//从列表中提取菜品(dishes)存入到order中去,相当于向上转型
            //用了泛型之后增强for循环就不用再用Object接收列表的对象，并向下转型，而是可以直接用
            //order接收，读取速度更快
            if(order.check() == false){
                //动态绑定机制生效，check方法调用的是运行类型（菜品）的check方法，因此可以实现
                //不同的菜品调用自己的cook方法
                System.out.println("------------------------------------------");
                System.out.println("取消订单");
            }else{
                System.out.println("------------------------------------------");
                order.cook();
                System.out.println("订单编号："+(id++));
            }

        }
        //要求1：一旦订单里有一个菜品的原料不足以烹饪，就输出“取消订单”，否则输出所有菜品的烹饪方法，最后再输出该订单的编号，编号从1开始递增。
    }
}
