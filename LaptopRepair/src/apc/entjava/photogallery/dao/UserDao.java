package apc.entjava.photogallery.dao;

import apc.entjava.photogallery.businesslogic.UserService;
import apc.entjava.photogallery.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by jacobcat on 12/2/2016.
 */
public class UserDao implements UserService {

    private EntityManagerFactory emf;
    public UserDao() {
        emf = Persistence.createEntityManagerFactory("PhotoGalleryDb");
    }



    public void register(User newUser) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(newUser);
            em.getTransaction().commit();
        } catch(Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
    }


    public User login(String userName, String password) {
        EntityManager em = emf.createEntityManager();
        User user = null;
        em.getTransaction().begin();
        try {
            user = em.createQuery("select u from User u where u.userName = :userName and u.password = :password", User.class)
                    .setParameter("userName", userName)
                    .setParameter("password", password)
                    .getSingleResult();
            em.getTransaction().commit();
        } catch(Exception e) {
            em.getTransaction().rollback();
        }

        em.close();
        return user;
    }
}
