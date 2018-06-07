package tr.bolum13.clonable.house;

public class HouseTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		House house1 = new House(1, 1750.50);
		House house2 = (House) house1.clone();
		System.out.println(house1.compareTo(house2));
		System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());
		System.out.println(house1.getWhenBuilt().compareTo(house2.getWhenBuilt()));

	}

}
