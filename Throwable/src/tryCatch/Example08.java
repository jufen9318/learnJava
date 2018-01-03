package tryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example08 {
    private FileReader read = null;
    public void createFile() throws FileNotFoundException {
        read = new FileReader("4242/ere.java");
        System.out.println("fen pei zi yuan");
    }

    public void test()
    {
        try {
            createFile();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("create io object Exception");
        }
        finally {
            if(read!=null)
            {
                    try {
                        read.close();
                        System.out.println("close memory");
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("close io object Exception");
                    }
            }
        }
    }


    public static void main(String args[])
    {
        Example08 ex = new Example08();
        ex.test();
    }
}
