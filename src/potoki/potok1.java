package potoki;

public class potok1 extends Thread{
	
	public potok1(String name)
	{
			Thread t = new Thread(this, name);
			t .start(); // запустить поток			
	}
	
	public void run() {	
		
		int mas[] = new int[100];
		
		mas[0]=0;
		mas[1]=1;
		
		System.out.println("Начальное значение последовательности Фибоначчи: " + 0);
		System.out.println("Начальное значение последовательности Фибоначчи: " + 1);
		
		for(int i=2;i<100;i++)
		{
			mas[i]=mas[i-1]+mas[i-2];
			System.out.println(""+mas[i]+"  "+i);
		}
	}
}
