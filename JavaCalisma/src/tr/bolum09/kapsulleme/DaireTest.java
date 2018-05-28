package tr.bolum09.kapsulleme;

public class DaireTest {
	private double yariCap = 1;

	public double getAlan() {
		return Math.PI * yariCap * yariCap;
	}

	public static void main(String[] args) {
		DaireTest daireTest = new DaireTest();
		System.out.println(daireTest.yariCap);
	}

}
