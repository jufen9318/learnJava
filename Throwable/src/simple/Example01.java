package simple;


public class Example01 {
    private  int num =10;
    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public Example01() throws ClassNotFoundException {
       // try
       // {
           Class.forName("com.mingrisoft.Test");
      //  }
      //  catch (ClassNotFoundException e)
       // {
            //e.printStackTrace();
      //  }
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Example01 example01 = new Example01();
        example01.setNum(99);;
        System.out.println(example01.getNum());
    }
}
