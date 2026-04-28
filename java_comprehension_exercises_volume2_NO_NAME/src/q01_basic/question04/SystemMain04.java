package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {
		System.out.println("---SHOW ALL MEMBERS--- ");

		Member[] members = new Member[2];
		Member member1 = new Member(1, "Passw0rd ", "Miura Manabu", 28, 2);
		Member member2 = new Member(2, "aaaAAA ", "Sato Kensuke", 43, 1);

		Member[] m = { member1, member2 };
		MemberManager.showAllMembers(m);
	}

}