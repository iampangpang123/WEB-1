package thread;

public class SellTick implements Runnable {
	
	public static void main(String[] args) {

		SellTick sellTick1 = new SellTick();
		/*
		 * SellTick sellTick2 = new SellTick(); SellTick sellTick3 = new SellTick();
		 */
		Thread t1 = new Thread(sellTick1);
		Thread t2 = new Thread(sellTick1);
		Thread t3 = new Thread(sellTick1);
		t1.setName("售票員票1");
		t2.setName("售票員票2");
		t3.setName("售票員票3");
		t1.start();
		t2.start();
		t3.start();
	}


	static int tick = 20;
	Object ob = new Object();

	@Override
	public void run() {
		while (tick > 0) {
			synchronized (ob) {
				// 这个很重要，必须使用一个锁， // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
				if (tick > 0) {
					System.out.println(Thread.currentThread().getName() + "卖出了第" + tick + "张票");
					tick--;
					//sleep(1000);如果sleep放在這裏面,线程不会释放锁。其他线程没有执行机会，所以sleep必须放在synchronized 关键字外面
				} else {
					System.out.println("票卖完了");
				}
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
}