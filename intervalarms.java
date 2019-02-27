import java.util.Scanner;
class Solution
{
public static void main (String[] args)
{
Scanner sc= new Scanner(System.in);
int m= sc.nextInt();
int n=sc.nextInt();
int sum=0,r;
for(int i=m+1;i<=n-1;i++)
{

while(m!=0)
{
r=i%10;
sum+=r*r*r;
i=i/10;
}
if (sum==
}
