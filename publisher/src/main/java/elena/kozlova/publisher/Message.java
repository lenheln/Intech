package elena.kozlova.publisher;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

/**
 * Сообщение
 */
@NoArgsConstructor
@Getter
@Setter
public class Message {

    //Идентификатор
    private Long id;

    //Уникальный номер абонента
    private Integer msisdn;

    //Тип сообщения
    private Action action;

    //UNIX timestamp
    private Long timestamp;

    public Message(Long id) {
        this.id = id;
        this.msisdn = new Random().nextInt() & Integer.MAX_VALUE;;
        this.action = (Math.random() < 0.5) ? Action.PURCHASE : Action.SUBSCRIPTION;
        this.timestamp = System.currentTimeMillis() / 1000L;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msisdn=" + msisdn +
                ", action=" + action +
                ", timestamp=" + timestamp +
                '}';
    }
}
