package part1;

import java.util.Iterator;

public class Ex1Program {

	public static void main(String[] args) {
		print1();
		print2();
		// 동기식 실행으로 print1() for문 전체 실행 후에
		// print2() 실행

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
