package board;

public class Service {
	DAO dao; // 다오라는 class에 들어갈 변수를 field값에 설정함. 
	
	public Service() {
		dao = new DAO();
	} // 변수 설정하면 뭐 해야한다고? 초기화
	
	public void register(String str) {
		// Security or Log 
		dao.insert(str);
	}
	public void remove(int num) {
		dao.delete(num);
	}
	public void modify(int num, String str) {
		dao.update(num, str);
	}
	public String get(int num) {
		return dao.select(num);
	}
}
