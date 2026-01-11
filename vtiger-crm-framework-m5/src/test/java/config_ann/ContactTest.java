package config_ann;

import org.testng.annotations.Test;

import base_utility.BaseClass;

public class ContactTest extends BaseClass {

	@Test
	public void createContact() {
		System.out.println("Contact Created");
	}
	
	@Test
	public void verifyContact() {
		System.out.println("Contact Verified");
	}

}
