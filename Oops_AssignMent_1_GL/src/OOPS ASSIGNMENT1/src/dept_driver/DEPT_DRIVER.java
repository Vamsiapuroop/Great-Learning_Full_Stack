package dept_driver;

import dept.*;

import java.util.Scanner;


public class DEPT_DRIVER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the Department Name from the following : ");
		System.out.println(" 1. Admin Department \n 2. Hr Department \n 3.Tech Department ");
		Scanner sc=new Scanner(System.in);
		
		int option=sc.nextInt();
		switch(option){
		case 1:
			Admin_Department obj=new Admin_Department();
			
			System.out.println(obj.departmentName());
			System.out.println(obj.getTodaysWork());
			System.out.println(obj.getWorkDeadline());
			System.out.println(obj.isTodayAHoliday());
			System.out.println();
			System.out.println();
			break;
		case 2:
			Hr_Department obj1=new Hr_Department();
			System.out.println(obj1.departmentName());
			System.out.println(obj1.doAcitivity());
			System.out.println(obj1.getTodaysWork());
			System.out.println(obj1.getWorkDeadline());
			System.out.println(obj1.isTodayAHoliday());
			break;
		case 3:
			Tech_Department obj2=new Tech_Department();
			System.out.println(obj2.departmentName());
			System.out.println(obj2.getTodaysWork());
			System.out.println(obj2.getWorkDeadline());
			System.out.println(obj2.getTechStackInformation());
			System.out.println(obj2.isTodayAHoliday());
			break;
		}
	}
		
}
			
			
		

		
		