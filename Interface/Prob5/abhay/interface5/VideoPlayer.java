package Prob5.abhay.interface5;

public class VideoPlayer implements AdvancedmediaPlayer {
    String title;
    
	public VideoPlayer(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("video is playing");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("video Stopped");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method 
  System.out.println("video paused");
		
	}
	

}
