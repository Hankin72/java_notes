package hcom.ztejava_Reg;

public class RgexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("23131231"));
        System.out.println(checkQQ("a12"));

        System.out.println("=====");
        System.out.println(checkqq2("aa12"));
        System.out.println(checkqq2("121312312"));
        System.out.println(checkqq2("11123123123123123123123123"));
        System.out.println("");

        System.out.println("122312ssd".matches("\\w{6,}"));

    }
    public static boolean checkqq2(String qq){
        return qq != null && qq.matches("\\d{6,20}");

    }


    public static boolean checkQQ(String qq){
        // 1. check length
        if(qq == null || qq.length() < 6 || qq.length()>20){
            return false;
        }
        // 2. check digits
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);

            if(ch<'0' || ch>'9'){
                return false;
            }
        }
        return true;

    }

}
