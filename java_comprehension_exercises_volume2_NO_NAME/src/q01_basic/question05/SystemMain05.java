package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {
		System.out.println("---SHOW MEMBERS--- ");

		AbstMember[] members = new AbstMember[2];

		AbstMember nonmember = new NonMember("Sato Kensuke");
		members[0] = nonmember;

		AbstMember member = new Member(1, "PassW0rd", "Miura Manabu", 28, 2);
		members[1] = member;

		AbstMember[] m = { nonmember, member };

		MemberManager.showAllMembers(m);

		System.out.println("---BUY ITEM--- ");
		for (AbstMember abst : m) {
			abst.buyItem();
		}
	}

}
