package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualCatTest {
    @Test
    public void createVirtualCatClass(){
        VirtualPet underTest = new VirtualCat("Jerry", 20, 20);
    }

    @Test
    public void catsShouldEat(){
        VirtualPet underTest = new VirtualCat("Jerry", 20,20);
        underTest.eat();
        int result = underTest.getHunger();
        assertEquals(15, result);
    }
}
