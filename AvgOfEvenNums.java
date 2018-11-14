class AvgOfEvenNums{
public static void main(String[] args)
{int sum=0,c=0,avg=0;
for(int i=25;i<=50;i++)
{
if(i%2==0)
{
sum=sum+i;
c++;
}
}
avg=sum/c;
System.out.println(avg);
}
}