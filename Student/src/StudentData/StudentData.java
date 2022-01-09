package StudentData;
import java.util.*;


public class StudentData {

	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the total number of students");
			int num=sc.nextInt();

			Students[] student=new Students[num];

			for(int i=0; i<num; i++) {
			student[i]=new Students();
				}
			for(int i=0; i<num; i++) {
			student[i].reportCard();	
			}
			}
			}
	


