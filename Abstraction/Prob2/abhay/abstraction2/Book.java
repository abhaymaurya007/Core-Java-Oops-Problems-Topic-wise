package Prob2.abhay.abstraction2;

public abstract class Book {
           String title;
           public   abstract void  setTitle(String s);
           public   String  getTitle(){
        	   return title;
           }
		public Book(String title) {
			super();
			this.title = title;
		}
		
           
}
