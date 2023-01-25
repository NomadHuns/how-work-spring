package model;

public class UserRepository {
	public int insert() {
		return 1;
	}
	public User findById(int id) {
		return newUser(id);
	}
	
	private User newUser(int id) {
		User user = new User();
		user.setId(id);
		user.setUsername("user"+id);
		user.setPassword("1234");
		user.setEmail("user"+id+"@naver.com");
		return user;
	}
}
