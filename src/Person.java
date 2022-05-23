public class Person {
    protected static String name;
    protected static String address;
    public Person(String PersonName, String PersonAddress) {
        this.name = PersonName;
        this.address = PersonAddress;
    }

    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    @Override
    public String toString() {
        return name + address;
    }
}
