public class DoorClosedCommand implements Command {
    Door door;

    public DoorClosedCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

    @Override
    public void undo() {
        door.open();
    }
}
