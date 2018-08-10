package bo.gob.ruat.postulantes.service;

import bo.gob.ruat.postulantes.dataacces.DataAccesUsuarioBean;
import bo.gob.ruat.postulantes.model.posUsuarioEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless(name = "ServiciosUsuarioEJB")
public class ServiciosUsuarioBean {
    @Inject
    private DataAccesUsuarioBean dataAccesUsuarioBean;

    public ServiciosUsuarioBean() {
    }
    public posUsuarioEntity login(String ci, String pass){
        return this.dataAccesUsuarioBean.loginUsuario(ci,pass);
    }
    public posUsuarioEntity insertarUsuario(posUsuarioEntity usuarioEntity){
        return this.dataAccesUsuarioBean.insertarUsuario(usuarioEntity);
    }

}
