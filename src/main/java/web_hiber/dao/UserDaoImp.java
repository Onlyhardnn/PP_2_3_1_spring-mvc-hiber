package web_hiber.dao;

import org.springframework.stereotype.Repository;
import web_hiber.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    /**
     * Добавляет нового пользователя в базу данных.
     *
     * @param user Пользователь для добавления
     */
    @Override
    public void add(User user) {
        em.persist(user);
    }

    /**
     * Обновляет существующего пользователя в базе данных.
     *
     * @param user Пользователь с обновленными данными
     */
    @Override
    public void update(User user) {
        em.merge(user);
    }

    /**
     * Удаляет пользователя из базы данных по его ID.
     *
     * @param id ID пользователя для удаления
     */
    @Override
    public void delete(Long id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }

    /**
     * Получает список всех пользователей из базы данных.
     *
     * @return Список всех пользователей
     */
    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = em.createQuery("SELECT u FROM users u", User.class);
        return query.getResultList();
    }
}
