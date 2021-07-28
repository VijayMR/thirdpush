package org.single;

public class Singleton {
	static Singleton s;
	private Singleton(){
		
	}
	private static Singleton getInsatnce() {
		if(s==null) {
			s=new Singleton();
			System.out.println(System.identityHashCode(s));
		}
		return s;
	}
		
	public void name() {
		System.out.println("dsdasf");
		
	} 
	public void add() {
		System.out.println("hgsdudf");
		
	}
	public static void main(String[] args) {
		Singleton ias = getInsatnce();
		ias.name();
		System.out.println(System.identityHashCode(ias));
		Singleton q = getInsatnce();
		q.add();
		System.out.println(System.identityHashCode(q));
		System.out.println("no changes made to the code 1");
		System.out.println("Dont worry");
		
	}

}
