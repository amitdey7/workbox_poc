import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test2 {

	public static void main(String[] args) {
				
		String str="Catarina Frac Ponds";
        String newStr="";
          for (int i=0;i<str.length();i++)
          {
              //Ascci range for a-z A-Z
              if (str.charAt(i)>64&&str.charAt(i)<121)
              {
            	  newStr = str.replaceAll("[^a-zA-Z0-9]", "");
              }
          }
 
         System.out.println("String before filter "+str);
        System.out.println("String after filter "+newStr);
 
    }

	}


