//匿名内部类
public class OutString {
    public static void main(String args[])
    {
        final  String sourceStr = "吉林省 明日";
        IStringDeal s = new IStringDeal() {
            @Override
            public String filterBlankchar() {
                String converStr = sourceStr;
                converStr = converStr.replaceAll(" ",",");
                return converStr;
            }
        };

        System.out.println(s.filterBlankchar());

    }
}
