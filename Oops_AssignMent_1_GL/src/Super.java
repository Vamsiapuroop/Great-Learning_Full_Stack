import java.util.*;
class Super_Department {
	int a=10;
	 public  String departmentName() {
		String a="Super Department";
		return a;
	}
	 public String getTodaysWork() {
		 String b="No work for today";
		 return b;
	 }
	 public  String getWorkDeadline() {
		 String c="Nil";
		 return c;
	 }
	 public  String isTodayAHoliday() {
		 String d="Today is not a holiday";
		 return d;
	 }

}

class Admin_Department extends Super_Department{
	public  String departmentName() {
		String a="Welcome to Admin Department";
		return a;
	}
	public String getTodaysWork() {
		 String b="Complete your documents Submission";
		 return b;
	 }
	public  String getWorkDeadline() {
		 String c="Complete by EOD";
		 return c;
	 }
	
	
}

class  Hr_Department extends Super_Department{
	public  String departmentName() {
		String a="Welcome to Hr Department";
		return a;
	}
	public String getTodaysWork() {
		 String b="Fill today’s worksheet and mark your attendance";
		 return b;
	 }
	public  String getWorkDeadline() {
		 String c="Complete by EOD";
		 return c;
	 }
	public String  doAcitivity(){
		String d="team lunch";
		return d;
		
	}
}

class Tech_Department extends Super_Department{
	public String departmentName() {
		String a="Welcome to Tech Department";
		return a;
	}
	public String getTodaysWork() {
		 String b="Complete coding of module 1";
		 return b;
	 }
	public  String getWorkDeadline() {
		 String c="Complete by EOD";
		 return c;
	 }
	public String getTechStackInformation() {
		String d="core Java";
		return d;
	}
}





public class Super{
	public static void main(String[] args) {
		Admin_Department obj=new Admin_Department();
		
		System.out.println(obj.departmentName());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(obj.isTodayAHoliday());
		System.out.println();
		System.out.println();
		
		Hr_Department obj1=new Hr_Department();
		System.out.println(obj1.departmentName());
		System.out.println(obj1.doAcitivity());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		Tech_Department obj2=new Tech_Department();
		System.out.println(obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.getTechStackInformation());
		System.out.println(obj2.isTodayAHoliday());
		
		
	}
}

