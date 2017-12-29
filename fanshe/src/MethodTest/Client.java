package MethodTest;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args)
    {
        try
        {
            System.out.println("diao yong math sin()");
            Method sin = Math.class.getDeclaredMethod("sin",Double.TYPE);
            Double sin1 = (Double)sin.invoke(null,new Integer(1));
            System.out.println("1 的正弦值是：" +sin1);
            System.out.println("调用String 类的非静态方法equals()");
            Method equals = String.class.getDeclaredMethod("equals", Object.class);
            Boolean mrsoft = (Boolean) equals.invoke(new String("明日科技"),"明日科技1");
            System.out.println("字符是否是明日科技：" + mrsoft);



        }
        catch (Exception e)
        {
                e.printStackTrace();
        }
    }
}
