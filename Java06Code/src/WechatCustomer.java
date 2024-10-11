public class WechatCustomer extends Customer{
    public String address;//顾客地址
    public boolean takeout;//true代表该顾客是外卖，false代表该顾客是堂食
    public WechatCustomer(String address, boolean takeout) {//初始化顾客的地址和外卖还是堂食
        this.address = address;
        this.takeout = takeout;
    }
    @Override
    public void deliver(){
        System.out.println("微信小程序点餐的顾客");
        if(takeout){

            System.out.println("送餐到："+address);
        }else {
            System.out.println("顾客为堂食，无需送餐。");
        }

    }
}