class ThreeVarProgram{
public static void main(String[] args)
{ int c=0, sum=0;
int first=56,second=125,third=88;
System.out.println(" num between first and third variables =");
for(int i=first;i<=third;i++)
{
System.out.println(i+" ");
sum=sum+i;
 c++;
}
System.out.println("odd num between first and second variables =");
for(int j=first;j<=second;j++)
{
if(j%2!=0){
System.out.println(j+" ");
}
}
System.out.println("sum of num between first and third variable = "+sum);
System.out.println("avg of num between first and third variable = "+sum/c);
}
}