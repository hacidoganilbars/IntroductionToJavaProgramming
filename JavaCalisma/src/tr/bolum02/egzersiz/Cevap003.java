package tr.bolum02.egzersiz;

import java.util.Scanner;

//kosucunun ayak boyunu metreye cevirme
//1 ayak boyu 0.305 metre
public class Cevap003 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Kosucunun adým sayisini giriniz: ");
		double ayakBoyu = klavye.nextDouble();

		double ayakBoyuMetreCinsinden = ayakBoyu * 0.305;
		System.out.println("Koþucunun yaptigi mesafe= " + ayakBoyuMetreCinsinden + " metredir.");
		klavye.close();
	}

}
