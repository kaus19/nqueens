import java.util.Scanner;  

class nqueens
{
int a[]=new int[100];
int count=0;
void place(int queen_no,int n)
{
int flag=0;
int i,k;
for(a[queen_no]=1;a[queen_no]<=n;a[queen_no]++)
{
for(i=1;i<queen_no;i++)
{
if((a[i]==a[queen_no])||(Math.abs(a[i]-a[queen_no])==Math.abs(i-queen_no)))
flag=1;
}
if((flag==0)&&(queen_no<n))
place((queen_no+1),n);
else if((flag==0)&&(queen_no==n))
for(i=1;i<=n;i++)
{
for(k=1;k<=n;k++)
{
if(k==a[i])
System.out.print("Q");
else
System.out.print("*");
}
System.out.println();
if(i==n)
{
System.out.println((count+1));
System.out.println();
count++;
}
}
flag=0; 
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);  
System.out.println("Enter n");
int n=sc.nextInt();
nqueens ob=new nqueens();
ob.place(1,n);
}
}
