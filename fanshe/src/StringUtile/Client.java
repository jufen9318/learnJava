package StringUtile;

import com.sun.org.apache.bcel.internal.generic.MethodObserver;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Client {
    @SuppressWarnings("unchecked")
    public  String toString(Object object)
    {
        Class clazz = object.getClass();
        StringBuilder sb = new StringBuilder();
        Package packageName = clazz.getPackage();
        sb.append("package name;" + packageName.getName() +"\t");
        String className = clazz.getSimpleName();
        sb.append("class name:" + className + "\n");
        sb.append("common gouzao method:\n");

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor:constructors)
        {
            String modifier = Modifier.toString(constructor.getModifiers());
            if(modifier.contains("public"))
            {
                sb.append(constructor.toGenericString()+ "\n");
            }
        }
        sb.append("common yu :\n");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields)
        {
            String modifier = Modifier.toString(field.getModifiers());
            if(modifier.contains("public"))
            {
                sb.append(field.toGenericString() +"\n");
            }
        }

        sb.append("common methods :\n");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method:methods)
        {
            String modifier = Modifier.toString(method.getModifiers());
            if(modifier.contains("public"))
            {
                sb.append(method.toGenericString() + "\n");
            }
        }

        return sb.toString();

    }

    public static void main(String args[])
    {
        System.out.println(new Client().toString(new java.util.Date()));
    }
}
