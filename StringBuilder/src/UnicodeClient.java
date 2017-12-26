public class UnicodeClient {
    public  static  void main(String arg[])
    {
        String text = "明日 soft";
        char[] charArray = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char c :charArray)
        {
            builder.append((int)c + " ");

        }
        System.out.println("明日 soft 的Unicode是：");
        System.out.println(builder.toString());
    }

    public void test(String s,int i)
    {
        System.out.println("23424");
    }
}
