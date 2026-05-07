package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	public static void showAllMembers(Member[] members) {
		for (Member m : members) {
			m.showMember();
		}
	}

}
