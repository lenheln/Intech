package elena.kozlova.intech.Subscriber.repository;

import elena.kozlova.intech.Subscriber.domain.PurchaseMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с сущностью PurchaseMessage
 */
@Repository
public interface PurchaseMessageRepository extends JpaRepository<PurchaseMessage, Long> {
}
