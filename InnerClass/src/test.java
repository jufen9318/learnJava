public class test {
    innerClass in = new innerClass();

    class innerClass{
        innerClass(){

        }
        public  void inf(){
            System.out.println("innerClass print " +y);
        }
        int y=0;
    }

    public innerClass doit()
    {
        in.y=4;
        return  in;
    }

    public static void main(String args[])
    {
        test out = new test();
        test.innerClass in =out.new innerClass();
        in.inf();
        in.y = 5;
    }
}
