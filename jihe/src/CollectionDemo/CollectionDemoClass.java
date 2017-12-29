package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemoClass {
    public static void main(String args[])
    {
        String a  = "A",b ="B",c ="C",d="D",e="E";
        List<String> list = new LinkedList<String>();
        list.add(a);
        list.add(e);
        list.add(d);
        Iterator<String> fristIterator =  list.iterator();
        System.out.println("修改前集合中的元素是：");
        while (fristIterator.hasNext())
        {
            System.out.print(fristIterator.next() +" ");
        }

        list.set(1,b);
        list.set(2,c);

        Iterator<String> it = list.iterator();
        System.out.println();
        System.out.println("修改后集合中的元素是：");
        while (it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

    }
}
