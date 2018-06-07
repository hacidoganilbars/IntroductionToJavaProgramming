package tr.bolum13.clonable.house;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {

	private int id;
	private double area;
	private Date whenBuilt;

	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new Date();
	}

	public int getId() {
		return id;
	}

	public double getArea() {
		return area;
	}

	public Date getWhenBuilt() {
		return whenBuilt;
	}

	/*
	 * @Override public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	public Object clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		House houseClone = (House) super.clone();
		// Deep copy on whenBuilt
		houseClone.whenBuilt = (Date) (whenBuilt.clone());
		return houseClone;
	}

	/*
	 * public Object clone() { try { // Perform a shallow copy House houseClone =
	 * (House) super.clone(); // Deep copy on whenBuilt houseClone.whenBuilt =
	 * (Date) (whenBuilt.clone()); return houseClone; } catch
	 * (CloneNotSupportedException ex) { return null; } }
	 */

	@Override
	public int compareTo(House o) {
		if (area > o.getArea()) {
			return 1;
		} else if (area < o.getArea()) {
			return -1;
		} else {
			return 0;
		}

	}
}
