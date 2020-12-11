package elena.kozlova.intech.Subscriber.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import elena.kozlova.intech.Subscriber.utils.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Абстрактный класс сообщение
 * В зависимости от значения поля action выбирается соответствующий подкласс
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "action", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PurchaseMessage.class, name = "PURCHASE"),
        @JsonSubTypes.Type(value = SubscriptionMessage.class, name = "SUBSCRIPTION")
})
public abstract class Message {

    @Id
    private Long id;

    @Column
    private Long msisdn;

    @Column(name = "act")
    @Enumerated(EnumType.STRING)
    private Action action;

    @Column(name = "timestmp")
    private Long timestamp;

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
