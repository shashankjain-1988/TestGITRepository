import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testNgTest {
	

@Test
public void Test1()
{
	System.out.println("Test1 invoked");
}
@Test
public void Test2()
{
	System.out.println("Test2 invloked");
}
@org.testng.annotations.BeforeMethod
public void BeforeMethod()
{
	System.out.println("Before method invoked");
	System.out.println("Test commit");
	System.out.println("Test Pull");
	System.out.println("Amritesh");
}
	
@org.testng.annotations.AfterMethod
public void AfterMethod()
{
	System.out.println("After method invoked");
	
}
@org.testng.annotations.BeforeClass
public void BeforeClass(){
	System.out.println("Before class invoked");
}
//@org.testng.annotations.AfterClass
//public void AfterClass(){
//	System.out.println("After class in invoked");
//}
}

