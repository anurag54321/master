package com.kentu;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DeadLock {

	public static void main(String[] args) {
		final String resource1 = "kentu";
		final String resource2 = "Gope";

		Runnable r1 = () -> {

			synchronized (resource1) {
				System.out.println("Thread 1: locked resource 1");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println("Thread 1: locking for resource 2");

				}
			}

		};
		Runnable r2 = () -> {

			synchronized (resource2) {
				System.out.println("Thread 2: locked resource 2");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resource1) {
					System.out.println("Thread 2: locking for resource 1");

				}
			}

		};

		new Thread(r1).start();
		new Thread(r2).start();

	}

}
