import java.util.Scanner;
public class Pay_Money {
	
	private static final Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter number of transactions per day");
		int size=sc.nextInt();
		int[] transactionArray=new int[size];
		System.out.println("Enter the transactions now: ");
		for(int i=0;i<transactionArray.length;i++) {
			int tranc=sc.nextInt();
			if(tranc>0) {
				transactionArray[i]=tranc;
			}
		}
		System.out.println("enter the number of targets :");
		int NoOfTargets=sc.nextInt();
		
		printNoOfTransactions(transactionArray,NoOfTargets);
	}

	private static int getNumberOfTransactions(int[] transactionArray,int target) {
		// TODO Auto-generated method stub
		
		int tc_count=0;
		int sum=0;
		while(sum<target && tc_count<transactionArray.length) {
			sum=sum+transactionArray[tc_count];
			tc_count++;
		
		}
		if(tc_count>=transactionArray.length) {
			return -1;
			
		}
		else {
			return tc_count;
		}
		
		}
	
	private static void printNoOfTransactions(int[] transactionArray,int noOfTarget) {
		while(noOfTarget>0) {
			System.out.println("Enter the daily Target");
			int target=sc.nextInt();
			int transactionCount=getNumberOfTransactions(transactionArray,target);
			if(transactionCount>0) {
				System.out.println("The number of transactions to achieve the target "+transactionCount);
				
			}
			else {
				System.out.println("No of Targets insufficient to achieve Target");
			}
			noOfTarget--;
		}
		
	}
		
	
		
		
		
	}
	


