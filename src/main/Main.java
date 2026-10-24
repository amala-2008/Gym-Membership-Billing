package main;

import model.Member;
import service.GymService;
import exception.InvalidInputException;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static GymService service = new GymService();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("       GYM MEMBERSHIP & BILLING");
            System.out.println("====================================");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.println("====================================");

            try {

                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        addMember();
                        break;

                    case 2:
                        service.viewMembers();
                        break;

                    case 3:
                        generateBill();
                        break;

                    case 4:
                        System.out.println("\nThank you for using Gym Membership & Billing System!");
                        break;

                    default:
                        throw new InvalidInputException(
                                "Invalid choice! Please enter 1 to 4."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println("\nInvalid input! Please enter a number.");

                choice = 0;

            } catch (InvalidInputException e) {

                System.out.println("\nError: " + e.getMessage());

                choice = 0;
            }

        } while (choice != 4);

        sc.close();
    }

    public static void addMember() {

        try {

            System.out.println("\n========== ADD MEMBER ==========");

            System.out.print("Enter Member ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                throw new InvalidInputException("Name cannot be empty.");
            }

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 15 || age > 70) {
                throw new InvalidInputException(
                        "Age must be between 15 and 70."
                );
            }

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            if (!phone.matches("\\d{10}")) {
                throw new InvalidInputException(
                        "Phone number must contain exactly 10 digits."
                );
            }

            System.out.print("Enter Membership Type (Basic/Premium): ");
            String type = sc.nextLine();

            if (!type.equalsIgnoreCase("Basic")
                    && !type.equalsIgnoreCase("Premium")) {

                throw new InvalidInputException(
                        "Membership must be Basic or Premium."
                );
            }

            System.out.print("Enter Duration (months): ");
            int duration = Integer.parseInt(sc.nextLine());

            if (duration <= 0) {
                throw new InvalidInputException(
                        "Duration must be greater than 0."
                );
            }

            Member member = new Member(
                    id,
                    name,
                    age,
                    phone,
                    type,
                    duration
            );

            service.addMember(member);

        } catch (NumberFormatException e) {

            System.out.println("\nInvalid number entered!");

        } catch (InvalidInputException e) {

            System.out.println("\nError: " + e.getMessage());
        }
    }

    public static void generateBill() {

        try {

            System.out.print("\nEnter Member ID: ");
            int id = Integer.parseInt(sc.nextLine());

            service.generateBill(id);

        } catch (NumberFormatException e) {

            System.out.println("\nInvalid Member ID!");
        }
    }
}