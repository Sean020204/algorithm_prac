import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        // "1 2"
        // A, B
        // A+B

        // 1. 입력을 받는다.
        Scanner Scan = new Scanner(System.in);
        String Input = Scan.nextLine();


        // 2. 입력 받은 문자열을 A와 B로 나눈다.
        String[] array  = Input.split(" ");

        Integer A = Integer.parseInt(array[0]);

        Integer B = Integer.parseInt(array[1]);

        // 3. A와 B를 더한다.

        // 4. 더한값을 출력한다.
        System.out.println(A + B);

        Scan.close();

    }
    
}
