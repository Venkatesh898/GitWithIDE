package org.example.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        /*for(int row=0;row<2*n;row++)
        {
            int colcount=row>n?2*n-row:row;
            int spaces=n-colcount;
            for(int s=0;s<spaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=0;col<colcount;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        /*for(int row=1;row<=n;row++)
        {
            for(int s=0;s<n-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+"");

            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col+"");
            }
            System.out.println("");
        }*/
        /*for(int row=1;row<=n;row++)
        {
            for(int s=1;s<=n-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }*/
        for(int row=0;row<=2*n;row++)
        {
            int col=row>n?row-n:n-row;
            for(int i=0;i<n-col;i++)
            {
                System.out.print(" ");
            }
            for(int c=col;c>=1;c--)
            {
                System.out.print("* ");
            }
            //if(col!=0)
            System.out.println();
        }
    }
}
