import java.util.Scanner;

public class UsersProfile {
    private String username;
    private String password;
    private int age;
    private int sex;
    private String email;
    private int phonenumber;

    // Constructor
    public UsersProfile(String username, int age, int sex, String password, String email, int phonenumber) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.password = password;
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
    public String getPas() {
        return password;

    public String getEmail() {
        return email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    // Method to collect user information
    public static UsersProfile collectUserInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ονοματεπώνυμο: ");
        String username = scanner.next();
        int flag;
        boolean done = false;
        do {
        System.out.println("Κωδικός πρόσβασης: ")
        String password = scanner.next();
        do {
        System.out.println("Εισάγετε για επιβεβαίωση τον κωδικό που μόλις ορίσατε")
        String pw2 = scanner.next();
        if (pw compareTo(password) 
        flag++;
        while (flag < 4)
        if (flag >= 4) {
            done = true;
        }
        } while (done)
        System.out.println("Ηλικία: ");
        int age;
        do {
            age = scanner.nextInt();
        } while (age > 0) //εμμέλεια//
        System.out.println("Φύλο: 1.Γυναίκα     2.Άνδρας     3.Άλλο ");
        int sex;
        do {
            sex = scanner.nextInt();
        }while(sex != 1 && sex != 2 && sex !=3);
        System.out.println("Στοιχεία επικοινωνίας: ");
        System.out.println("E-mail: ");
        String email = scanner.next();
        System.out.println("Τηλέφωνο: ");
        int phonenumber = scanner.nextInt();

        return new UsersProfile(username, age, sex, email, phonenumber);
    }
}


int s;
    do {
        s = scanner.nextInt();
    }while(sex != 1 && sex != 2 && sex !=3);
String sex;
if (s == 1) {
    sex = 'Γυναίκα';
} else if (s == 2) {
    sex = 'Άνδρας';
} else {
    sex = 'Άλλο';
}
