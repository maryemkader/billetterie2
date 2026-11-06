
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Paiement;

public interface PaiementRepository
        extends JpaRepository<Paiement, Long> {

}
