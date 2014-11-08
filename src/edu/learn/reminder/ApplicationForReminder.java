package edu.learn.reminder;

public class ApplicationForReminder {
	
	private static Reminder reminder = new Reminder();

	public static void main (String[] args) {
		Reminder reminder = verifyArguments(args);
		reminder.showReminder();
	}
	
	private static Reminder verifyArguments (String[] arguments) {
		
		for (int i = 0; i < arguments.length-1; i++) {
			if (HandlerArguments.isParametr(arguments[i])) {
				if (i+1<arguments.length) {
					if (!HandlerArguments.isParametr(arguments[i+1])) {
						if (HandlerArguments.isName(arguments[i])) {
							reminder.setName(arguments[i+1]);
							i++;
						} if (HandlerArguments.isDescription(arguments[i])) {
							reminder.setDescription(arguments[i+1]);
							i++;
						} if (HandlerArguments.isContacts(arguments[i])) {
							reminder.setContacts(arguments[i+1]);
							i++;
						}
					}
				}
			}
		}
		
		return reminder;
	}
	
}
