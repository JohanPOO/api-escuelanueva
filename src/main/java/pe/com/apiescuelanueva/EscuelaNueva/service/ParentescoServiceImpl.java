
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.EscuelaNueva.entity.ParentescoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.repository.ParentescoRepository;

@Service
public class ParentescoServiceImpl implements ParentescoService{

    @Autowired
    private ParentescoRepository parentescorepository;
    
    @Override
    public List<ParentescoEntity> findAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescorepository.finAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return parentescorepository.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return parentescorepository.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
      ParentescoEntity objParentesco =  parentescorepository.getById(p.getCodigo());
      BeanUtils.copyProperties(p, objParentesco);
      return parentescorepository.save(objParentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
       ParentescoEntity objParentesco =  parentescorepository.getById(p.getCodigo());
       objParentesco.setEstado(false);
       return parentescorepository.save(objParentesco);
    }
    
}
