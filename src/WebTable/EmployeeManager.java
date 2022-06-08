package WebTable;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeManager {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		System.out.println("browser is launched");
		
		driver.findElement(By.xpath("//*[@id='demotable']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		List<WebElement> list=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='empmanager']//tbody//tr")));
		
		Map<String,Integer> employeeManagerReport= new HashMap<>();
		for(int index=1; index<=list.size(); index++) {
			String managerId=driver.findElement(By.xpath("//div[@id='empmanager']//tbody//tr["+index+"]//td[4]")).getText();
			if(employeeManagerReport.containsKey(managerId)) {
				int count=employeeManagerReport.get(managerId)+1;
				employeeManagerReport.put(managerId,count);
			}else {
				employeeManagerReport.put(managerId, 1);
			}
		}
		System.out.println(employeeManagerReport);
		driver.quit();
		
		
}}
