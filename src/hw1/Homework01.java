package hw1;

public class Homework01 {
	  public static void main(String[] args) {
		  
	        // 第1題：計算 12、6 這兩個數值的和與積
	        int a = 12, b = 6;
	        System.out.println("【第1題】");
	        System.out.println("和 = " + (a + b));
	        System.out.println("積 = " + (a * b));
	 
	        // 第2題：200 顆蛋共是幾打幾顆（一打 12 顆）
	        int eggs = 200;
	        int dozens = eggs / 12;      // 整數除法，取商
	        int remain = eggs % 12;      // 取餘數
	        System.out.println("\n【第2題】");
	        System.out.println(eggs + " 顆蛋 = " + dozens + " 打又 " + remain + " 顆");
	 
	        // 第3題：256559 秒 = 幾天幾小時幾分幾秒
	        int totalSeconds = 256559;
	        int days = totalSeconds / (24 * 60 * 60);
	        int hours = totalSeconds % (24 * 60 * 60) / (60 * 60);
	        int minutes = totalSeconds % (60 * 60) / 60;
	        int seconds = totalSeconds % 60;
	        System.out.println("\n【第3題】");
	        System.out.println(totalSeconds + " 秒 = " + days + " 天 " + hours + " 小時 "
	                + minutes + " 分 " + seconds + " 秒");
	 
	        // 第4題：常數 PI = 3.1415，半徑 5 的圓面積與圓周長
	        final double PI = 3.1415;    // final 宣告後即為常數，不可再修改
	        double r = 5;
	        System.out.println("\n【第4題】");
	        System.out.println("圓面積 = " + (PI * r * r));
	        System.out.println("圓周長 = " + (2 * PI * r));
	 
	        // 第5題：本金 150 萬，年利率 2%，複利 10 年
	        // 公式：本利和 = 本金 × (1 + 利率) ^ 年數
	        double principal = 1500000;
	        double rate = 0.02;
	        int years = 10;
	        double total = principal * Math.pow(1 + rate, years);
	        System.out.println("\n【第5題】");
	        System.out.printf("10 年後本金加利息共 %.2f 元%n", total);
	 
	        // 第6題：三個運算式
	        System.out.println("\n【第6題】");
	        System.out.println(5 + 5);      // 10
	        System.out.println(5 + '5');    // 58
	        System.out.println(5 + "5");    // 55
	        // 說明：
	        // 5 + 5     ：兩個都是 int，做數學加法，結果 10。
	        // 5 + '5'   ：'5' 是 char，會自動轉成它的 ASCII 碼 53，所以 5 + 53 = 58。
	        // 5 + "5"   ："5" 是 String，+ 變成
}
}
