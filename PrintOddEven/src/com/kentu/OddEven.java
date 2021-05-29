package com.kentu;

public class OddEven {

	static boolean odd = true;
	int MAX_SIZE = 100;
	static int count = 1;

	public void Even() {
		System.out.println("Startrd print Even");

		synchronized (this) {

			while (count < MAX_SIZE) {
				while (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("ODD" + count);
				count += 1;
				odd = false;

				notify();
			}

		}

	}

	public void Odd() {

		synchronized (this) {
			while (count < MAX_SIZE) {
				while (odd) {

					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("EVEN" + count);
				count += 1;
				odd = true;
				notify();
			}

		}

	}

}
