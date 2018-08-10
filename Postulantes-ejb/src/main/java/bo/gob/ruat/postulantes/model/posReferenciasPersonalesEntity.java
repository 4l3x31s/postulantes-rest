package bo.gob.ruat.postulantes.model;

import javax.persistence.*;

@Entity
@Table(name = "referencias_personales", schema = "public", catalog = "postulantes")
public class posReferenciasPersonalesEntity {
    private long idReferencias;
    private String nombres;
    private String apellidos;
    private String empresa;
    private String cargo;
    private Integer telefono;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_referencias", nullable = false)
    @SequenceGenerator(name="referencias_personales_id_referencias_seq", sequenceName="referencias_personales_id_referencias_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="referencias_personales_id_referencias_seq")
    public long getIdReferencias() {
        return idReferencias;
    }

    public void setIdReferencias(long idReferencias) {
        this.idReferencias = idReferencias;
    }

    @Basic
    @Column(name = "nombres", nullable = true, length = -1)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellidos", nullable = true, length = -1)
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "empresa", nullable = true, length = -1)
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Basic
    @Column(name = "cargo", nullable = true, length = -1)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "telefono", nullable = true)
    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "id_postulante", nullable = true, insertable = false, updatable = false)
    public Long getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(Long idPostulante) {
        this.idPostulante = idPostulante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        posReferenciasPersonalesEntity that = (posReferenciasPersonalesEntity) o;

        if (idReferencias != that.idReferencias) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (empresa != null ? !empresa.equals(that.empresa) : that.empresa != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idReferencias ^ (idReferencias >>> 32));
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (empresa != null ? empresa.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (idPostulante != null ? idPostulante.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_postulante", referencedColumnName = "id_postulante")
    public posPostulanteEntity getPostulanteByIdPostulante() {
        return postulanteByIdPostulante;
    }

    public void setPostulanteByIdPostulante(posPostulanteEntity postulanteByIdPostulante) {
        this.postulanteByIdPostulante = postulanteByIdPostulante;
    }
}
