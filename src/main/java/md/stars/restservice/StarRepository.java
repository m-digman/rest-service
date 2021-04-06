package md.stars.restservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StarRepository extends JpaRepository<Star, Long> {

    @Query("SELECT s FROM stars s WHERE s.starName LIKE %?1%")
    List<Star> findByStarName(String starName);
}
