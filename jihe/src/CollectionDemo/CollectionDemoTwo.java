package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemoTwo {
    public static void main(String [] args)
    {
        String a="a",b ="b",c="c",d ="d",apple = "apple";
        List<String> list = new ArrayList<String>();
        list.add(a);
        list.add(apple);
        list.add(b);
        list.add(apple);
        list.add(c);
        list.add(apple);
        list.add(d);
        System.out.println(list);
        System.out.println("apple first diplay index:" +list.indexOf(apple));
        System.out.println("apple last diplay index:" + list.lastIndexOf(apple));
        System.out.println("b first diplay index:"+ list.indexOf(b));
    }
}
