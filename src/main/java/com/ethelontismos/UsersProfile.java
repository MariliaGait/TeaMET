package com.ethelontismos;

import java.util.Scanner;

public class UsersProfile {
    private String username;
    private int age;
    private int sex;
    private String email;
    private String phone;

    // Constructor
    public UsersProfile(String username, int age, int sex, String email, String phone) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
        }

    // Method to collect user information
    public static UsersProfile collectUserInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ονοματεπώνυμο: ");
        String username = scanner.nextLine();
        System.out.print("Ηλικία: ");
        int age = scanner.nextInt();
        System.out.println("Φύλο: 1.Γυναίκα     2.Άνδρας     3.Άλλο ");
        int sex;
        do {
            sex = scanner.nextInt();
            scanner.nextLine();
        }while(sex != 1 && sex != 2 && sex !=3);
        System.out.println("Στοιχεία επικοινωνίας: ");
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Τηλέφωνο: ");
        String phone = scanner.nextLine();

        return new UsersProfile(username, age, sex, email, phone);
    }
}
