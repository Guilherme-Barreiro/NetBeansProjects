package Ficha_1;
public class ex3 {
    public static void main(String[] args) {
        boolean canITakeHisMoney; // true
        int hisBalance = 5; // 13
        long myBalance = 4;
        hisBalance += 8;
        canITakeHisMoney = hisBalance > myBalance;
        canITakeHisMoney = canITakeHisMoney & (hisBalance >= 3); // true & true
        System.out.println (canITakeHisMoney);
    }
}
