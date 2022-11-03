package part1;

import java.util.Iterator;

public class Ex2Program {
	// 비동기식 스레드 흐름
	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				print1();
			}

		});

		Thread th2 = new Thread(new Runnable() {
			public void run() {
				print2();
			}

		});
		th1.start();
		th2.start();

	}

	private static void print1() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("sub1: %d\n", i + 1);
		}

	}

	private static void print2() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("sub2: %d\n", i + 1);
		}

	}

}
