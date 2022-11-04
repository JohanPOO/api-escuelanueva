
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.EscuelaNueva.entity.ApoderadoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.repository.ApoderadoRepository;

@Service
public class ApoderadoServiceImpl implements ApoderadoService{

    @Autowired
    private ApoderadoRepository apoderadorepository;
    
    @Override
    public List<ApoderadoEntity> findAll() {
        return apoderadorepository.findAll();
    }

    @Override
    public List<ApoderadoEntity> findAllCustom() {
       return apoderadorepository.finAllCustom();
    }

    @Override
    public Optional<ApoderadoEntity> findById(Long id) {
        return apoderadorepository.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity a) {
        return apoderadorepository.save(a);
    }

    @Override
    public ApoderadoEntity update(ApoderadoEntity a) {
      ApoderadoEntity objApoderado =  apoderadorepository.getById(a.getCodigo());
      BeanUtils.copyProperties(a, objApoderado);
      return apoderadorepository.save(objApoderado);
    }

    @Override
    public ApoderadoEntity delete(ApoderadoEntity a) {
      ApoderadoEntity objApoderado =  apoderadorepository.getById(a.getCodigo());
      objApoderado.setEstado(false);
      return apoderadorepository.save(objApoderado);
    }

   
    
}
