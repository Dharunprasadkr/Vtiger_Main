package Practice;

	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class SoftAssertionPractice {
		@Test
	  public void strictLevelSoftAssertion()
	  {
		  String expectedValue = "long";
		  String actualValue = "lund";
		  SoftAssert s = new SoftAssert();
		  s.assertEquals( actualValue,  expectedValue );
		  System.out.println("Before assert all");
		  System.out.println("validation ended");
		  s.assertAll();
	  }
	  @Test
	  public void containsLevelSoftAssertion()
	  {
		  String expectedValue = "band";
		  String actualValue = "bando";
		  SoftAssert s = new SoftAssert();
		  s.assertEquals( actualValue.contains(expectedValue), true);
		  s.assertFalse(actualValue.contains(expectedValue));
		  System.out.println("validation Ended");
		  s.assertAll();
	  }
	}


