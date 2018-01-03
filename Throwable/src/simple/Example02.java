package simple;

public class Example02 {
    int [] number ={100,80,50,70,20,60};
    public void setNumber(int index,int value)
    {
        number[index] = value;
    }
    public int getNum(int index)
    {
        return number[index];
    }


    public  static  void main(String []args)
    {
        Example02 ex= new Example02();
        int value = ex.getNum(0);
        System.out.println(value);

        value = ex.getNum(6);
        System.out.println(value);

      value = ex.getNum(5);
      System.out.println(value);
    }
}
