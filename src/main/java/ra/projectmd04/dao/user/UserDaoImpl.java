package ra.projectmd04.dao.user;

import org.springframework.stereotype.Repository;
import ra.projectmd04.model.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class UserDaoImpl implements IUserDao {
    @PersistenceContext
    private EntityManager em;
    @Override
    public User findByUsername(String username) {
        // truy van du lieu theo username va password
        TypedQuery<User> query = em.createQuery("from User where username = :username and isDeleted = false", User.class);
        query.setParameter("username",username);
        return query.getSingleResult();
    }

    @Override
    public void register(User user) {
    em.persist(user);
    }
}
