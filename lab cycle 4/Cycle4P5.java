import java.util.*;
public class Cycle4P5{
public static void main(String[] args){
System.out.println(" \nName:Akshay unni M V\nRoll no:23MCA010\nDate:09-April-2024\n");
System.out.println();
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}
