package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;
	public void setItemsReceived(int itemsReceived) {
		if(itemsReceived/itemsReceived == -1) {
			itemsReceived = 0;
		}
		this.itemsReceived = itemsReceived;
	}
	
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;
	public void setDegreesTurned(double degreesTurned) {
		if(degreesTurned > 360.0 ) {
			degreesTurned = 360.0;
		}
		else if(degreesTurned < 0.0) {
			degreesTurned = 0.0;
		}
		this.degreesTurned = degreesTurned;
	}
	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;
	public void setNomentclature(String nomenclature) {
		if(nomenclature.compareTo("") == 0)  {
			nomenclature = " ";
		}
		this.nomenclature = nomenclature;
	}
	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	public void setMemberObj(Object memberObj) {
		//if(!(memberObj.toString() == null || memberObj.toString() == memberObj)) {
			
		//}
		String string = new String();
		System.out.println(memberObj instanceof String);
		if(memberObj instanceof String == true) {
			memberObj = new Object();
		}
	}
}
