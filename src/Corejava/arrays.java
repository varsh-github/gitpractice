package Corejava;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {1,2,3};
	int i=0;
	for(i=0;i<3;i++)
{
		System.out.println(a[i]);
}
	int b[][]=new int[2][2];
	b[0][0]=4;
	b[0][1]=5;
	b[1][0]=6;
	b[1][1]=7;
	for(int j=0;j<2;j++)
	{
	for(int k=0;k<2;k++)
	{
		System.out.println(b[j][k]);
	}
	}
 }
}	


