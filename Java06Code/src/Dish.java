public abstract class Dish {
    private String name;//菜品名称
    private double price;//菜品价格
    public abstract void profile();
    Dish(String name,double price){
        this.name = name;
        this.price = price;
    };
}
