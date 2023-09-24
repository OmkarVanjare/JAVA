package OOPS;
class xyz1{
	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}

public class ThisKeyword {

	public static void main(String[] args) {
		xyz1 o = new xyz1();
		o.setI(5);
		System.out.println(o.getI());

	}

}
