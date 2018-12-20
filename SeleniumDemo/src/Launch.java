import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Launch
{
	public static void main(String args[]) throws InterruptedException 
	{
		/* LAUNCH CHROME BROWSER
		System.setProperty("WebDriver.chrome.driver", "C:\\selenium components\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		*/
		
		/* LAUNCH FIREFOX BROWSER
		System.setProperty("WebDriver.gecko.driver", "C:\\selenium components\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		*/
		
		/* AUTOMATE GMAIL APPLICATION
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.close();
		*/
		
		/* GET TITLE 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter expected Title : ");
		String expectedTitle=scan.nextLine();
		
		String actualTitle=driver.getTitle();
		
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		*/
		
		/* GET CURRENT URL
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		*/
		
		/* PAGE SOURCE
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getPageSource());
		*/
		
		/* REDIRECT TO LOGIN PAGE OR NOT
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String expectedUrl="https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		if(expectedUrl.equals(actualUrl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		*/
		
		/* MAXIMIZE THE CHROME BROWSER
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		*/
		
		/*GET TITLE AND CURRENT URL OF THE PAGE BASED ON THE BROWSER NAME GEIVEN BY THE USER 
		Scanner scan=new Scanner(System.in);
		System.out.println("User Enter the Browser : ");
		String browser=scan.nextLine();
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else
		{
			FirefoxDriver f=new FirefoxDriver();
			test(f);	
		}
	}
		
		
		public static void test(ChromeDriver driver)
		{
			driver.get("https://www.gmail.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
		public static void test(FirefoxDriver driver)
		{
			driver.get("https://www.gmail.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
		*/
		
		/*  SAME AS ABOVE PROGRAM BUT HERE USING POLYMORPHIC VERSION
		Scanner scan=new Scanner(System.in);
		System.out.println("User Enter the Browser : ");
		String browser=scan.nextLine();
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else
		{
			FirefoxDriver f=new FirefoxDriver();
			test(f);	
		}
	}
		
		
		public static void test(WebDriver driver)
		{
			driver.get("https://www.gmail.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
		*/
		
		/* LOCATORS :  USED TO IDENTIFY THE WEB ELEMENTS IN THE WEB PAGE
		// ID ,NAME ,CLASSNAME ,LINKTEXT ,partialLinkText ,
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//WebElement email=driver.findElement(By.id("email"));
		//WebElement pass=driver.findElement(By.name("pass"));
		//WebElement email=driver.findElement(By.className("inputtext"));
		//WebElement forgot=driver.findElement(By.linkText("Forgotten account?"));
		//WebElement forgot=driver.findElement(By.partialLinkText("Forgotten"));
		//forgot.click();
		 */
		
		
		/* CSSSELECTORS (cssSelectors)
		// Tag&Id , Tag&Class , Tag&Attribute , (Tag,Class&Attribute) , SubStrings(startsWith(^),endsWith($),contains(*))
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//WebElement tagid=driver.findElement(By.cssSelector("input#email"));
		//WebElement tagClass=driver.findElement(By.cssSelector("input.inputtext"));
		//WebElement tagAttribute=driver.findElement(By.cssSelector("input[type='email']"));
		//WebElement tagClassAttribute=driver.findElement(By.cssSelector("input.inputtext[id='email']"));
		//WebElement startsWith=driver.findElement(By.cssSelector("input[id ^='email']"));
		//WebElement endsWith=driver.findElement(By.cssSelector("input[type$='password']"));
		//WebElement contains=driver.findElement(By.cssSelector("input[id*='email']"));
		//contains.sendKeys("naresh@gmail.com");
		*/
		
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.com/");
		WebElement myacct=driver.findElement(By.linkText("My Account"));
		myacct.click();
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mzaidurrahman@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();
		*/
		
		
		/* pageLoadTimeOut :checks whether the page loaded within the specified time or not
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement myacct=driver.findElement(By.linkText("My Account"));
		myacct.click();
		*/
		
		/* Handling Drop-down or Combo-Box
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://account.magento.com/customer/account/create/");
		WebElement dropdown=driver.findElement(By.id("customer_company_type"));
		Select s=new Select(dropdown);
		s.selectByIndex(3);//index value
		Thread.sleep(5000);
		s.selectBValue("Tech Partner");
		Thread.sleep(5000);
		s.selectByVisibleText("Analyst/Media");
		driver.close();
		*/
		
		//* X-PATH
		
		/* SYNCHRONISATION OR WAITS IN SELENIUM :implicitlyWait , explicitlyWait
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.get("https://magento.com/");
		WebElement myacct=driver.findElement(By.linkText("My Account"));
		myacct.click();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mzaidurrahman@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();
		*/
		
		//*Decreasing the size of the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(9000);
		Dimension dim=driver.manage().window().getSize();
		System.out.println("get height="+dim.getHeight());
		System.out.println("get height="+dim.getWidth());
		Dimension ndim=new Dimension(dim.getHeight()/2,dim.getWidth()/2);
		driver.manage().window().setSize(ndim);
		System.out.println("get height="+ndim.getHeight());
		System.out.println("get height="+ndim.getWidth());
		
		
		//*
		
		
	}
}