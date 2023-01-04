import java.util.Scanner;

public class Baekjoon1001 {

    public static void main(String [] args){

        Scanner Scan = new Scanner(System.in);
        String Input = Scan.nextLine();
        String[] array  = Input.split(" ");

        Integer A = Integer.parseInt(array[0]);

        Integer B = Integer.parseInt(array[1]);
        System.out.println(A - B);

        Scan.close();

    }
    
}
