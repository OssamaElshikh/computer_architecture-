package instructions;

import memory.Instruction;

public abstract class RTypeInstruction extends Instruction {

    private int r1;
    private int r2;
    private int r3;
    private int r1Contents;
    private int r2Contents;
    private int r3Contents;
    private int shamt;

    public RTypeInstruction(Instruction instruction) {
        super(instruction.getBinaryContent());
    }

    @Override
    public abstract int execute();

    @Override
    public void printParameters(){
        System.out.println("- Parameters");
        System.out.println("-- Type: " + this.getClass().getSimpleName());
        System.out.println("-- R1: " + r1);
        System.out.println("-- R1 Contents: " + r1Contents);
        System.out.println("-- R2: " + r2);
        System.out.println("-- R2 Contents: " + r2Contents);
        System.out.println("-- R3: " + r3);
        System.out.println("-- R3 Contents: " + r3Contents);
        System.out.println("-- SHAMT: " + shamt);
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getR1Contents() {
        return r1Contents;
    }

    public void setR1Contents(int r1) {
        this.r1Contents = r1;
    }

    public int getR2Contents() {
        return r2Contents;
    }

    public void setR2Contents(int r2) {
        this.r2Contents = r2;
    }

    public int getR3Contents() {
        return r3Contents;
    }

    public void setR3Contents(int r3) {
        this.r3Contents = r3;
    }

    public int getShamt() {
        return shamt;
    }

    public void setShamt(int shamt) {
        this.shamt = shamt;
    }
    

}
