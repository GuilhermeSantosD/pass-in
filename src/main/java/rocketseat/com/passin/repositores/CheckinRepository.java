package rocketseat.com.passin.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.checkin.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin,Integer> {
}
