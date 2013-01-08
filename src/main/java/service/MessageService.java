package service;

import java.util.List;

import model.Message;

/**
 * Simple service for {@link Message} operations
 * @author MDee
 *
 */
public interface MessageService extends BaseService {

    public Long persistMessage(Message message);
    
    public Message updateMessage(Message message);
    
    public Message getMessageWithId(Long id);
    
    public List<Message> getAllMessages();
    
}
