import java.util.*;
class Pattern1
{
public static void main(String args[ ])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value : ");
n=sc.nextInt();
for(i=1;i<=n;i++)  
{
    for(j=i;j<=n;j++)
    {
        System.out.println("*");
    }
   System.out.println( );
}
}
}