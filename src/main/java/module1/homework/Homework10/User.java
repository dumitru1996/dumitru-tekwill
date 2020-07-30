package module1.homework.Homework10;

public class User {
    private String firstName;
    private String lastName;


    public void setFirstName(String firstName) {
        if(firstName==null){
            this.firstName = "";
        }else
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName==null){
            this.lastName = "";
        } else
            this.lastName = lastName;
    }

    public String getFullName() {
        if(firstName==null && lastName!=null){
            return lastName;
        }if(lastName==null && firstName !=null){
            return firstName;
        }if(firstName!=null && lastName!=null){
            return firstName + " " + lastName;
        } else {
            return "Unknown";
        }
    }

    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName());

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());
    }
}
