import java.util.Scanner;
public class jeevitha {
    public static void main(String[] args) {
        int x = 100, y = 40, sal;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i <= 6; i++) {
            arr[i] = sc.nextInt();
        }
        int a = (arr[1] + arr[2] + arr[3] + arr[4] + arr[5]);
        int sal_sat = 1.25 * arr[6];
        int sal_sun = 1.5 * arr[0];
        if (a > 40) {
            b = (a - 40) * 125;
            sal = sal_sat + sal_sun + b + 4000;
        }
        else {
            for (int i = 1; i <= 5; i++) {
                arr[i] = arr[i] <= 8 ? arr[i] : -(arr[i] - 8);
            }
            for (int i = 0; i <= 5; i++) {
                if (arr[i] > 0) {
                    arr[i] = arr[i] * 100;
                } else (arr[i] < 0)
                {
                    arr[i] = 800 + (-arr[i] * 115);
                }
            }
            sal = sal_sat + sal_sun + arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
        }
        System.out.println(sal);
    }
}
