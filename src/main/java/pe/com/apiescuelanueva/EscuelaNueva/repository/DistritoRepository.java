
package pe.com.apiescuelanueva.EscuelaNueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.EscuelaNueva.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long>{
    //@Query("Select d from DistritoEntity d")
    @Query("Select d from DistritoEntity d where d.estado=1")
    List<DistritoEntity> finAllCustom();
}
