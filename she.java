import java.util.Scanner;

public class she {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        
        if ( a >= 18 ){
            System.out.println(name +   "you are eligibel for drive ");
        }
        else{
            System.out.println(name +   "you are not eligibel for drive ");
        }
}

}


