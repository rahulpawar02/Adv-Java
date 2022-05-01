package threadpool;

public class MyRunnable implements Runnable{

	private String name;
	
	public MyRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name+"...Job Started by Thread"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"..job Completed by Thread:"+Thread.currentThread().getName());
		
	}
	

}
