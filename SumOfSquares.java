class SumOfSquares{
public static void main(String[] args)
{int n=3,sum=0;
for(int i=n;i>=1;i--)
{int g=1;
for(int j=1;j<=2;j++)
{
g=g*i;
}
sum=sum+g;
}
System.out.println(sum);
}
}