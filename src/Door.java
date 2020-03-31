public class Door {
    private String location;

    public Door(String location) {
        this.location = location;
    }

    public void open() {
        System.out.println(location + " door is open");
    }

    public void close() {
        System.out.println(location + " door is closed");
    }
    
}
