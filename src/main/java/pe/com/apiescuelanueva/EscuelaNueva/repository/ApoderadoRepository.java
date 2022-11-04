
package pe.com.apiescuelanueva.EscuelaNueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.EscuelaNueva.entity.ApoderadoEntity;


public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long>{
    @Query("Select a from ApoderadoEntity a where a.estado=1")
    List<ApoderadoEntity> finAllCustom();
}
