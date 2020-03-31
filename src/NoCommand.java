public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("NO COMMAND");
    }

    @Override
    public void undo() {
        System.out.println("NO COMMAND");
    }
}
