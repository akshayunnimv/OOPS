import java.util.Scanner;
	public class Cycle2P3{
		public static void main(String[] args) {
			System.out.println("Akshay Unni M V\n23mca010\ndt:14/03/2024\nstringmanipulation");
			System.out.println("Enter The String");
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			System.out.println("Length of String:"+str1.length());
			System.out.println("Character at First position: "+str1.charAt(1));
			System.out.println("String Contains 'ly' sequence :"+str1.contains("ly"));
			System.out.println("String ends with e : "+str1.endsWith("e"));
			System.out.println("Replace 'ly' with 'ing' : "+str1.replaceAll("ly","ing"));
			System.out.println("LOWERCASE : "+str1.toLowerCase());
			System.out.println("UPPERCASE : "+str1.toUpperCase());
		}
	}
