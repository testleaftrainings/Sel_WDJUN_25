package week3.day1;

public interface RBI {
	void repoRate();
	void reverseRepoRate();
	void crr();
	void slr();
	 // National Payment Corporation of india
	default void internetBanking() {
		System.out.println("Through NPCI , RBI overviews UPI and IMPS operation between banks");
	}

}
