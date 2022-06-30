import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class JAVA_CH_3_STRING {
    public static  void main(String[] args)
    {
//PRAC-1 Write a Java program to convert a string to lowercase.
        String str="Par veen  dogr a";
        System.out.println(str.toLowerCase());

//PRAC-2 Write a Java program to replace spaces with underscores.
        System.out.println(str.replace(' ','_'));

//PRAC-3 Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”
// Replace <|name|> with a string (some name)
        System.out.println("Dear "+str+", Thanks a lot");

//PRAC-4 Write a Java program to detect double and triple spaces in a string.
        System.out.println(str.indexOf("  "));

//PRAC-5 Write a program to format the following letter using escape sequence characters.
//Letter = “Dear Harry, This Java Course is nice. Thanks”

        System.out.println("Dear Parveen,\n\tThis Java Course is nice.\n\nThanks ");
//
    }
}
