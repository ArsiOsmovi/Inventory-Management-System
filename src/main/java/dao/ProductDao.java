package dao;

import Entity.Product;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductDao {

    private final SessionFactory sessionFactory;

    public ProductDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    public void createProduct(Product product){

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        }
    }
}
