class CheckNum{
public static void main(String[] args)
{
int a=101;
if(a>=100&&a<=1000)
{
if(a%2==0)
{
float t=a/3;
System.out.println(t);
}
else if(a%2!=0)
{
float y=a/2;
System.out.println(y);
}
}
else
{
System.out.println("number not in range");
}
}
}