import javax.annotation.processing.FilerException;

public abstract class Display implements Usererror {
    @Override
    public void userError() throws FilerException {
        throw new FilerException("System Fail");

    }

    public abstract void display() throws FilerException;
}
