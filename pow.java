import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int f=1;
int k=sc.nextInt();
for(int i=1;i<=k;i++)
{
n=n*n;
}
System.out.println(n);
}}
