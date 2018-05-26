package com.singtel.living.mammals;

public enum ParrotLiving {
	DOGS("Woof, woof"), 
	CATS("Meow"), 
	ROOSTER("Cock-a-doodle-doo");
	
	private String says;

	ParrotLiving(String says) {
		this.says = says;
	}

	public String getSays() {
		return says;
	}

	public void setSays(String says) {
		this.says = says;
	}
	
}
