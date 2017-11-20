package Count;
import java.util.Scanner;

class MyException extends RuntimeException{
	public MyException(){
		
	}
	public MyException(String arg0){
		 super(arg0);
	}
	
	public void DemoException(){
		System.out.println("16进制数输入不正确！");
	}
}

class ChangeCount{
	private String SixTeen;
	private int Ten;
	public ChangeCount(){
		
	}
	
	public ChangeCount(String SixTeen){
		this.SixTeen=SixTeen;
	}
	
	
	public String getSixTeen() {
		return SixTeen;
	}


	public void setSixTeen(String sixTeen) {
		SixTeen = sixTeen;
	}


	public int getTen() {
		return Ten;
	}


	public void setTen(int ten) {
		Ten = ten;
	}


	public int change(char a){
		int x;
		switch(a){
		case '0': x=0;
		break;
		case '1': x=1;
		break;
		case '2': x=2;
		break;
		case '3': x=3;
		break;
		case '4': x=4;
		break;
		case '5': x=5;
		break;
		case '6': x=6;
		break;
		case '7': x=7;
		break;
		case '8': x=8;
		break;
		case '9': x=9;
		break;
		case 'a': x=10;
		break;
		case 'b': x=11;
		break;
		case 'c': x=12;
		break;
		case 'd': x=13;
		break;
		case 'e': x=14;
		break;
		case 'f': x=15;
		break;
		default:
			throw new MyException();
		}
		return x;
	}
	
	public void changeCount(){
		int y=0;
		for(int i=0;i<SixTeen.length();i++){
				y+=change(SixTeen.charAt(i))*Math.pow(16, SixTeen.length()-(i+1));
			}
		System.out.println(y);
		}
}

public class Demo {
	public static void main(String[] args) {
		System.out.println("请输入一个十六进制数：");
		Scanner scan=new Scanner(System.in);
		String SixTeen=scan.next();
		ChangeCount changeCount=new ChangeCount(SixTeen);
		try {
			changeCount.changeCount();
		} catch (MyException e) {
			e.DemoException();
		}
		
	}
	
}
