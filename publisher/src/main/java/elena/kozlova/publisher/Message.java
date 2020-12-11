package elena.kozlova.publisher;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@NoArgsConstructor
@Getter
@Setter
public class Message {
    private Long id;
    private Long msisdn;
    private Action action;
    private Long timestamp;

    public Message(Long id) {
        this.id = id;
        this.msisdn = new Random().nextLong();
        this.action = (Math.random() < 0.5) ? Action.PURCHASE : Action.SUBSCRIPTION;
        this.timestamp = System.currentTimeMillis() / 1000L;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msisdn=" + msisdn +
                ", msgType=" + action +
                ", timestamp=" + timestamp +
                '}';
    }
}
