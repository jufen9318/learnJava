public class StaticlInnerClass {
    static int x = 100;
    static  class inner{
        static  void doitIner()
        {
            System.out.println("wai bu d chengy "+x);
        }
        public  static void main(String arg[])
        {
            doitIner();
        }
    }
}
