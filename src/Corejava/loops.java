package Corejava;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//if loop
		if(10>5)
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	
//for loop
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);	
	}
//while loop
		int j=0;
		while(j<5)
		{
			j++;
			System.out.println(j);
		}
//do while loop
		int k=10;
		do
		{
			System.out.println(k);
			k=k-2;
		}
		while(k>0);
}
}
