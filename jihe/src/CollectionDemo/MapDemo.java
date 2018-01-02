package CollectionDemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args)
    {
        Map<String,String> map  = new HashMap<String,String>();
        map.put("1","apple2");
        map.put("2","pear");
        map.put("3","orage");
        for(int i=1;i<=3;i++)
        {
            System.out.println("第"+i+"元素是：" + map.get(String.valueOf(i)));
        }

    }
}
