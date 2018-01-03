package tryCatch;

public class Example09 {
    final static double PI = 3.14;
    public void computteArea(double r) throws Exception {
        if(r<=20.0)
        {
            throw new Exception("program Exception: 小于20");
            //方法抛出异常
           // throw new UnsupportedOperationException("2242");
        }
        else
        {
            double circleArea = PI * r * r;
            System.out.println("ban jin "+ r + "area:" + circleArea);
        }
    }

    public static  void main(String []args)
    {
        Example09 ex = new Example09();

            try {
                ex.computteArea(21);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}
