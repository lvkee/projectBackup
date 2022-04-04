package sale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaleMachineTest {
    SaleMachine saleMachine = new SaleMachine();

    @org.junit.jupiter.api.Test
    void sale() {
//        assertEquals("请取走beer", saleMachine.sale("beer", 5));
        assertEquals("很抱歉，没有beer", saleMachine.sale("beer", 5));
        assertEquals("请取走beer", saleMachine.sale("beer", 5));
        assertEquals("请取走orange", saleMachine.sale("orange", 5));
        assertEquals("错误指令", saleMachine.sale("coke", 5));
        assertEquals("没有零钱，退您十元", saleMachine.sale("beer", 10));
        assertEquals("请取走beer", saleMachine.sale("beer", 10));
        assertEquals("请取走orange", saleMachine.sale("orange", 10));
        assertEquals("错误指令", saleMachine.sale("beer", 10));
        assertEquals("错误指令", saleMachine.sale("coke", 11));
    }
}