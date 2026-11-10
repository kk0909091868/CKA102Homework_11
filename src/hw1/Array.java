package hw1;

public class Array {
	 public static void main(String[] args) {

	        // 1. 宣告三個 3x3 二維整數陣列
	        int[][] x = new int[3][3];
	        int[][] y = new int[3][3];
	        int[][] z = new int[3][3];

	        // 2. 使用亂數產生 x、y 陣列的數字
	        for (int i = 0; i < 3; i++) {

	            for (int j = 0; j < 3; j++) {

	                x[i][j] = (int)(Math.random() * 31);
	                y[i][j] = (int)(Math.random() * 31);

	                // 3. 將 x、y 對應位置相加，存入 z
	                z[i][j] = x[i][j] + y[i][j];

	            }
	        }

	        // 4. 印出 x 陣列
	        System.out.println("X 陣列：");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(x[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        // 5. 印出 y 陣列
	        System.out.println("Y 陣列：");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(y[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        // 6. 印出 z 陣列
	        System.out.println("Z 陣列：");

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(z[i][j] + "\t");
	            }
	            System.out.println();
	        }

	    }
	}

