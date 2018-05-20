package tr.bolum05;

import java.util.Scanner;

public class OnlukTabandanOnaltilikTabana {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Bir Tamsayı giriniz: ");
		int ondalikSayi = klavye.nextInt();
		int ondalikSayiTemp = ondalikSayi;
		String onaltilikSayi = "";

		while (ondalikSayi > 0) {
			int basamak = ondalikSayi % 16;
			if (basamak < 10) {
				onaltilikSayi = basamak + onaltilikSayi;
			} else {
				onaltilikSayi = (char) ('A' + (basamak - 10)) + onaltilikSayi;
			}
			ondalikSayi /= 16;
		}
		System.out.println(ondalikSayiTemp + " tamsayisinin onlatilik tabanda karsiligi: " + onaltilikSayi);

		klavye.close();
	}

}
