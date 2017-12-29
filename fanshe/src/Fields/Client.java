package Fields;

import java.lang.reflect.Field;

public class Client {
    public static  void main(String args[])
    {
        MoreFields fields = new MoreFields();
        Field[] declaredFields = fields.getClass().getDeclaredFields();
        for(int i=0;i<declaredFields.length;i++)
        {
            Field field = declaredFields[i];
            System.out.println("name :" + field.getName());
            Class fieldType = field.getType();
            System.out.println("leixing :" + fieldType);

            boolean isTurn = true;
            while (isTurn)
            {
//                try {
//                    isTurn = false;
////                    System.out.println("edit :" + field.g);
//                }
            }
        }
    }
}
