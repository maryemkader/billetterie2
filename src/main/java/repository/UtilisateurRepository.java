
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Utilisateur;

public interface UtilisateurRepository
        extends JpaRepository<Utilisateur, Long> {

}
