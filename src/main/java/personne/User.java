package personne;

public class User {
    private String firstname;
    private String lastname;
    private String gender;
    private String city;
    private String address;
    private String email;
    private String login;
    public String password;
    private String course;
    private boolean isActive;
    private boolean isConnected;

    public User() {
        this.firstname = "";
        this.lastname = "";
        this.gender = "";
        this.city = "";
        this.address = "";
        this.email = "";
        this.login = "";
        this.password = "";
        this.course = "";
        this.isActive= false;
        this.isConnected = false;
    }

    public User(String firstname, String lastname, String gender, String city, String address, String email, String login, String password, String course) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.city = city;
        this.address = address;
        this.email = email;
        this.login = login;
        this.password = password;
        this.course = course;
        this.isActive = true;
        this.isConnected = true;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
