package cf.mindaugas._07_spring_java_no_dedicated_class.model;

public class Customer {
    private String firstname;
    private String lastname;
    public Customer () {}
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
}