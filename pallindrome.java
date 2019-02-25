import java.util.Scanner;
class Solution
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r,sum=0;
while(n!=0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
if (sum==n)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}}

