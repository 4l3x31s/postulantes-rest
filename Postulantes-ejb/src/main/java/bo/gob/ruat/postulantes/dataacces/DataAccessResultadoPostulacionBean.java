package bo.gob.ruat.postulantes.dataacces;

import bo.gob.ruat.postulantes.model.posResultadoPostulacionEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "DataAccessResultadoPostulacionEJB")
public class DataAccessResultadoPostulacionBean {
    @PersistenceContext(unitName = "pruebaDS")
    private EntityManager em;

    public posResultadoPostulacionEntity registrarResultado(posResultadoPostulacionEntity entity){
        em.persist(entity);
        return entity;
    }

    public List<posResultadoPostulacionEntity> listaResultadosByPuesto(long idCargoPostulacion){
        return em.createQuery("select rp from posResultadoPostulacionEntity rp where rp.idCargoPostulacion = " + idCargoPostulacion).getResultList();
    }

}
