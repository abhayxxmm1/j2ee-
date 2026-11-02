package co.vinod.model.d3;

import java.util.HashMap;
import java.util.Map;

public class RecursionDemo {
	static int fiboCallCount = 0;
	static Map<Integer, Integer> fiboMap = new HashMap<>();

	static int fibonacci(int index) {
		fiboCallCount++;

		if (fiboMap.containsKey(index)) {
			return fiboMap.get(index);
		}

		if (index == 0) {
			return 0;
		}
		if (index == 1) {
			return 1;
		}
		var f = fibonacci(index - 2) + fibonacci(index - 1);
		fiboMap.put(index, f);
		return f;
	}

	static int factorialUsingLoop(int num) {
		if (num <= 1) {
			return 1;
		}

		int f = 1;
		while (num > 1) {
			f *= num--;
		}
		return f;
	}

	static int factorial(int num) {
		if (num <= 1) {
			return 1;
		}

		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		// 0 1 2 3 4 5 6 7 8 9 10

		int n = 10;
//		int f = factorial(n);
//		System.out.printf("factorial of %d is %d\n", n, f);
		int f = fibonacci(n);
		System.out.printf("No.of times fibonacci method was called = %d\n", fiboCallCount);
		System.out.printf("fibonacci number at index %d is %d\n", n, f);
	}

}
