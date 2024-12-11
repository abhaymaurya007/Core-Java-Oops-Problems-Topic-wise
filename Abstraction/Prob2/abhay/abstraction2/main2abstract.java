package Prob2.abhay.abstraction2;

public class main2abstract {
        public static void main(String[] args) {
			MyBook m1=new MyBook("A tale of two cities");
			System.out.println(m1.getTitle());
			m1.setTitle("history of java");
			System.out.println(m1.getTitle());
		}
}
