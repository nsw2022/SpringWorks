package bycycle;

public class PokaBycycle implements BycycleCategory {
	
	int ba;
	barr[] barr;
	Handle nohandleisDie;
	Baguni baguni;
	
	public PokaBycycle() {
		System.out.println("포카리 자전거 입니다.");
	}
	
	@Override
	public void go() {
		System.out.println("샤랄라 브금이 깔리며 출발.");

	}

	@Override
	public void fix() {
		System.out.println("포카리 수리해요");
	}

	@Override
	public void fall() {
		System.out.println("포카리가 넘어져유 포카리 주으면 임자");
	}

	public int getBa() {
		return ba;
	}

	public void setBa(int ba) {
		this.ba = ba;
	}

	public barr[] getBarr() {
		return barr;
	}

	public void setBarr(barr[] barr) {
		this.barr = barr;
	}



	public Handle getNohandleisDie() {
		return nohandleisDie;
	}

	public void setNohandleisDie(Handle nohandleisDie) {
		this.nohandleisDie = nohandleisDie;
	}

	public Baguni getBaguni() {
		return baguni;
	}

	public void setBaguni(Baguni baguni) {
		this.baguni = baguni;
	}
	
	

}
