package dec9;

public class Calucator {
public void add(int a,int b) {
	System.out.println(a+b);
}
public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public void mul(int a, int b) {
	System.out.println(a*b);
}
public void mul(int a, double b) {
	System.out.println(a*b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calucator cal=new Calucator();
cal.add(5, 5);
cal.add(2, 4, 6);
cal.mul(4, 4);
cal.mul(3, 3.5);
	}

}
