package Day1;


import org.testng.annotations.*;



public class AnnotationDemo {

	
		
		@BeforeSuite
		public void bsuite()
		{
			System.out.println("Before Suite method");
		}
		@BeforeTest
		public void Btest()
		{
			System.out.println("Before test method");
		}
		@BeforeClass
		public void bclass()
		{
			System.out.println("Before test method");
		}
		@BeforeMethod
		public void bmethod()
		{
			System.out.println("Beforemethod method");
		}
		
		@Test
		public void t1()
		{
			System.out.println("Test t1");
		}
		@Test
		public void t2()
		{
			System.out.println("Test t2");
			
			
		}
		@AfterMethod
		public void amethod()
		{
			System.out.println("After method");
		}
		@AfterClass
		public void aclass()
		{
			System.out.println("After class");
			
		}
		@AfterTest
		public void atest()
		{
			System.out.println("After test");
			
		}
		
		@AfterSuite
		public void asuite()
		{
			System.out.println("After suite");
			
		}
		
		
		
		

	}


