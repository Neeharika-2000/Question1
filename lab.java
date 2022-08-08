import java.util.Scanner;
public class lab {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int num = sc.nextInt();
        a = x-num;
        b = y-num;
        c = z-num;

        if(a<0 && b<0 && c<0)
          System.out.println("None");
        else if(a<b && a<c)
            System.out.println("L3");
        else if(b<a && b<c)
            System.out.println("L2");
        else
            System.out.println("L1");

        }

    }


