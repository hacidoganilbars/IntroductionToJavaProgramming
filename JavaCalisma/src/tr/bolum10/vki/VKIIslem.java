package tr.bolum10.vki;

public class VKIIslem {
	public static void main(String[] args) {
		
		VKI vki1 = new VKI("Ali Veli", 24, 145, 70);
		System.out.println(vki1.getIsim() + " icin VKI " + vki1.getVKI() + " " + vki1.getDurum());

		VKI vki2 = new VKI("Zeynep Dogan", 215, 70);
		System.out.println(vki2.getIsim() + " icin VKI " + vki2.getVKI() + " " + vki2.getDurum());
	}

}
