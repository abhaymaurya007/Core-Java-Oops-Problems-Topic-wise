package Prob2.abhay.abstraction2;

public class MyBook extends Book {
       
	

	

	public MyBook(String title) {
		super(title);
	}

	@Override
	public void setTitle(String s) {
		// TODO Auto-generated method stub
       super.title=s; 
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return  super.title ;
		
	}
;
}
