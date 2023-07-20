package org.studySpring.phone;

public class Vivo implements Phone {

	@Override
	public String processor() {
		return "Quadrag";
	}

	@Override
	public String os() {
		return "Linux";
	}

	@Override
	public int spaceInGb() {
		return 16;
	}

}
