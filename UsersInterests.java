import java.util.Scanner;

public class UsersInterests {

  public static collectUserInterest(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Σε ποια περιοχή θα επιθυμούσατε να δραστηριοποιηθείτε;");
    String location = scanner.next();
    System.out.print("Ποια κατηγορία προτιμάτε: 1.δράσεις δια ζώσης   2.διαδικτυακό εθελοντισμό ");
    int c = scanner.nextInt();
    String category;
    if (c == 1){
      category = "δράσεις δια ζώσης";
    }else{
      category = "διαδικτυακό εθελοντισμό";
    }
    



  }
  
}
