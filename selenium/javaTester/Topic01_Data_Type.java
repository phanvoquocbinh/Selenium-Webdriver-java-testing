package javaTester;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// Kiểu dữ liệu
public class Topic01_Data_Type {
	// Nguyên thủy ()
	
	// Chứa những ký tự (Duy nhất 1 ký tự)
	// char 
	char a = 'c';
	
	// Chứa số nguyên (không dấu)
	// byte 
	byte byteNumber = 50;
	// short
	short shortNumber = 50;
	// int
	int intNumber = 50;
	// long
	long longNumber = 50;
	// Chứa số thực (có dấu)
	// float
	float floatNumber = 59.635F;
	// double
	double doubleNumber = 345354.3454D;
	// Luận lý (đúng, sai)
	// boolean
	boolean status = true;
	
	
	// Tham chiếu
	
	// Chứa những chuỗi ký tự (số / chữ / đặc biệt)
	// String
	String name = "Binh";
	
	// Kiểu class
	// Class 
	Topic01_Data_Type testing;
	// Kiểu đối tượng 
	// object
	
	// Kiểu mảng
	// array
	String[] students = {"Binh", "Uyen"};
	int[] studentSalary = {1500, 1200};
	
	// Kiểu interface
	// Interface
	WebDriver driver;
	RemoteWebDriver remoteDriver;
	
	// Kiểu tập hợp (List/ Set/ Queue)
	// List: ArrayList / LinkedList
	// Collection
	List<String> studentName = new ArrayList<String>();
	
	
}
