package PlayerLevleGame;

public class AdvancedLevel implements PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높게 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn을 못합니다ㅠㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====중급자 레벨입니다.=====");
	}


}
