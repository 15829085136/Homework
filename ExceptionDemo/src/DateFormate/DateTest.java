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
			System.err.println("���ڸ�ʽ�������");
		}
		System.out.println("�����ַ���תΪDate����"+date);
		System.out.println("��yyyy-MM-dd�ĸ�ʽ��������ַ�����"+format.format(date));
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
		System.out.println("����������");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		DateTest at=new DateTest(str);
		at.changeStringToDate();


		
		
	}
}
