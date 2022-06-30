import com.sun.source.tree.ContinueTree;

public class JAVA_CH_6_Break_Continue {
    public static void main(String[] args) {
//        Break Statement for "For loop"
//        int i;
//        for(i=1;i<10;i++)
//        {
//            if(i==3)
//            {
//                System.out.println("Skip Step: "+i);
//                break;
//            }
//            System.out.println(i);
//        }
//
//        break statement for while loop
//        int i=0;
//        while(i<10)
//        {
//            if(i==5)
//            {
//                System.out.println("Skip Step: "+i);
//                i++;
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

//  ////////////////////////Continue statement/////////////////////

//        int i;
//        for (i=0;i<10;i++)
//        {
//            if(i==5)
//            {
//                System.out.println("Skip Step: "+i);
//                continue;
//            }
//            System.out.println(i);
//        }

        int i = 0;
        do {
            i++;
            if (i == 3) {
                System.out.println("Skip Step: " + i);
                continue;
            }
            System.out.println(i);
        }while(i<10);
        }
    }

