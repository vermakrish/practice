
public class constructor {
	int n;
	String name;
	constructor(int i, String j){
		n = i;
		name = j;
	}
	constructor(constructor s)
	{
		n = s.n;
		name = s.name;
	}
	void method() {
		System.out.print("Roll number"+" "+n+" "+"name"+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c = new constructor(99,"Krishna");
		constructor c1 = new constructor(c);
		c1.method();

	}

}
