package javatutorial;


class SharedResource
{
	
	synchronized void update()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
	}
}

class Abc extends Thread
{
	SharedRes sr;
	Abc(SharedRes sr)
	{
		this.sr=sr;
		setName("Thread 1");
		setPriority(MIN_PRIORITY);
		start();
	}
	public void run()
	{
		sr.update();
	}
}

class Xyz extends Thread
{
	SharedRes sr;
	Xyz(SharedRes sr)
	{
		this.sr=sr;
		setName("Thread 2");
		setPriority(MIN_PRIORITY);
		start();
	}
	public void run()
	{
		sr.update();
	}
}

class Rst extends Thread
{
	SharedRes sr;
	Rst(SharedRes sr)
	{
		this.sr=sr;
		setName("Thread 3");
		setPriority(MIN_PRIORITY);
		start();
	}
	public void run()
	{
		sr.update();
	}
}

public class TestThread {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SharedRes resource = new SharedRes();
		new Abc(resource);
		new Xyz(resource);
		new Rst(resource);

	}

}
