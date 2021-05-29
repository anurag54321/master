package oddEven;

public class DemoOddEven {
	static boolean odd = true;
	static int start = 1;
	static int end = 100;

	public static void main(String[] args) {
		new DemoOddEven().oddAndEven();

	}

	private void oddAndEven() {
		Runnable even = () -> {
			System.out.println("start printing even");
			synchronized (this) {
				while (start < end) {
					while (!odd) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("ODD:" + start);
					start++;
					odd = false;
					notify();
				}
			}
		};

		Runnable oddnum = () -> {
			System.out.println("start printing odd");
			synchronized (this) {
				while (start < end) {
					while (odd) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("EVEN:" + start);
					start++;
					odd = true;
					notify();
				}
			}
		};

		new Thread(even).start();
		new Thread(oddnum).start();
	}

}
