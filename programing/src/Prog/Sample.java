package Prog;

class test{
	static void m1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" namde hava");
	}
}
class A1 implements Runnable{
	public void run() {
		test.m1();
	}
}
class A2 implements Runnable{
	public void run() {
		test.m1();
	}
}
class A3 implements Runnable{
	public void run() {
		test.m1();
	}
}
class A4 implements Runnable{
	public void run() {
		test.m1();
	}
}

public class Sample {
	public static void main(String[] args) {
		Thread t1=new Thread(new A1());
		Thread t2=new Thread(new A2());
		Thread t3=new Thread(new A3());
		Thread t4=new Thread(new A4());
		t1.setName("sindhu");
		t2.setName("anju");
		t3.setName("adarsh");
		t4.setName("bharath");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
