package PlayerLevleGame;

public interface PlayerLevel {

	void run();
	
	void jump();
	
	void turn();
	
	public void showLevelMessage();
	
	default void go(int count) {
		showLevelMessage();
		run();
		for(int i =1;i<=count;i++) {
			jump();
		}
		turn();
	}
	
}
