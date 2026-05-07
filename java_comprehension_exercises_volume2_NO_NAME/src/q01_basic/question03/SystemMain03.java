package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setName("Miura Manabu");
		member1.setAge(30);
		member1.setRank(1);

		System.out.println("---SHOW DATA(NULL)--- ");
		member1.showMember();

		Member member2 = new Member("Miura Manabu ", 28, 2);
		System.out.println("---SHOW DATA(Miura)--- ");
		member2.showMember();
	}

}