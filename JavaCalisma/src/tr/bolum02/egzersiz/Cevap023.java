package tr.bolum02.egzersiz;

import java.util.Scanner;

/*
 * Surus maliyeti hesaplama
 * 
 * aracin aldigi mesafe
 * galon basina ne kadar gittigi
 * galon basina ne kadar ucret odendigini biliyorsak
 * surus maliyetini hesaplayabiliriz
 * 
 * 
 */
public class Cevap023 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("Mesafeyi giriniz(orn=900,5): ");
		double mesafe = klavye.nextDouble();

		System.out.print("Galon basina kac mil gitti(orn=25,5): ");
		double galonBasinaMil = klavye.nextDouble();

		System.out.print("Galon basina ucreti  giriniz(orn= 3,55): ");
		double galonBasinaUcret = klavye.nextDouble();

		double surusMaliyeti = (int) ((mesafe / galonBasinaMil) * galonBasinaUcret * 100) / 100.0;

		System.out.print("Surus maliyeti: " + surusMaliyeti + "tl");

		klavye.close();

	}

}
