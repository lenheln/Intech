package elena.kozlova.intech.Subscriber.repository;

import elena.kozlova.intech.Subscriber.domain.SubscriptionMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с сущностью SubscriptionMessage
 */
@Repository
public interface SubscriptionMessageRepository extends JpaRepository<SubscriptionMessage, Long> {
}
