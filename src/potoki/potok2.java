package potoki;

public class potok2 implements Runnable{

	public potok2(String name)
	{
		Thread t = new Thread(this, name);
		System.out.println("����� �����: " + t);
		t .start(); // ��������� �����	
	}
	
	public void run() {
		{
		start.sto();
		}
	}
}
