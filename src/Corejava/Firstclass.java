package Corejava;

public class Firstclass {
	
public void getData()
{
	System.out.println("Method");
}
static int v=6;
int s=4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstclass obj1=new Firstclass();	
		obj1.getData();
		secondclass obj2=new secondclass();
		obj2.setData();
		System.out.print("This is ");
		System.out.println("my first java code");
		System.out.println(v);
		System.out.println(obj1.s);
		

	}

}
