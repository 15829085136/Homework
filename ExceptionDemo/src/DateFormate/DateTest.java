package DateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	private String str;
	public DateTest(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public void changeStringToDate() {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		String t=change();
		try {
			date = format.parse(t);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("日期格式输入错误！");
		}
		System.out.println("日期字符串转为Date对象："+date);
		System.out.println("按yyyy-MM-dd的格式输出日期字符串："+format.format(date));
	}

	public String change(){
		char[] c=new char[str.length()];
		for(int i=0;i<str.length();i++){
			c[i]=str.charAt(i);
			if(c[i]=='/'){
				c[i]='-';
			}
		}
		return new String(c);
	}
	
	public static void main(String[] args) {
		System.out.println("请输入日期");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		DateTest at=new DateTest(str);
		at.changeStringToDate();


		
		
	}
}
