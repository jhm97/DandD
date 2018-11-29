
public class Attack {
	public double temp;
	//private int action;
	
	public double attack(double mH, double pA) {
		return mH - pA;
	}
	public double getAttacked(double pH, double mD) {
		return pH - mD;
	}
	
}
