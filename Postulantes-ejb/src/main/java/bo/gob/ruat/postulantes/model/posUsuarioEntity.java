package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "usuario", schema = "public", catalog = "postulantes")
public class posUsuarioEntity {
    private long idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String ci;
    private String password;
    private Integer rol;
    private Boolean estado;
    private Collection<posPostulanteEntity> postulantesByIdUsuario;

    @Id
    @Column(name = "id_usuario", nullable = false)
    @SequenceGenerator(name="usuario_id_usuario_seq", sequenceName="usuario_id_usuario_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario_id_usuario_seq")
    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "nombre_usuario", nullable = true, length = -1)
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Basic
    @Column(name = "apellido_usuario", nullable = true, length = -1)
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    @Basic
    @Column(name = "ci", nullable = true, length = -1)
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "rol", nullable = true)
    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "estado", nullable = true)
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        posUsuarioEntity that = (posUsuarioEntity) o;

        if (idUsuario != that.idUsuario) return false;
        if (nombreUsuario != null ? !nombreUsuario.equals(that.nombreUsuario) : that.nombreUsuario != null)
            return false;
        if (apellidoUsuario != null ? !apellidoUsuario.equals(that.apellidoUsuario) : that.apellidoUsuario != null)
            return false;
        if (ci != null ? !ci.equals(that.ci) : that.ci != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idUsuario ^ (idUsuario >>> 32));
        result = 31 * result + (nombreUsuario != null ? nombreUsuario.hashCode() : 0);
        result = 31 * result + (apellidoUsuario != null ? apellidoUsuario.hashCode() : 0);
        result = 31 * result + (ci != null ? ci.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usuarioByIdUsuarioRegistro")
    public Collection<posPostulanteEntity> getPostulantesByIdUsuario() {
        return postulantesByIdUsuario;
    }

    public void setPostulantesByIdUsuario(Collection<posPostulanteEntity> postulantesByIdUsuario) {
        this.postulantesByIdUsuario = postulantesByIdUsuario;
    }
}
