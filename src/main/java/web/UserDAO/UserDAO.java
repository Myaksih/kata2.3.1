package web.UserDAO;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public interface UserDAO {
    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(User user);

    void deleteById(long id);
}
