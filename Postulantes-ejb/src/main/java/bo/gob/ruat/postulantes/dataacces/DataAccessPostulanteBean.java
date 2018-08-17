package bo.gob.ruat.postulantes.dataacces;

import bo.gob.ruat.postulantes.model.posPostulanteEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "DataAccesPostulanteEJB")
public class DataAccessPostulanteBean {
    @PersistenceContext(unitName = "pruebaDS")
    private EntityManager em;

    public posPostulanteEntity insertarPostulante(posPostulanteEntity entity){
        em.persist(entity);
        return entity;
    }
    public posPostulanteEntity getPostulante(String ciPostulante){
        posPostulanteEntity objUsuario = em.createQuery("Select pos From posPostulanteEntity pos where pos.ci = " + ciPostulante, posPostulanteEntity.class).getSingleResult();
        return objUsuario;
    }
    public List<posPostulanteEntity> listPostulantes(String apellidos){
        List<posPostulanteEntity> lstPostulantes = em.createQuery("select pos from posPostulanteEntity pos where pos.apellidoPaterno = " + apellidos
                ,posPostulanteEntity.class).getResultList();
        return lstPostulantes;
    }
    public List<posPostulanteEntity> listCargoPostulaciones(long idPostulante){
        return em.createQuery("select po from posPostulanteEntity po where po.idPostulante = " + idPostulante).getResultList();
    }
}
