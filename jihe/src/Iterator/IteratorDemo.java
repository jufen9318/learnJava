package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String [] args)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Collections.addAll(array,1,2,3,4,5,6);
        System.out.println("集合中的元素：" + array);

        ListIterator<Integer> iterator = array.listIterator();
        boolean hasNext = iterator.hasNext();
        System.out.println("集合是否具有下一个元素：" + hasNext);

        boolean hasPrevious = iterator.hasPrevious();
        System.out.println("集合是否具有前一个元素：" + hasPrevious);

        int next = iterator.next();
        System.out.println("获得集合的下一个元素：" + next);
    }
}
