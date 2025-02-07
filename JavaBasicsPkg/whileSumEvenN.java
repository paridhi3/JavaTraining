package JavaBasicsPkg;

public class whileSumEvenN {
	public static void main (String[] args) {
		int sum=0, i=0;
		while(i<=20)
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
