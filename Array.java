import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        String[][] users= {{"Musa","Akidi","Kaxim"},{"Muhammed","Jamiu"},{"Hasidu,Habibah"}};
//        System.out.println(Arrays.deepToString(users));
        double result =(double)(10/3);
//       NumberFormat percent =NumberFormat.getPercentInstance();
//      String outcome=  percent.format(2.0);
        //to read input from user
        Scanner scanner= new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.print("Age:");
        System.out.println("You are "+age+"years Old!!");
    } 
}