package elena.kozlova.intech.Subscriber.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность Сообщение со значением action = SUBSCRIPTION
 */
@Entity
@Table(name = "SUBSCRIPTION")
@NoArgsConstructor
public class SubscriptionMessage extends Message {
}
