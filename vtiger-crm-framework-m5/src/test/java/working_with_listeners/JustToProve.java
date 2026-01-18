package working_with_listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener_utility.List_Imp.class)
public class JustToProve {

	@Test
	public void createCity() {
		System.out.println("Executing test case");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = "createCity")
	public void modifyCity() {
		System.out.println("Executing test case");
		Assert.assertTrue(false);

	}

	@Test(dependsOnMethods = "modifyCity")
	public void deleteCity() {

		System.out.println("Executing test case");
		Assert.assertTrue(false);

	}
}
