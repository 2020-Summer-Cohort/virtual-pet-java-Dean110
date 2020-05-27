package virtual_pet;

public class VirtualDog extends VirtualPet {
    private int cageDirtiness;

    public VirtualDog(String name, int hunger, int thirst, int cageDirtiness) {
        super(name, hunger, thirst);
        this.cageDirtiness = cageDirtiness;
    }


    public int getCageDirtiness() {
        return cageDirtiness;
    }

}
