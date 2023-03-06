package db;

public class OracleDAO implements DAO {

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("You inserted items into Oracle DB");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("You deleted items from Oracle DB");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("You updated items into Oracle DB");
		
	}

}
