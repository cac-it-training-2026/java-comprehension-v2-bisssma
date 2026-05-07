package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {
		List<Member> members = memberStorage.getMembers();//ただ元々ある情報を取ってくるだけ

		if (members != null) {//当たり前にnullじゃないのでそのままfor文へ
			for (Member member : members) {//「元々の情報」と「入力した情報」の比較
				if (member.getId() == id && member.getPassword().equals(password)) {
					return member;
				}
			}
		}
		return null;
	}
}
