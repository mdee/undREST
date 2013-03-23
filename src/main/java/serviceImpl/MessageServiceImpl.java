package serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;

import com.google.inject.Inject;
import dao.BaseDao;
import dao.MessageDao;
import model.Message;
import service.MessageService;

public class MessageServiceImpl implements MessageService {

    @Inject
    private MessageDao messageDao;
    
    private static final Logger logger = Logger.getLogger(MessageService.class);
    
    public BaseDao getDao() {
        return messageDao;
    }

    public void setDao(BaseDao albombDao) {
        this.messageDao = (MessageDao) albombDao;
    }

    public Long persistMessage(Message message) {
        return messageDao.persistMessage(message);
    }

    public Message updateMessage(Message message) {
        return messageDao.updateMessage(message);
    }

    public Message getMessageWithId(Long id) {
        return messageDao.getMessageWithId(id);
    }
    
    public List<Message> getAllMessages() {
        return messageDao.getAllMessages();
    }

}
