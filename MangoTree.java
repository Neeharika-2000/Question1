import java.util.Scanner;
public class MangoTree {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int TreeNum = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            if (TreeNum == i) {
                flag = 1;
                break;
            }
        }
        for (int i = row; i <= col * row; i = i + row) {
            if (TreeNum == i) {
                flag = 1;
                break;
            }
        }
        for (int i = 1; i <= (row*(col - 1) + 1); i = i + row) {
            if (TreeNum == i) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

