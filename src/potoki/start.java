package potoki;

public class start {

	public static void main(String[] args) {
		
		chislafibonachi();	
		
	}

	static void sto()
	{
		Thread t = Thread.currentThread();
		
		for(int i=0;i<10;i++)
		{
		System.out.println(t+""+i);
		}
	}
	
	static void chislafibonachi()
	{
		long time = System.nanoTime(); 
		
		double mas[] = new double[101];
		int k=0;
		mas[0]=0;
		mas[1]=1;
	
		System.out.println("Начальные значения последовательности Фибоначчи: " + mas[0] +" и "+mas[1]);
	
		for(int i=2;i<=100;i++)
		{
			mas[i]=mas[i-1]+mas[i-2];
			k=i;	
		}
		
		System.out.println("Значение "+k+" элемента последовательности Фибоначчи:"+mas[k]);
		
		time = System.nanoTime() - time; 
		System.out.printf("Время выполнения: %,9.3f ms\n", time/1_000_000.0);
	}
}
