import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        int n, temp =0;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] marks = new int[10];
        int[] roll = new int[10];
        for(int i=0;i<n;i++)
        {
            marks[i]= sc.nextInt();
            roll[i] = i+1;
        }
        for(int i= 0; i<n;i++){
            for (int j = i+1; j <n; j++) {
                if(marks[i] > marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }

        System.out.println("Highest marks:"+marks[n-1]+" ");

        System.out.println("Lowest marks:"+marks[0]);



    }
}