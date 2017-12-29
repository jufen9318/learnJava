import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class ClassDec {
    public static  void main(String[] args) throws  ClassNotFoundException{
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("class name" + clazz.getCanonicalName());
        System.out.println("class :"+ Modifier.toString(clazz.getModifiers()));

        TypeVariable<?>[] typeVariables = clazz.getTypeParameters();
        System.out.println("class parameters:");
        if(typeVariables.length !=0)
        {
            for(TypeVariable<?> typeVariable:typeVariables)
            {
                System.out.println(typeVariable +"\t");
            }
        }
        else
        {
            System.out.println("null");
        }


        Type[] interfaces = clazz.getGenericInterfaces();
        System.out.println("class interface");
        if(interfaces.length !=0)
        {
            for (Type type:interfaces)
            {
                System.out.println("\t"+ type);
            }

        }
        else
        {
            System.out.println("\t" +"null");
        }

        Type superclass = clazz.getGenericSuperclass();
        System.out.println("super class");
        if(superclass!=null)
        {
            System.out.println(superclass);
        }
        else {
            System.out.println("null");
        }

        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("class desc");
        if(annotations.length !=0)
        {
            for(Annotation annotation :annotations)
            {
                System.out.println("\t"+ annotation);
            }
        }
        else
        {
            System.out.println("null");
        }

    }
}
