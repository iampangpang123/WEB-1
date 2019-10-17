package thread;

/**
 * @Description:特点，售票，我只new了这一个SellTick3 sellTick = new SellTick3();类对象，所以说他是共用属性的，可以看跟TestSekkTick截然不同
 * @author: 唐涛
 * @date:   2019年7月13日 上午10:41:13   
 *   
 */
public class SellTick3 implements Runnable {

	public static void main(String[] args) {
		SellTick3 sellTick = new SellTick3();
		Thread t1 = new Thread(sellTick);
		Thread t2 = new Thread(sellTick);
		Thread t3 = new Thread(sellTick);
		t1.setName("售票员1");
		t2.setName("售票员2");
		t3.setName("售票员3");
		t1.start();
		t2.start();
		t3.start();
	}

 Object o = new Object();
	int count = 20;

	@Override
	public void run() {
		while (count > 0) {

			synchronized (o) {
				if (count > 0) {

					System.out.println(Thread.currentThread().getName() + "售出第" + count + "张票");
					count--;

				} else {
					System.out.println("结束");
				}
			}
			try {
				// Thread.sleep(1000);
				Thread.sleep(1000);
				//不要被sleep不放鎖迷惑了，如果他在synchronized (o) {}代码块中，他是不会放锁
				//但是他现在没剋有持有锁，就不存在什么放不放锁了

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
