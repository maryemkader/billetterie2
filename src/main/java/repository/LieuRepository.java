
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Lieu;

public interface LieuRepository
        extends JpaRepository<Lieu, Long> {

}
