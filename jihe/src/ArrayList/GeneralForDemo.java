package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GeneralForDemo {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<10;i++)
        {
            list.add(i);
        }
        System.out.println("列表中的元素：" + list);
        System.out.println("列表中的奇数序号元素：");
        for(int i = 1;i<list.size();i+=2)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
