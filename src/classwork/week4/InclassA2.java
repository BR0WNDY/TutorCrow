package classwork.week4;

import java.security.Key;

public class InclassA2 {
    public static double calculatedFinalPrice(int orinalprice){
        double finalpirice = orinalprice + (orinalprice * 0.7) - 10;
        return finalpirice;
    }
    public static void main(String[] args) {
        int laptop = 900;
        int keyboard = 45;
        int mouse = 25;
        int speaker = 200;
        double final_laptopprice = calculatedFinalPrice(laptop);
        System.out.println(final_laptopprice);
        double final_keyboard = calculatedFinalPrice(keyboard);
        System.out.println(final_keyboard);
        double final_mouse = calculatedFinalPrice(mouse);
        System.out.println(final_mouse);
        double final_speaker = calculatedFinalPrice(speaker);
        System.out.println(final_speaker);
    }
}
