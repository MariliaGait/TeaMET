import java.util.Scanner;

public class UsersProfile {
    private String username;
    private int age;
    private int sex;
    private String email;
    private int phonenumber;

    // Constructor
    public UsersProfile(String username, int age, int sex, String email, int phonenumber) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    // Method to collect user information
    public static UsersProfile collectUserInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ονοματεπώνυμο: ");
        String username = scanner.next();
        System.out.print("Ηλικία: ");
        int age = scanner.nextInt();
        System.out.println("Φύλο: 1.Γυναίκα     2.Άνδρας     3.Άλλο ");
        int sex = scanner.nextInt();
        System.out.println("Στοιχεία επικοινωνίας: ");
        System.out.print("E-mail: ");
        String email = scanner.next();
        System.out.print("Τηλέφωνο: ");
        int phonenumber = scanner.nextInt();

        return new UsersProfile(username, age, sex, email, phonenumber);
    }
}