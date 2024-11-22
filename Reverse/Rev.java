public class Rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        while (n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit + " ");
            n=n/10;
        }
        System.out.println();
    }
}