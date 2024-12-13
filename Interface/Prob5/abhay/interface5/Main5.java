package Prob5.abhay.interface5;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the tittle");
		String tittle=sc.nextLine();
		if(tittle.isEmpty()||tittle.isBlank())
		{
			System.out.println("invalid tittle");
		}
		else
		{
			VideoPlayer v1=new VideoPlayer("tere nal mer java");
			v1.play();
			v1.pause();
			v1.stop();
		}
		System.out.println("Enter audio title :");
		String st=sc.nextLine();
		boolean empty = st.isBlank();
		if(empty) {
			System.out.println("Invalid title");
		}else {
		
		MusicPlayerClass m1=new MusicPlayerClass("Beliver");
		m1.play();
		m1.pause();
		m1.stop();
		}
		sc.close();
		
	}

}
