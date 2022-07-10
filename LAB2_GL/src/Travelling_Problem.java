import java.util.Scanner;
public class Travelling_Problem {
private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter number of denominations");
		// TODO Auto-generated method stub
		int noofDenominations=sc.nextInt();
		System.out.println("Enter currency denominations");
		int[] notesArray=new int[noofDenominations];
		for(int i=0;i<notesArray.length;i++) {
			notesArray[i]=sc.nextInt();

		}
		Merge_Sort mg=new Merge_Sort();
		mg.sort(notesArray, 0, notesArray.length-1);
		System.out.println("Enter the target Amount :");
		int target=sc.nextInt();
		NotesCounter nc=new NotesCounter();
		int[] notesCounterArray=nc.notesCount(notesArray,target);
		for(int i=0;i<notesCounterArray.length;i++) {
			if(notesCounterArray[i]!=0) {
				System.out.println(notesArray[i]+":"+notesCounterArray[i]);
			}
		}
		
	}

}
