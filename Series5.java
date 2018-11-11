class Series5{
public static void main(String[] args)
{
int pow=2;
	for(double i=0.5;i<=2.2;i+=0.2)
	{	double k=1;
		for(int j=1;j<=pow;j++)
                {
                k=k*i;
		}
	System.out.println(k);
	}
}
}