import java.util.Random;

public class Main {



    public static void main(String[] args) {
        otp_gene();
    }

    public static void otp_gene(){
        String number = "0123456789";
        Random rand = new Random();
        char[] otp = new char[4];
        for (int i = 0; i < 4; i++) {
            otp[i] = number.charAt(rand.nextInt(number.length()));
        }
        System.out.println(otp);
    }


}