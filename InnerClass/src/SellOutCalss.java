//局部内部类
public class SellOutCalss {
    private  String name;
    public SellOutCalss()
    {
        name = "apple";
    }
    public  void sell(int price)
    {
        class Apple
        {
            int innerPrice =0;
            public Apple(int price)
            {
                innerPrice = price;
            }
            public void price()
            {
                System.out.println("now sale:" + name);
                System.out.println("price:" + innerPrice + "$");
            }
        }

        Apple apple = new Apple(price);
        apple.price();

    }

    public static void main(String args[])
    {
        SellOutCalss sellOutCalss = new SellOutCalss();
        sellOutCalss.sell(100);
    }
}
