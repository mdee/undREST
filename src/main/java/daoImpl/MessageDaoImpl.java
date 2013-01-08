package daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Message;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import dao.MessageDao;

/**
 * Implementation of {@link MessageDao} interface
 * @author MDee
 *
 */
public class MessageDaoImpl implements MessageDao {
    
    @Inject 
    private Provider<EntityManager> entityManager; 

    public Provider<EntityManager> getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(Provider<EntityManager> entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Long persistMessage(Message message) throws IllegalArgumentException {
        if (message.getText() == null) {
            throw new IllegalArgumentException("Message text cannot be null.");
        }
        entityManager.get().persist(message);
        return message.getId();
    }

    @Transactional
    public Message updateMessage(Message message) {
        return entityManager.get().merge(message);
    }

    @Transactional
    public Message getMessageWithId(Long id) {
        TypedQuery<Message> query = entityManager.get().createQuery("from Message m where m.id = :id", Message.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
    @Transactional
    public List<Message> getAllMessages() {
        TypedQuery<Message> query = entityManager.get().createQuery("from Message m", Message.class);
        return query.getResultList();
    }

}
