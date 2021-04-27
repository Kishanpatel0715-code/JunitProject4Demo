package selenium;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
//import org.junit.internal.MethodSorter;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Testing2 {

	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	@Test
	public void CreateUser() {
		String val = "abc";
		String val2 = "abc";
		
		System.out.println("before assertion");
		Assert.assertEquals(val, val2);
		System.out.println("after assertion");
		try {
		  Assert.assertEquals(2>3,"2 is grater than 3");
		}catch(Throwable t) {
			System.out.println("after second assertion");
		}
		
		
	}
	
	@Test
	public void EditUser() {
		String expected = "abc";
		String actual = "abc1";
		
		System.out.println("before assertion");
		try {
			Assert.assertEquals(expected, actual);
		}catch(Throwable t) {
			//err.addError(t);
			System.out.println("catch 1");
			err.addError(t);
		}
		
	}
}
