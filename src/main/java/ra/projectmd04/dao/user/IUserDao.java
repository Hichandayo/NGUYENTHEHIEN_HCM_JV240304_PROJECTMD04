package ra.projectmd04.dao.user;

import ra.projectmd04.model.entity.User;

public interface IUserDao {
User findByUsername(String username);
void register(User user);
}
