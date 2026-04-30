package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;

		System.out.println("---CREATE MEMBER DATA---");

		try {
			System.out.println("input id>>");
			inputId = cr.inputNumber();

			System.out.println("input password>>");
			inputPassword = cr.inputString();
		} catch (NumberFormatException e) {// 数値変換エラー時の処理
			System.out.println("error!");
			e.printStackTrace();
			return;
		} catch (IOException e) {//入出力エラー時の処理
			e.printStackTrace();
			return;
		}

		Member member = new Member(inputId, inputPassword, "Miura Manabu", 28, 2);

		System.out.println("---SHOW MEMBER---");
		member.showMember();
	}

}