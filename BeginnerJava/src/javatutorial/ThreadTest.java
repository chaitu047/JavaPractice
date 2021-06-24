package javatutorial;

class SharedRes
{
	long id=0;
	IdHolder ih;
	public void idholfun(IdHolder ih)
	{
		this.ih=ih;
	}
	synchronized void update()
	{
		id = Thread.currentThread().getId();
		for(int m=0;m<10;m++)
		{
			System.out.println(m+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
			if(ih.id1==id)
			{
				try
				{
					wait();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else if(ih.id2==id)
			{
				try
				{
					notify();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else
			{
				try
				{
					notifyAll();
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		
	}
	
}

class ThreadA extends Thread
{
	SharedRes p;
	ThreadA(SharedRes p)
	{
		this.p=p;
	}
	public void run()
	{
		p.update();
	}
}

class ThreadB extends Thread
{
	SharedRes p;
	ThreadB(SharedRes p)
	{
		this.p=p;
	}
	public void run()
	{
		p.update();
	}
}
class ThreadC extends Thread
{
	SharedRes p;
	ThreadC(SharedRes p)
	{
		this.p=p;
	}
	public void run()
	{
		p.update();
	}
}

class IdHolder
{
	long id1=0,id2=0,id3=0;
	Thread p,q,r;
	IdHolder(Thread a,Thread b,Thread c)
	{
		p=a;
		q=b;
		r=c;
		id1=p.getId();
		id2=q.getId();
		id3=r.getId();
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedRes sr = new SharedRes();
		ThreadA a = new ThreadA(sr);
		a.setName("ThreadA");
		a.setPriority(Thread.MIN_PRIORITY);
		ThreadB b = new ThreadB(sr);
		b.setName("ThreadB");
		b.setPriority(Thread.MIN_PRIORITY);
		ThreadC c = new ThreadC(sr);
		c.setName("ThreadC");
		c.setPriority(Thread.MIN_PRIORITY);
		IdHolder ih = new IdHolder(a,b,c);
		sr.idholfun(ih);
		a.start();
		b.start();
		c.start();
	}

}
