public class TableCustomer extends Customer{
    public int tableId;//餐桌编号
    public TableCustomer(int tableId) {
        this.tableId = tableId;
    }
    @Override
    public void deliver(){
        System.out.println("在饭店点餐的顾客");
        System.out.println("送餐到："+tableId+"号");
    }
}