public class JAVA_CH_7_ARRAY {
    public static void main(String[] args)
    {
//        int[] Marks={90,40,60,98,89,50,45};
//        System.out.println(Marks[3]);

//        for(int element:Marks)
//        {
//            System.out.print(" "+element);
//        }


//        Two dimensional array

        int  [][] arr=new int[2][3];
        arr[0][0]=20;
        arr[0][1]=30;
        arr[0][2]=40;

        arr[1][0]=50;
        arr[1][1]=60;
        arr[1][2]=70;



        int i,j;
        System.out.println(arr.length);
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
//                System.out.println(arr[i].length);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }


    }
}
