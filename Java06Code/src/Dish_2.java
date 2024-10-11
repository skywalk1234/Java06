public class Dish_2 extends Dish implements Order{
    public Dish_2(){//用构造器初始化菜名和价格
        super("姜丝炒土豆丝",12.50);
    }
    @Override
    public void profile() {
        System.out.println("总所周知，姜会以任意一种形态出现在菜里面，这道菜考验的是食客的眼力以及耐心，能将这道菜的姜丝全部挑出来的我们称他为姜王博士。");
    }

    @Override
    public void cook() {
        System.out.println("姜丝炒土豆丝");
        System.out.println("用热油锅爆炒生姜，然后再倒入土豆，加少量水，爆炒，差不多就可以出锅了。");
    }
    @Override
    public boolean check() {
        return Math.random() < 0.5;
    }
}
