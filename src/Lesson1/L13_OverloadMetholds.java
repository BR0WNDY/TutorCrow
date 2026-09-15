package Lesson1;

import java.sql.SQLOutput;

public class L13_OverloadMetholds {
    public static void main() {
        //Overloadthmethold =Functions with multiple definetions
        // (more than one functions with same name)
        int cus1 = getHotPotPrice(18);
        System.out.println(cus1);

        System.out.println(getHotPotPrice(10));
        System.out.println(getHotPotPrice());

        System.out.println(getHotPotPrice(12,"James"));
    }

    static int getHotPotPrice(int age){
        if (age >= 18){
            return 499;
        }
        else if (age < 18 && age > 0){
            return 199;
        }
        else{
            return -99999999;
        }
    }
    static int getHotPotPrice(){
        return 499;
    }
    static int getHotPotPrice(int age , String name){
        int normalprice = getHotPotPrice(age);
        if (name.equals("James")){
            return normalprice - 100;
        }else{
            return normalprice;
        }
    }
}
