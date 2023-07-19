package hanhttm_bt_javacore.MathUtils;

final class MathUtils {
    public static int GiaiThua(int n) {
       int giaithua=1;
       if (n==0||n==1){
           return giaithua;
       } else {
           for (int i = 2; i <= n; i++){
               giaithua = giaithua*i;}
           return giaithua;
       }
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.GiaiThua(5));
    }
}
