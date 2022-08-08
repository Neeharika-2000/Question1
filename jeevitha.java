import java.util.Scanner;
public class jeevitha {
    public static void main(String[] args) {
        int x = 100, limit = 40, weekly_sal,extra_hr,extra_pay,total_extra_pay=0,salary=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] sal = new int[10];
        for (int i = 0; i <= 6; i++) {
            arr[i] = sc.nextInt();
        }

        int sal_sat = 125 * arr[6];
        int sal_sun = 150 * arr[0];

        int sum = (arr[1] + arr[2] + arr[3] + arr[4] + arr[5]);

        if(sum>limit)
        {
            extra_hr= sum - limit;
            extra_pay = extra_hr*125;
            total_extra_pay = extra_pay - extra_hr*115;
        }

        for(int i=1;i<=5;i++)
        {
            if(arr[i]>8)
            {
                sal[i] = 800 + (arr[i]-8)*115;
            }
            else
                sal[i] = arr[i]*100;
        }
        for(int i=1;i<=5;i++)
        {
            salary= salary + sal[i];
        }
        weekly_sal= sal_sat + sal_sun +salary+ total_extra_pay;

        System.out.println(weekly_sal);
    }
}