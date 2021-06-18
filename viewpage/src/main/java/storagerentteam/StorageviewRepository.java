package storagerentteam;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StorageviewRepository extends CrudRepository<Storageview, Long> {

    List<Storageview> findByRsvId(Long rsvId);
    List<Storageview> findByRsvId(Long rsvId);
    List<Storageview> findByPayId(Long payId);

}