package prob2;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("참새(" + super.name + ")가 날아다닙니다");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("참새(" + super.name + ")가 소리내어 웁니다");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참새의 이름은 " + super.name + "입니다";
	}
}
