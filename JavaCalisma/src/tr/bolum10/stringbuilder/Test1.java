package tr.bolum10.stringbuilder;

public class Test1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome");
		sb.append(" ");
		sb.append("To");
		sb.append(" ");
		sb.append("Java");
		// 11.karakterden sonra araya asagidaki cumleyi ekler
		sb.insert(11, "HTML and ");
		System.out.println(sb);

		// 9 10 silinir
		sb.delete(8, 11);
		System.out.println(sb);

		// 9. karakteri siler diziler 0dan baslar
		sb.deleteCharAt(8);
		System.out.println(sb);

		// yaziyi ters cevirir
		sb.reverse();
		System.out.println(sb);

		// 11. karakterden 14uncu karatere kadar olan kisma verilen string degeri basar
		// onune gelenin uzerine yazar
		sb.replace(11, 15, "HTML");
		System.out.println(sb);

		// 0. indexteki karakteri istenen karakter ile degistirir
		sb.setCharAt(0, 'w');
		System.out.println(sb);
	}

}
