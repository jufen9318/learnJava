package simple;

public class Example03 {
    public void printBuginfo()
    {
        try
        {
            int x=100;
            int y=0;
            int z=x/y;
            System.out.println(x+"除以"+ y+"的商是："+z);

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("ex.getmessage:"+e.getMessage() );
            System.out.println("getLocalizedmessage:"+ e.getLocalizedMessage());
            System.out.println("toString:"+e.toString());
        }
    }

    public static  void main(String[]args)
    {
        Example03 ex = new Example03();
        ex.printBuginfo();
    }
}
