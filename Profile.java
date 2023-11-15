import java.util.Scanner;

public class Profile {

Scanner scannner = new Scanner(System.in);

System.out.println("Καλώς ήρθατε στον εΘΕΛΩντισμό!");
System.out.println("Είστε έτοιμοι για ένα νέο εθελοντικό ταξίδι;");
System.out.println("Είστε εγγεργαμμένος\-η;");
System.out.println("1.Ναι       2.Όχι ")
Int account = scanner.nextInt();

if (account == 2) {
    System.out.println("Παρακαλώ εισαγάγετε τα στοιχεία για το προφίλ σας.");
    // μπορουμε να βαλουμε username και password, αλλα δεν ξερω μηπως γινει περιπλοκο//
    System.out.println("Ονοματεπώνυμο: ");
    String name = scanner.nextLine();
    System.out.println("Ηλικία: ");
    int age = scanner.nextInt();
    System.out.println("Φύλο: ");
    System.out.println("1.Γυναίκα     2.Άνδρας        3.Άλλο ");
    int sex = scanner.nextInt();
    System.out.println("Στοιχεία επικοινωνίας: ");
    System.out.println("E-mail: ");
    String email = scanner.nextLine();
    System.out.println("Τηλέφωνο: ")
    int phonenumber = scanner.nextInt();
    System.out.println("Σε ποια περιοχή επιθυμείτε να δραστηριοποιηθείτε; ");
    String location = scanner.nextLine();
    UserProfile user = new UserProfile(name, age, sex, email, phonenumber, location);
}



private static class UserProfile {
        private String name;
        private int age;
        private int sex;
        private String email;
        private int phonenumber;
        private String location;
    }

public UserProfile(String name, int age, int sex, String email, int phonenumber, String location) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.email = email;
            this.phonenumber = phonenumber;
            this.location = location;
        }

    public String getName() {
        return name;
        }
    public int getAge() {
        return age;
        }
    public int getSex() {
        return sex;
        }
    public String getEmail(){
        return email;
    }
    public int getPhonenumber(){
        return phonenumber;
    }
    public String getLocation() {
        return location;
    }
}






