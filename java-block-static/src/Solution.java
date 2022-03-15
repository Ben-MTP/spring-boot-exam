import java.util.Scanner;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */

public class Solution {

    static Scanner scanner = new Scanner(System.in);
    public static boolean flag;
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();;
    static {
        try{
            if(B > 0 && H > 0){
                flag = true;
            } else{
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}

