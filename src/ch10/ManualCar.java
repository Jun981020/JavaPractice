package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조정합니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟으면 정차합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼 버튼을 눌러 와이퍼를 작동합니다.");
	}

	
}
