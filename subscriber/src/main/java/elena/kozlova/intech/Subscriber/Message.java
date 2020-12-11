package elena.kozlova.intech.Subscriber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Message {

    @Id
    private Long id;

    @Column
    private Long msisdn;

    @Column(name = "act")
    private Action action;

    @Column(name = "timestmp")
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
