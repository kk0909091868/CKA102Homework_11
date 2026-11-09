package hw1;

public class Studenttest {
	 public static void main(String[] args) {
		
		 
		 Student student1 = new Student();
	        Student student2 = new Student();

	        student1.study(5);
	        student1.play(2);

	        student2.play(3);
	        student2.study(10);

	        System.out.println("學生1分數:" + student1.score);
	        System.out.println("學生2分數：" + student2.score);
		 
	 }
	 }

