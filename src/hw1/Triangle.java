package hw1;


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入三個整數：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 先排序，讓 x <= y <= z，z 是最長邊
        int x = Math.min(a, Math.min(b, c));
        int z = Math.max(a, Math.max(b, c));
        int y = a + b + c - x - z;

        // 三角形成立條件：邊長都大於 0，且兩短邊之和大於最長邊
        if (x <= 0 || x + y <= z) {
            System.out.println("不是三角形");
        } else if (a == b && b == c) {
            System.out.println("正三角形");
        } else if (x * x + y * y == z * z) {
            // 進階：直角三角形（畢氏定理）
            System.out.println("直角三角形");
        } else if (a == b || b == c || a == c) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("其它三角形");
        }
        sc.close();
    }
}