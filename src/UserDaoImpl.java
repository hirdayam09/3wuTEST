import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao{
	@Autowired
	  JdbcTemplate jdbcTemplate;
	 
	public int saveUser(User user) {
		 
		 String sql = "insert into users values(?,?,?,?,?,?)";
		    jdbcTemplate.update(sql, new Object[] { user.getAadharNumber(), user.getDateOfBirth(), user.getName(), user.getEmail(), user.getWalletAmount(), user.getHomeArea()});
		return 0;
		
	}


}
