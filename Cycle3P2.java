import java.util.Scanner;
class employee 
{
    int Empid;
    String Name;
    double Salary;
    String Address;
    employee(int no, String na, double sal, String add) 
    {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}
public class Cycle3P2 extends employee
{
    String dept;
    String subject;
    Cycle3P2(int no, String na, double sal, String add, String dep, String sub)
    {
        super(no,na,sal,add);
        this.dept= dep;
        this.subject=sub;
    }
    
     void display()
     {
            System.out.println("Employee id: "+Empid);
            System.out.println("Name: "+Name);
            System.out.println("Salary: "+Salary);
            System.out.println("Address: "+Address);
            System.out.println("Department: "+dept);
            System.out.println("Subject: "+subject);
     }
    public static void main(String[] args) 
    {
        
        System.out.println("Name: Akshay Unni M V\nRollno: 23mca010\nTitle: Teacher (Inheritance)\nDate: 06-04-2024\n");
            System.out.println("Enter the No. of Employee's");
            Scanner sc1 = new Scanner(System.in);
            int num = sc1.nextInt();
            Cycle3P2 arr[]=new Cycle3P2[num];
            for(int i =0;i<num;i++)
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("\nEnter Employee id: ");
                int Empid=sc.nextInt();
                System.out.println("Enter Employee Name: ");
                String Name=sc.next();
                System.out.println("Enter Salary: ");
                double Salary=sc.nextDouble();
                System.out.println("Enter Address: ");
                String Address=sc.next();
                System.out.println("Enter department: ");
                String dept=sc.next();
                System.out.println("Enter Subject: ");
                String subject=sc.next();
                arr[i]=new Cycle3P2(Empid,Name,Salary,Address,dept,subject);
            }
            System.out.println("\nInformations of all the employee's");
            for(int i=0;i<num;i++)
            {
                int j=i+1;
                System.out.println("\n"+j+").");
                arr[i].display();        
         }
        sc1.close();
     }
}


