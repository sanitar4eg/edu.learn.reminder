package edu.learn.reminder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandlerArguments {
	
	private static final String PARAMETR = "^-[ndc]$";
	
	private static final String NAME = "-n";
	
	private static final String DESCRIPTION = "-d";
	
	private static final String CONTACTS = "-c";
			
	private static Pattern parametrPattern = Pattern.compile(PARAMETR);
	
	public static boolean isParametr (String string) {
		Matcher matcher = parametrPattern.matcher(string);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean isName(String string) {
		if (string.equals(NAME)) {
			return true;
		}
		return false;
	}
	
	public static boolean isDescription(String string) {
		if (string.equals(DESCRIPTION)) {
			return true;
		}
		return false;
	}
	
	public static boolean isContacts(String string) {
		if (string.equals(CONTACTS)) {
			return true;
		}
		return false;
	}
}

