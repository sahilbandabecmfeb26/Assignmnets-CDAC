import java.util.Scanner;

class Assign32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }

        // Check prime condition
        if(count == 2){
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }

        sc.close();
    }
}