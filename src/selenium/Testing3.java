package selenium;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Testing3 {

	String browsername;
	String UserType;
	String password;
	
	public Testing3(String browsername,String UserType,String password) {
		this.browsername = browsername;
		this.UserType = UserType;
		this.password = password;
	}
	
	@Test
	public void Username() {
		System.out.println(browsername+"----"+UserType+"----"+password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Parameters
	public static Collection <Object[]> getData(){
		Object[][] data = new Object[4][3];
		data[0][0] = "chrome";
		data[0][1] = "Admin";
		data[0][2] = "p1";
		
		data[1][0] = "FF";
		data[1][1] = "Business Analyst";
		data[1][2] = "p2";
		
		data[2][0] = "Safari";
		data[2][1] = "Devlopers";
		data[2][2] = "p3";
		
		data[3][0] = "Opera";
		data[3][1] = "Tester";
		data[3][2] = "p4";
		
		return Arrays.asList(data);
		
	}
	
}
