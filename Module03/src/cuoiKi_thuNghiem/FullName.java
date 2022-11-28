package cuoiKi_thuNghiem;

public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) throws Exception {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) throws Exception {
        if (!firstName.equalsIgnoreCase("")) {
            this.firstName = firstName;
        } else
            throw new Exception("Khong duoc rong");
    }

    public void setLastName(String lastName) throws Exception {
        if (!lastName.equalsIgnoreCase("")) {
            this.lastName = lastName;
        } else
            throw new Exception("Khong duoc rong");
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

}
