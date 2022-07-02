package coachit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		String num="7666246206";
		Pattern p=Pattern.compile("[6-9][0-9] {9}");
		Matcher m=p.macher("7666246206");
		System.out.println(m.find());
	    System.out.println(m.group());	
	}

}
