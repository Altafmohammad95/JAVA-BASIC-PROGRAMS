class Series12{
public static void main(String[] args)
{
	for(int i=1;i<=20;i++)
	{
		if(i%5==0)
		{
		System.out.print("multiple of five ");
		}
		else if(i%2!=0&&i%5!=0)
		{
		System.out.print(i+" ");
		}
	}
}
}