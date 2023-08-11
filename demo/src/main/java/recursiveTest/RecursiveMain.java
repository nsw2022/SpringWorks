package recursiveTest;

public class RecursiveMain {

	public static void main(String[] args) {
		Dream test = new Dream(3);
		test.dreamSetp();
		// 일단 하기 쉽게 int로 테스트
		// 킥부터 테스트
		// 
		// 조건 
		// 사람인스턴스로 가지고 꿈을 매서드에 파라미터로 사람을 받아야함
		// *************************
		// 1안 Dream 안에 사람이 있고 생성자로 사람을 가변인자로 받는다 그 후 길의수에 비례해서 꿈의 크기를 키우고... 흠 이게아닌거같은데
		// 어차피 4단계까지인데 단계별조건?
	}
	
	static class Dream{
		int level;

		public Dream(int level) {
			this.level = level;
		}
		
		public void dreamSetp() {
			if (level>0) {
				System.out.println("꿈속의 현실 - 레벨" + level);
				System.out.println("노래가 점점 커져요");
				Dream nextStep = new Dream(level - 1); 
				nextStep.dreamSetp();
			}else if (level == 0) {
				System.out.println("어우추워 잠에서 일어나");
			}
		}	
	}
}

