package web.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO{
    @PersistenceContext
    private EntityManager entityManager;


    public List<User> findAll(){
        return entityManager.createQuery("from User",User.class).getResultList();
    }

    public User findById(long id){
        return entityManager.find(User.class, id);
    }

    public void save(User user){
        entityManager.persist(user);
    }

    public void update(User user){
        entityManager.merge(user);
    }

    public void deleteById(long id){
        entityManager.remove(findById(id));
    }
}
