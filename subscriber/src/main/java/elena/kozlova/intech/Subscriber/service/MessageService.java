package elena.kozlova.intech.Subscriber.service;

import elena.kozlova.intech.Subscriber.domain.Message;
import elena.kozlova.intech.Subscriber.domain.PurchaseMessage;
import elena.kozlova.intech.Subscriber.domain.SubscriptionMessage;
import elena.kozlova.intech.Subscriber.repository.PurchaseMessageRepository;
import elena.kozlova.intech.Subscriber.repository.SubscriptionMessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Сервисный слой для работы с сущностью сообщение
 */
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MessageService {

    @Autowired
    private final PurchaseMessageRepository purchaseMessageRepository;

    @Autowired
    private final SubscriptionMessageRepository subscriptionMessageRepository;

    /**
     * Сохраняет сущность в нужную таблицу в зависимости от класса сущности
     * @param message сущность сообщение
     */
    public void saveMessage(Message message) {
        if (message instanceof PurchaseMessage) {
            purchaseMessageRepository.save((PurchaseMessage) message);
            log.info("Сообщение сохранено в базу PURCHASE: " + message.toString());
        } else {
            subscriptionMessageRepository.save((SubscriptionMessage) message);
            log.info("Сообщение сохранено в базу SUBSCRIPTION: " + message.toString());
        }
    }
}
