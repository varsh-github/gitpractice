package Corejava;

public class nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=3;
for(int i=1;i<4;i=i++)
{
	for(int j=1;j<=i;j=j++)
	{
		System.out.print(k);
		System.out.print("\t");
		k=k+3;
	}
	System.out.println("");
	}
		
		
	}

}
