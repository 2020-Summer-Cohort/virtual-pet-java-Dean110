package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualDogTest {
    //Goals create virtual dogs and cats
    //Dogs are in cages
    //Cats are in common room
    //Dogs can be walked
    //Cats do not go on walks
    //VirtualPet abstract

    @Test
    public void createVirtualDogClass(){
        VirtualPet underTest = new VirtualDog("Fido", 20, 20, 20);
    }

    @Test
    public void dogsShouldEat(){
        VirtualPet underTest = new VirtualDog("Fido", 20,20,20);
        underTest.eat();
        int result = underTest.getHunger();
        assertEquals(15, result);
    }
}
