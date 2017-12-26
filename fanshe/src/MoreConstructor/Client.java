package MoreConstructor;

import java.lang.reflect.Constructor;

public class Client {

    public static void main(String args[])
    {
        System.out.println("------   --------");
        More exampleC = new More();
      //  More exampleC = new More("11","22","22");
      //  More exampleC = new More("11","22","22");
        Constructor<?>[] declaredConstructors = exampleC.getClass().getDeclaredConstructors();
        for(int i=0;i<declaredConstructors.length;i++)
        {
           Constructor constructor = declaredConstructors[i];
           System.out.println("查看是否允许有可变数量的参数：" + constructor.isVarArgs());
           System.out.println("该构造方法得入口参数依次为");
           Class[] parameter = constructor.getParameterTypes();
           for(int j=0;i<parameter.length;j++)
           {
               System.out.println(" " + parameter[j]);
           }

           System.out.println("构造方法可能抛出的异常类型为：");
           Class[] exception  = constructor.getExceptionTypes();
           for(int j=0;i<exception.length;j++)
           {
               System.out.println(" "+ exception[j]);
           }

           More ex = null;
           while (ex == null)
           {
               try
               {
                   if(i==0)
                       ex =(More) constructor.newInstance();
                   else  if(i==1)
                       ex =(More) constructor.newInstance("7",5);
                   else
                   {
                       Object[] parameters = new Object[]{new String[]{ "100","200","300"}};
                       ex = (More) constructor.newInstance(parameters);
                   }

               }
               catch (Exception e)
               {
                   System.out.println("在创建对象是抛出异常，下面执行setAccessible方法");
                   constructor.setAccessible(true);
               }
           }
           ex.print();
           System.out.println();

        }

    }
}
