public class Student extends Person {
    
    private int credits;
    public Student(String PersonName, String personAddresString) {
        super(PersonName, personAddresString);
        this.credits = 0;    
    }
    public int credits() {
        return this.credits;
    }
    public int study() {
        return this.credits += 1;
    }
    @Override
    public String toString() {
        String newCredits = Integer.toString(credits);
        return "Name : " + this.getName() + ", Address: " + this.getAddress() + ", Credits: " + newCredits;
    }
}