package sale;

public class SaleMachine {
    private int fiveNum, orangeNum, beerNum;
    private final String[] type = {"beer", "orange"};
    private final String[] answer = {"很抱歉，没有", "请取走", "拿好五元，请取走", "没有零钱，退您十元", "错误指令"};

    public SaleMachine() {
//        fiveNum：五元面值的货币
        fiveNum = 5;
        orangeNum = 5;
        beerNum = 5;
    }

    public String sale(String drink, int money) {
        String result = null;
//        没有啤酒或没有橙汁
        if (beerNum < 1 && drink.equals(type[0]) || orangeNum < 1 && drink.equals(type[1])) {
            result = answer[0] + drink;
//        如果刚好是5元，不找钱
        } else if (money == 5) {
            fiveNum++;
            result = answer[1] + drink;
            if (drink.equals(type[0])) {
                beerNum--;
            } else if (drink.equals(type[1])) {
                orangeNum--;
            } else {
                result = answer[4];
            }
        } else if (money == 10) {
//            如果没有零钱找
            if (fiveNum < 1) {
                result = answer[3];
            } else {
                fiveNum--;
                result = answer[1] + drink;
                if (drink.equals(type[0])) {
                    beerNum--;
                } else if (drink.equals(type[1])) {
                    orangeNum--;
                }
            }
            result = answer[4];
        }
        return result;
    }
}
