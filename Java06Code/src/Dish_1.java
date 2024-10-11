public class Dish_1 extends Dish implements Order{
    public Dish_1(){
        super("老坛酸菜牛肉面",3.50);
    }
    //重写父类中的profile方法
    @Override
    public void profile() {
        System.out.println("这道菜曾经因康师傅而全国闻名，后来又因制作方法再一次全国闻名。独特的制作方法，让这道菜有了独特的风味。");
    }

    @Override
    public void cook() {
        System.out.println("老坛酸菜牛肉面");
        System.out.println("先用奇妙的方法腌制酸菜，腌制牛肉使其入味，然后煮面，加酱料包，最后将酸菜，牛肉和面一起煮一会就行了。");
    }

    @Override
    public boolean check() {
        return Math.random() < 0.5;
    }
}
