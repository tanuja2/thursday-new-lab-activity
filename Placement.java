import java.util.*;
class Placement{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no of studentsplaced in CSE:");
		int CSE=scn.nextInt();
		System.out.println("enter the no of studentsplaced in ECE:");
		int ECE=scn.nextInt();
		System.out.println("enter the no of studentsplaced in MECH:");
		int MECH=scn.nextInt();
		if(CSE==ECE&&ECE==MECH&&CSE==MECH){
			System.out.println("none of the department has got highest placement");
		}
		else if(CSE>=0&&ECE>=0&&MECH>=0){
			if(MECH>ECE&&MECH>CSE){
				System.out.println("highestr placement\n MECH");
			}
			else if(CSE>MECH&&CSE>ECE){
				System.out.println("highest placement \nCSE");
			}
			else if(ECE>MECH&&ECE>CSE){
				System.out.println("highest placement \nECE");
			}
		 else if(ECE==MECH){
			 System.out.println("highest placement \nECE\nMECH");
		 }
		 else if(CSE==ECE){
			 System.out.println("highest placment in \nCSE \nECE");
		 }
		 else if(CSE==MECH){
			 System.out.println("highest placement \nCSE \nMECH");
		 }
		}
		else{
			System.out.println("input is valid");
		}
	}
}

		
