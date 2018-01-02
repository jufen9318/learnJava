package CollectionDemo;

import java.util.*;

public class setDemo {
    public static  void main(String[] args)
    {
        List<String> list  = new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("banana");
        list.add("apple2");
        Set<String> set= new HashSet<String>();
        set.addAll(list);
        Iterator<String> it = set.iterator();
        System.out.println("集合中的元素是：");
        while(it.hasNext())
        {
            System.out.println(it.next() + "\t");
        }

    }
}
