
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Tag;

public interface TagRepository
        extends JpaRepository<Tag, Long> {

}
