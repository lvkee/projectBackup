package sale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaleMachineTest {
    SaleMachine saleMachine = new SaleMachine();

    /**
     * 路径覆盖测试用例
     */
    @org.junit.jupiter.api.Test
    void sale() {
        assertEquals("很抱歉，没有beer", saleMachine.sale("beer", 5, 5, 0, 0));
        assertEquals("请取走beer", saleMachine.sale("beer", 5, 5, 1, 1));
        assertEquals("请取走orange", saleMachine.sale("orange", 5, 5, 1, 1));
        assertEquals("错误指令", saleMachine.sale("coke", 5, 5, 1, 1));
        assertEquals("没有零钱，退您十元", saleMachine.sale("beer", 10, 0, 1, 1));
        assertEquals("拿好五元，请取走beer", saleMachine.sale("beer", 10, 1, 1, 1));
        assertEquals("拿好五元，请取走orange", saleMachine.sale("orange", 10, 1, 1, 1));
        assertEquals("错误指令", saleMachine.sale("coke", 10, 1, 1, 1));
        assertEquals("错误指令", saleMachine.sale("coke", 11, 1, 1, 1));
    }

    /**
     * MC/DC覆盖测试用例
     */
    @Test
    void saleByMCDC() {
        assertEquals("很抱歉，没有beer",saleMachine.sale("beer", 5, 0, 2, 0));
        assertEquals("请取走beer",saleMachine.sale("beer", 5, 0, 2, 2));
        assertEquals("请取走orange",saleMachine.sale("orange", 5, 0, 2, 0));
        assertEquals("请取走orange",saleMachine.sale("orange", 5, 0, 2, 2));
        assertEquals("很抱歉，没有orange",saleMachine.sale("orange", 5, 0, 0, 2));
        assertEquals("请取走beer",saleMachine.sale("beer", 5, 2, 2, 2));
        assertEquals("请取走orange",saleMachine.sale("orange", 5, 2, 2, 2));
        assertEquals("错误指令",saleMachine.sale("coke", 5, 2, 2, 2));
        assertEquals("拿好五元，请取走beer",saleMachine.sale("beer", 10, 2, 2, 2));
        assertEquals("错误指令",saleMachine.sale("beer", 11, 2, 2, 2));
        assertEquals("没有零钱，退您十元",saleMachine.sale("beer", 10, 0, 2, 2));
        assertEquals("拿好五元，请取走orange",saleMachine.sale("orange", 10, 2, 2, 2));
        assertEquals("错误指令",saleMachine.sale("coke", 10, 2, 2, 2));

    }
}