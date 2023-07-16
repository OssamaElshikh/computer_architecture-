package instructions;

import memory.Instruction;
import translators.Decoder;

public class ExclusiveOrImmediateInstruction extends ITypeInstruction{

    public ExclusiveOrImmediateInstruction(Instruction instruction) {
        super(instruction);
        this.needsWriteBack = true;
    }

    @Override
    public int execute() {
        this.executionResult = this.getR2Contents() ^ this.getImmediate();
        Decoder.setLastInstruction(this.getR1(), this.executionResult);
        return this.executionResult;
    }
    
}
