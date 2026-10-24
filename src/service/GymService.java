package service;

import model.Member;
import java.util.ArrayList;

public class GymService {

    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
        System.out.println("\nMember added successfully!");
    }

    public void viewMembers() {

        if (members.isEmpty()) {
            System.out.println("\nNo members found.");
            return;
        }

        System.out.println("\n========== ALL MEMBERS ==========");

        for (Member member : members) {
            member.displayMember();
        }
    }

    public void generateBill(int memberId) {

        for (Member member : members) {

            if (member.getMemberId() == memberId) {

                System.out.println("\n========== GYM BILL ==========");
                System.out.println("Member ID       : " + member.getMemberId());
                System.out.println("Member Name     : " + member.getName());
                System.out.println("Membership      : " + member.getType());
                System.out.println("Duration        : " + member.getDuration() + " month(s)");
                System.out.println("--------------------------------");
                System.out.println("Total Amount    : Rs." + member.getFee());
                System.out.println("================================");

                return;
            }
        }

        System.out.println("\nMember not found!");
    }
}