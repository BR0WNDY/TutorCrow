package Lesson1;

public class L11_FunctionsWithReturns {
    public static void main() {
        System.out.println(getMyName());
        int num = getNumber();
        System.out.println(num);
        int abc = makeNumberBigger4x(4);
        System.out.println(abc);
        int thb = covertUSDtoTHB(6);
        System.out.println(thb);
        int cus1 = getHotPotPrice(18);
        System.out.println(cus1);
        int cus2 = getHotPotPrice(10);
        System.out.println(cus2);
        int cus3 = getHotPotPrice(-9);
        System.out.println(cus3);

        int em1 = getsarary(true, 0, "James");
        System.out.println(em1);
        int em2 = getsarary(false, 4, "Harry");
        System.out.println(em2);
        int em3 = getsarary(true, 0, "Lilly");
        System.out.println(em3);
        int em4 = getsarary(false, 4, "John");
        System.out.println(em4);

        System.out.println(getsarary(false, 0));
    }


    static String getMyName() {
        return "Boom";
    }

    static int getNumber() {
        return 67;
    }

    static int makeNumberBigger4x(int randomNumber) {
        return randomNumber * 4;
    }

    static int covertUSDtoTHB(int amountUSD) {
        return amountUSD * 29;
    }

    static int getHotPotPrice(int age) {
        if (age >= 18) {
            return 499;
        } else if (age < 18 && age > 0) {
            return 199;
        } else {
            return -99999999;
        }
    }

    static int getsarary(boolean gotbonus, int latedays, String name) {
        int finalsarary = 0;
        int normalsalrary = 20000;
        // This part for Bonus
        if (gotbonus == true) {
            finalsarary = normalsalrary + 4000;
        } else {
            finalsarary = normalsalrary;
        }
        // for late days
        int reduceamount = 200 * latedays;
        finalsarary = finalsarary - reduceamount;
        // name check
        if (name == "John") {
            finalsarary = finalsarary - 6000;
        }
        return finalsarary;
    }

    static int getsarary(boolean gotbonus, int latedays) {
        int finalsarary = 0;
        int normalsalrary = 20000;
        // This part for Bonus
        if (gotbonus == true) {
            finalsarary = normalsalrary + 4000;
        } else {
            finalsarary = normalsalrary;
        }
        // for late days
        int reduceamount = 200 * latedays;
        finalsarary = finalsarary - reduceamount;
        return finalsarary;
    }
}