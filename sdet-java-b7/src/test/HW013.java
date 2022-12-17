package test;

public class HW013 {

	public static void main(String[] args) {
		boolean isPartySuccessful = cigarParty(39, false);

		System.out.println("Is party went well: " + isPartySuccessful);
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend == false) {

			return cigars >= 40 && cigars <= 60 ;
		} else {
			return cigars >= 40;

		}

	}
}
