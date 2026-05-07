package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();
		ArrayList<Member> members = new ArrayList<>();

		Member member1 = Member.getInstance(1, "Password", "Miura Manabu", 28, 2);
		members.add(member1);

		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);
		members.add(member2);

		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		try {
			System.out.print("input target id >>");
			int targetId = cr.inputNumber();
			System.out.print("input new password >>");
			String newPassword = cr.inputString();

			MemberManager.updatePassword(members, targetId, newPassword);

		} catch (IOException | NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);
	}

}
