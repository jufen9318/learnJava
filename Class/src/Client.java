public class Client {
    public static  void main(String arg[]) throws Throwable {
        System.out.println("class");
        Book book = new Book("《java从入门到精通第二版》","明日科技",98.9);
        System.out.println("书名：" +book.getTitle());
        System.out.println("作者："+book.getAuthor());
        System.out.println("价格：" + book.getPrice());

        book.finsh();

        System.out.println("书名：" +book.getTitle());

    }
}
