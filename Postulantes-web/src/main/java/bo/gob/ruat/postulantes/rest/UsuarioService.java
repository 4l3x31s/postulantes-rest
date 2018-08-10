package bo.gob.ruat.postulantes.rest;

import bo.gob.ruat.postulantes.model.posUsuarioEntity;
import bo.gob.ruat.postulantes.response.GlobalResponse;
import bo.gob.ruat.postulantes.response.ResponseUsuarioRegistro;
import bo.gob.ruat.postulantes.service.ServiciosUsuarioBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
@RequestScoped
public class UsuarioService {

    @Inject
    private ServiciosUsuarioBean serviciosUsuarioBean;

    @POST
    @Path("/registro")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public ResponseUsuarioRegistro registrarUsuario(posUsuarioEntity usuarioEntity){
        ResponseUsuarioRegistro response = new ResponseUsuarioRegistro();
        try{
            posUsuarioEntity user = this.serviciosUsuarioBean.insertarUsuario(usuarioEntity);
            response.setUsuarioEntity(user);
            response.setMensaje("");
            response.setContinuarFlujo(true);

        }catch (Exception ex){
            response.setMensaje("Error: " + ex.getMessage());
            response.setContinuarFlujo(false);

        }
        return response;
    }

}
