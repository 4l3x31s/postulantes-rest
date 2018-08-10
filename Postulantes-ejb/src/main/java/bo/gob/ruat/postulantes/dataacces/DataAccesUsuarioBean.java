package bo.gob.ruat.postulantes.dataacces;

import bo.gob.ruat.postulantes.model.posUsuarioEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "DataAccesUsuarioEJB")
public class DataAccesUsuarioBean {

    @PersistenceContext(unitName = "pruebaDS")
    private EntityManager em;

    public DataAccesUsuarioBean() {
    }

    public posUsuarioEntity insertarUsuario(posUsuarioEntity usuarioEntity) {
        em.persist(usuarioEntity);
        return usuarioEntity;
    }

    public posUsuarioEntity loginUsuario(String ci, String pass) {
        posUsuarioEntity objUsuario = em.createQuery("Select pu From posUsuarioEntity pu where pu.ci = :ci " +
                "and pu.password=:pass", posUsuarioEntity.class).getSingleResult();
        return objUsuario;
    }

}
