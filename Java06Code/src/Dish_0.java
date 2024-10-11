public class Dish_0 extends Dish implements Order{
    private String name;//菜品名称
    private double price;//菜品价格
    Dish_0(){
        super("番茄炒蛋",10);
    };

    @Override
    public void profile() {
        System.out.println("番茄炒蛋是普通的大众菜肴，烹调方法比较简单，而且营养搭配合理。色泽鲜艳，口味宜人，深受大众喜爱。其营养价值丰富，具有营养素互补的特点以及健美抗衰老的作用。番茄含有丰富的胡萝卜素、维生素C和B族维生素，番茄红素具有独特的抗氧化能力。鸡蛋含有大量的维生素和矿物质及有高生物价的蛋白质。蛋黄中含有丰富的卵磷脂、固醇类等，对神经系统和身体发育有非常好的作用，深受人们的喜爱。");
    }
    @Override
    public void cook() {
        System.out.println("番茄炒鸡蛋");
        System.out.println("先炒鸡蛋，然后装在盘子里，再炒番茄，加一点水，然后把炒好的鸡蛋倒入锅中和番茄一起炒，最后加水煮一会就行了。");
    }

    @Override
    public boolean check() {
        return Math.random() < 0.5;//随机生成0~1的浮点数，小于0.5就返回true否则返回false
    }
}