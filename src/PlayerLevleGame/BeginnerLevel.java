package PlayerLevleGame;

public class BeginnerLevel implements PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump를 할수없습니다!");
	}

	@Override
	public void turn() {
		System.out.println("turn 할수없습니다ㅜㅜ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====초급자 레벨입니다====");
	}


}
