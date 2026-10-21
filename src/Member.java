/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moham
 */
public class Member {

    // Member details
    private String name;
    private String mobile;
    private String email;
    private String father;
    private String mother;
    private String aadhaar;
    private int age;
    private double amount;
    private String gender;
    private String gymTime;

    // Constructor
    public Member(String name, String mobile, String email,
                  String father, String mother, String aadhaar,
                  int age, double amount, String gender, String gymTime) {

        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.father = father;
        this.mother = mother;
        this.aadhaar = aadhaar;
        this.age = age;
        this.amount = amount;
        this.gender = gender;
        this.gymTime = gymTime;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public int getAge() {
        return age;
    }

    public double getAmount() {
        return amount;
    }

    public String getGender() {
        return gender;
    }

    public String getGymTime() {
        return gymTime;
    }
}
