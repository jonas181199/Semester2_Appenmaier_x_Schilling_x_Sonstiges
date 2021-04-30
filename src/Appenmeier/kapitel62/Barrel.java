package Appenmeier.kapitel62;

public class Barrel {

    private int capacity;
    private int fluidLevel;

    public Barrel(int capacity, int fluidLevel) {
        this.capacity = capacity;
        this.fluidLevel = fluidLevel;
    }

    public void addFluid(int fill) throws BarrelOverflowException {
        if ((this.fluidLevel + fill) <= capacity) {
            this.fluidLevel += fill;
            printFluidLevel();
        } else {
            throw new BarrelOverflowException();
        }

    }


    public void printFluidLevel() {
        System.out.println("Füllstand: " + this.fluidLevel);
    }
}
