package Prog;

class Sample{
	synchronized static void m1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1 is calling m2");
		Demo.m2();
		
	}
}
class Demo{
	synchronized static void m2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m2 is calling m1");
		Sample.m1();
		
	}
}

class A2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class ThreadCon {
	public static void main(String[] args) {
		
	}

}
