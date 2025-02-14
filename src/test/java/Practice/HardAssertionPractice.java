package Practice;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class HardAssertionPractice {
		
	  @Test
	  public void strictLevelHardAssertion() 
	  
	  
	  {
		  String expectedName = "soumya";
		  String actualName = "swagatika";
		 // Assert.assertEquals(actualName, expectedName);
		  Assert.assertEquals(actualName.contains(expectedName), true);		
		  System.out.println("Validation Ended");		
	  }
	 @Test
	 public void containsLevelHardAssertion()
	 {
		 String expectedName = "Don";
		 String actualName = "London";
		 Assert.assertTrue(actualName.contains(expectedName));
		 System.out.println("validation Ended");
	 }
	}


