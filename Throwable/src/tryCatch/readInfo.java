package tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readInfo {
    private FileInputStream in = null;

    public void readInfo()
    {
        try
        {
            in = new FileInputStream("src/tryCath/readInfo.java");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("create io object exception");
        }
        finally {
            if(in!=null) {
            try {
             in.close();
             System.out.println("close io ,");
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
                System.out.println("close io ojbect exception");
            }
            }
            }
        }


        public static void main(String args[])
        {
            readInfo ex = new readInfo();
            ex.readInfo();
        }
    }

