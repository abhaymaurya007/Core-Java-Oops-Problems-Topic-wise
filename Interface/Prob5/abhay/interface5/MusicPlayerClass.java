package Prob5.abhay.interface5;

public class MusicPlayerClass implements AdvancedmediaPlayer{
    String title;
    
	public MusicPlayerClass(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Music is playing");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Music Stopped");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method 
  System.out.println("Music paused");
		
	}
	
	

}
