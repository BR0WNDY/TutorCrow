package classwork.week4;

public class InclassA3 {
    public static String encryptPassword(String password){
        String result = "";
        for (int i = 0; i < password.length(); i++) {
            result += password.charAt(i) + 3;
        }
        return result;
    }

    public static void main() {

        String newPassword = encryptPassword("Boom123");
        System.out.println(newPassword);
        String Password2 = encryptPassword("Crow123");
        System.out.println(Password2);
    }
}
