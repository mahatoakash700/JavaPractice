package BasicMath;

public class ArmStrongNumber {

    public static boolean isArmStrongNumber(int n){
        int temp = n;
        int sum = 0;

        while(n > 0){
            int ld = n%10;
            sum += (ld * ld * ld);
            n = n/10;
        }
        return (temp==sum);
    }

    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));
    }
}
