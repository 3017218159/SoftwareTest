package cn.tjuscs.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab2 {

	public static void main(String[] args) throws IOException {
		//1. 定义FireFox浏览器驱动
		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		System.setProperty("webdriver.firefox.bin","D:\\Firefox\\firefox.exe"); 
		WebDriver driver = new FirefoxDriver();
		
		//二、定义要访问的网址
        String baseUrl = "http://103.120.226.190/selenium-demo/git-repo";

        //三、访问给定的网址
        File file = new File(System.getProperty("user.dir") + "/data/Selenium Lab2020.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook xwb = new XSSFWorkbook(fis);
        
        for(int numSheet = 0; numSheet < xwb.getNumberOfSheets(); numSheet++) {
        	XSSFSheet xSheet = xwb.getSheetAt(numSheet);
        	if(xSheet == null) {
        		continue;
        	}
        	
        	for(int numRow = 0; numRow < 20; numRow++) {
        		XSSFRow xRow = xSheet.getRow(numRow);
        		if(xRow != null) {
        			XSSFCell id = xRow.getCell(1);
        			XSSFCell psw = xRow.getCell(2);
        			driver.get(baseUrl);
        			
        			WebElement userName = driver.findElement(By.name("user_number"));
        			userName.sendKeys(String.valueOf(id.getStringCellValue()));
        			//System.out.println(String.valueOf(id.getStringCellValue()));
        			WebElement passName = driver.findElement(By.name("password"));
        			passName.sendKeys(String.valueOf(psw.getStringCellValue()));
        			//System.out.println(String.valueOf(psw.getStringCellValue()));
        			WebElement submitName = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
        			submitName.click();
        			
        			WebElement textShow = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code"));
        			int index = numRow + 1;
        			if(textShow.getText().equals(String.valueOf(psw.getStringCellValue()))) {
        				System.out.println(index + ". Success!");
        			}else {
        				System.out.println(index + ". Failed!");
        			}
        		}
        		else
        			break;
        	}
        	driver.close();
        }
        
	}

}
