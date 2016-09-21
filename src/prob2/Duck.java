package prob2;

public class Duck extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리(" + super.name + ")는 날지 않습니다");

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("오리(" + super.name + ")는 소리내어 웁니다");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "오리의 이름은 " + super.name + " 입니다.";
	}

}
