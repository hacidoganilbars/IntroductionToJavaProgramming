package tr.bolum09.egzersiz.cevap009;

public class EskenarCokgenIslem {
	public static void main(String[] args) {
		EskenarCokgen eskenarCokgen1 = new EskenarCokgen();
		EskenarCokgen eskenarCokgen2 = new EskenarCokgen(6, 4);
		EskenarCokgen eskenarCokgen3 = new EskenarCokgen(10, 4, 5.6, 7.8);

		System.out.println("\n--------------------------------------------------");
		System.out.println("| Eskenar Cokgen Objeleri |  Cevre  |  Alan  |");
		System.out.println("--------------------------------------------------");
		System.out.printf("|       Obje# 1 =====>    |%8.2f |%6.2f  |\n", eskenarCokgen1.getCevre(),
				eskenarCokgen1.getAlan());
		System.out.printf("|       Obje# 2 =====>    |%8.2f |%6.2f  |\n", eskenarCokgen2.getCevre(),
				eskenarCokgen2.getAlan());
		System.out.printf("|       Obje# 3 =====>    |%8.2f |%6.2f  |\n", eskenarCokgen3.getCevre(),
				eskenarCokgen3.getAlan());
		System.out.println("--------------------------------------------------");
	}

}
