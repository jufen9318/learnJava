package TreeMap;

import java.util.*;

public class Client {
    public static void main(String[] args)
    {
        Map map = new HashMap<>();
        Emp emp = new Emp("001","张三");
        Emp emp1 = new Emp("008","李四");
        Emp emp2 = new Emp("004","王一");

        map.put(emp.getE_id(),emp.getE_name());
        map.put(emp1.getE_id(),emp1.getE_name());
        map.put(emp2.getE_id(),emp2.getE_name());


        Set set =map.keySet();
        Iterator it = set.iterator();
        System.out.println("HashMap 类实现的Mpa 集合：");
        while (it.hasNext())
        {
            String str = (String)it.next();
            String name = (String) map.get(str);
            System.out.println(str + " " + name);
        }

        TreeMap treeMap = new TreeMap();
        treeMap.putAll(map);
        Iterator iter = treeMap.keySet().iterator();

        System.out.println("TreeMap :");
        while (iter.hasNext())
        {
            String str = (String) iter.next();
            String name = (String) map.get(str);
            System.out.println(str + " " + name);
        }

    }
}
