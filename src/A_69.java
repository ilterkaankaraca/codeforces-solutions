import java.util.Scanner;

public class A_69{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = true;
        int[] arr = new int[3];
        //nextInt doesn't read new line because of this nextLine always return empty line
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
            arr[j] += Integer.parseInt(scanner.next());
            }
        }
        for(int j=0;j<3;j++){
            if(arr[j]!=0)
                yes=false;
                break;
            }
        if(yes){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}