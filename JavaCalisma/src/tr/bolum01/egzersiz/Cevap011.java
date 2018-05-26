package tr.bolum01.egzersiz;
/*amerika nufusu=312,032,486
 * 7 saniyede 1 kiþi doguyor
 * 13 saniyede 1 kiþi ölüyor
 * 45 saniyede 1 gocmen
 */

public class Cevap011 {
	public static void main(String[] args) {

		System.out.println("Bir yilda: " + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 1)));

		System.out.println("Iki yilda: " + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 2)));

		System.out.println("Ucyilda: " + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 3)));

		System.out.println("Dort yilda: " + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 4)));

		System.out.println("Bes yilda: " + (312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 5)));

	}
}
