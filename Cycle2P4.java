import java.util.Scanner;
public class Cycle2P4 {
	int eNo;
	String eName;
	double eSalary;
	public void getdetails(){
		System.out.println("\nEnter the Employee details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee number : ");
		eNo=sc.nextInt();
		System.out.println("Name : ");
		sc.nextLine();
		eName=sc.nextLine();
		System.out.println("Salary : ");
		eSalary=sc.nextDouble();
	}
	void display(){
		System.out.println("Empolyee No :"+eNo);
		System.out.println("Name :"+eName);
		System.out.println("Salary Amount"+eSalary+"\n");
	}
	public static void main(String[] args) {
	System.out.println("Akshay Unni M V\n23mca010\ndt:14/03/2024\nemployee");
	System.out.println("\nEnter the No. of Employee's");
	Scanner sc1 = new Scanner(System.in);
	int num = sc1.nextInt();
	Cycle2P4 arr[]=new Cycle2P4[num];
	for(int i =0;i<num;i++){
		arr[i]=new Cycle2P4();
		arr[i].getdetails();
	}
	System.out.println("\nInformations of all the employee's");
	for(int i=0;i<num;i++){
		arr[i].display();
	}
	boolean state = false;
	System.out.println("\nEnter the Employee Number to get details of a employee");
	int num2= sc1.nextInt();
	for(int i=0;i<num;i++){
		if(arr[i].eNo==num2){
			System.out.println("\nEmployee details");
			arr[i].display();
		}
	}
	}
}
