package edu.learn.reminder;

public class Reminder {
	
	private String name;
	
	private String description;
	
	private String contacts;
	
	public boolean setName (String name) {
		if (this.name == null) {
			this.name = new String(name);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean setDescription (String description) {
		if (this.description == null) {
			this.description = new String(description);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean setContacts (String contacts) {
		if (this.contacts == null) {
			this.contacts = new String(contacts);
			return true;
		} else {
			return false;
		}
	}
	
	public void showReminder() {
		System.out.println("У Вас запланирована задача");
		if (name != null) {
			System.out.println(name);
		}
		if (description != null) {
			System.out.println("Описание:");
			System.out.println(description);
		}
		if (contacts != null) {
			System.out.println("Контакты:");
			System.out.println(contacts);
		}
	}

}
