package tr.bolum10;

public class ArrayDeneme {
	public static void main(String[] args) {

		String[] dizi = { "Ahmet", "Mehmet", "Veli", "H�seyin", "Mahmut", "Do�an", "Gamze", "Yusuf", "Hac�" };
		dizi[2] = null;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]==null) {
				i=i+1;
			}
			System.out.print(dizi[i] + ", ");
		}

	}

}
