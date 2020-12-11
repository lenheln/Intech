package elena.kozlova.intech.Subscriber.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность Сообщение со значением action = PURCHASE
 */
@Entity
@Table(name = "PURCHASE")
@NoArgsConstructor
public class PurchaseMessage extends Message{
}
