import java.util.Scanner;

public class Baekjoon1008 {

    public static void main(String [] args){

        Scanner Scan = new Scanner(System.in);
        String Input = Scan.nextLine();
        String[] array  = Input.split(" ");

        Double A = Double.parseDouble(array[0]);

        Double B = Double.parseDouble(array[1]);

        Double Answer = A / B;

        System.out.printf("%.9f", Answer);

        Scan.close();
    }
    
}
