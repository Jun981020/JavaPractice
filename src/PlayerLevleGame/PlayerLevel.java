package PlayerLevleGame;

public interface PlayerLevel {

	void run();
	
	void jump();
	
	void turn();
	
	public void showLevelMessage();
	
	//인터페이스에서 default 생성자로 메서드를 구현할수 있다. 
	default void go(int count) {
		showLevelMessage();
		run();
		jump();
		turn();
	}
	
}
