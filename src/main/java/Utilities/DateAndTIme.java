package Utilities;

import java.time.LocalDate;

public class DateAndTIme {
public static String getCurrentDateandTime() {
	LocalDate myObj = LocalDate.now();
	String res = myObj.toString();
	return res;
}

}
