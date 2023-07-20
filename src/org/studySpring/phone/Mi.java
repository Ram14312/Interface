package org.studySpring.phone;

public class Mi implements Phone{

	@Override
	public String processor() {
		return "snapDragon";
	}

	@Override
	public String os() {
		return "Windows";
	}

	@Override
	public int spaceInGb() {
		return 12;
	}

}
