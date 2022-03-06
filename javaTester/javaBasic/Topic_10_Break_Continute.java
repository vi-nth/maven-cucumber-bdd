package javaBasic;

import java.util.Iterator;

public class Topic_10_Break_Continute {

	public static void main(String[] args) {
		// Nested for
		for (int i = 1; i <= 5; i++) {
			System.out.println("Lần chạy của i (for trên)=" + i);

			// i=1
			// Mỗi lần chạy của for trên sẽ apply cho tất cả các lần chạy của for dưới này
			for (int j = 1; j <= 5; j++) {
				if (j == 4) { // Loại trừ 1 điều kiện này ra
					continue;
				}

				System.out.println("j=" + j);

			}

		}

	}
}
