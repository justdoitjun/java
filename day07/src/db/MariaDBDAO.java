package db;

public class MariaDBDAO implements DAO {

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("You inserted items into Maria DB");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("You deleted items from Maria DB");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("You updated items into Maria DB");
		
	}

}
