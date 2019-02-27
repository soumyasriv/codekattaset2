import java.util.Scanner;
class Solution
{
public static void main (String[] args)
{
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int m=n;
int r;
int sum=0;
while (n!=0){
r=n%10;
sum+=r*r*r;
n=n/10;
}
if (sum==m)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}}
