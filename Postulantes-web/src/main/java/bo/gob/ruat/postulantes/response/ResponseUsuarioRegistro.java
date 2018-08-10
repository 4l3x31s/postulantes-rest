package bo.gob.ruat.postulantes.response;

import bo.gob.ruat.postulantes.model.posUsuarioEntity;

public class ResponseUsuarioRegistro extends GlobalResponse {
    private posUsuarioEntity usuarioEntity;

    public posUsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(posUsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }
}
