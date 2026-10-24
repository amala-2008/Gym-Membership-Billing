package model;

public class Member extends Membership {

    private int memberId;
    private String name;
    private int age;
    private String phone;

    public Member(int memberId, String name, int age, String phone,
                  String membershipType, int duration) {

        super(membershipType, duration);

        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void displayMember() {
        System.out.println("\n----- MEMBER DETAILS -----");
        System.out.println("Member ID       : " + memberId);
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Phone           : " + phone);
        displayMembership();
    }
}