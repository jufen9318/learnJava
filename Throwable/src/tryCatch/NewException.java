package tryCatch;

public class NewException extends Exception {
    public  NewException(String s)
    {
        super(s);
    }
    public NewException(Double r)
    {
        System.out.println("fa shen Exception: xiao yu 20");
        System.out.println("yuan de "+r);
    }

    public static void showArea(double r ) throws NewException {
        if(r<=20)
        {
            throw  new NewException(r);
        }
        double area = 3.14 * r * r;
        System.out.println("Area:" + area);
    }
    public static void main(String[] args)
    {

            try {
                showArea(10);
            } catch (NewException e) {
                e.printStackTrace();
               System.out.println(e.getMessage());
            }

    }
}
