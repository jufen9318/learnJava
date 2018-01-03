package simple;

public class ArithmeticException {
    public static void main(String[] args)
    {
        System.out.println("----------");
        System.out.println("-1.0/0=" +(-1.0 /0));
       System.out.println("----------");
       System.out.println("+1.0/0=" +(+1.0/0));
        try
        {
            System.out.println("----------");
            System.out.println("-1/0 = "+(-1/0));
        }
        catch (Exception e)
        {
            System.out.println("----------");
            System.out.println("抛出异常：" + e.getMessage());
        }
        System.out.println("----------");
       // System.out.println("+1/0=" +(+1/0));
        System.out.println("----------");
        System.out.println("输出结束。");

    }
}
