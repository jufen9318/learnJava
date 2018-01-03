package tryCatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example07 {
    private FileReader read = null;
    public void readFileInfo()
    {
        try
        {
            try
            {
                read = new FileReader("src/com/Exapmple07.java");
                System.out.println("not found file:");
            }
            catch (FileNotFoundException ex)
            {
                ex.printStackTrace();
            }
        }
        finally {
            if(read!=null)
            {
                try {
                    read.close();
                    System.out.println("close io object");
                }
                catch (IOException ioe)
                {ioe.printStackTrace();
                System.out.println("close io object Exception");
                }
            }
        }
    }

    public  static  void main(String args[])
    {
        Example07 ex = new Example07();
        ex.readFileInfo();
    }
}
