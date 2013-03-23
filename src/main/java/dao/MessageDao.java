package dao;

import java.util.List;

import model.Message;

/**
 * Interface for storing and retrieving {@link Message} instances
 * @author MDee
 *
 */
public interface MessageDao extends BaseDao {
    
    public Long persistMessage(Message message);
    
    public Message updateMessage(Message message);
    
    public Message getMessageWithId(Long id);
    
    public List<Message> getAllMessages();
    
}
