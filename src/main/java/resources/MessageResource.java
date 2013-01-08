package resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import model.Message;
import org.apache.log4j.Logger;
import service.MessageService;
import com.google.inject.Inject;

/**
 * Resource to access {@link Message} instances
 * @author MDee
 *
 */
@Path("/msg")
public class MessageResource {

    private static final Logger logger = Logger.getLogger(MessageResource.class);
    
    @Inject
    private MessageService messageService;
    
    @GET
    @Produces("text/plain")
    public String handleGreeting() {
        /*
         *  TODO: Connect DB so service can actually
         *  complete message operations 
         */ 
//        List<Message> messages = messageService.getAllMessages();
//        for (Message m : messages) {
//            logger.info(m.getText());
//        }
        return "Here's a static message: Hello World!";
    }
    
}