public class pattern4 {
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=(n-r);c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			for(int c=1;c<=r-1;c++)
			{
				System.out.print("*");
			}
			for(int c=n-r;c>=1;c--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
        for(int r=1;r<=n-1;r++)
		{
            for(int c=(n-r);c<=n-1;c++)
            {
                System.out.print(" ");
            }
            for(int c=r;c<=n-1;c++)
            {
                System.out.print("*");
            }
            for(int c=1;c<=n-r-1;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
PS D:\java_programs> javac pattern4.java
PS D:\java_programs> java pattern4 5
    *    
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
PS D:\java_programs>
*/