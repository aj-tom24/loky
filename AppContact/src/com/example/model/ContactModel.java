package com.example.model;

public class ContactModel {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactModel [name=" + name + "]";
	}

	public ContactModel(String name) {
		super();
		this.name = name;
	}
	
	
}
