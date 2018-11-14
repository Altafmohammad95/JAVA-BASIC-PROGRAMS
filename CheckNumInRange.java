class CheckNumInRange{
public static void main(String[] args)
{
int a=80;
if(a>=0&&a<=100)
{
if(a>=90&&a<=100)
{
System.out.println("super smart");
}
if(a>=80&&a<90)
{
System.out.println(" smart");
}
if(a>=70&&a<80)
{
System.out.println("smart enough");
}
if(a>=60&&a<70)
{
System.out.println("just smart");
}
if(a>=35&&a<60)
{
System.out.println("no smart");
}
if(a>=0&&a<35)
{
System.out.println("dump");
}
}
else
{
System.out.println("number not in range");
}
}
}