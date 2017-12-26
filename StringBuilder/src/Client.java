public class Client {
    public static  void main(String arg[])
    {
        System.out.println("string");

        String str="";
        long starTime = System.currentTimeMillis();
        for(long i=0;i<100000;i++)
        {
            str = str +i;
        }

        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        System.out.println("String 小号的时间："+ time);

        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (long j=0;j<100000;j++)
        {
            builder.append(j);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("StringBuilder消耗的时间"+time);
    }
}
