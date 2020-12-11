package elena.kozlova.intech.Subscriber.controller;


import elena.kozlova.intech.Subscriber.service.MessageService;
import elena.kozlova.intech.Subscriber.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для приема сообщений
 */

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class MessageController {

    @Autowired
    private final MessageService messageService;

    @PostMapping("/messenger")
    public void readMsg(@RequestBody Message message){
        messageService.saveMessage(message);
    }
}
