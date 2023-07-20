package org.studySpring;

import org.studySpring.phone.Mi;
import org.studySpring.phone.Phone;
import org.studySpring.phone.Vivo;

public class Hello {

	public static void main(String[] args) {
		 
		Phone phone = new Mi();
		System.out.println(phone.spaceInGb());
	}

}
