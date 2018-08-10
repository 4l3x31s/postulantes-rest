package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "cargo_postulacion", schema = "public", catalog = "postulantes")
public class posCargoPostulacionEntity {
    private long idCargoPostulacion;
    private String numReferencia;
    private String nombreCargo;
    private String departamentoCiudad;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;
    private Collection<posResultadoPostulacionEntity> resultadoPostulacionsByIdCargoPostulacion;

    @Id
    @Column(name = "id_cargo_postulacion", nullable = false)
    @SequenceGenerator(name="cargo_postulacion_id_cargo_postulacion_seq", sequenceName="cargo_postulacion_id_cargo_postulacion_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cargo_postulacion_id_cargo_postulacion_seq")
    public long getIdCargoPostulacion() {
        return idCargoPostulacion;
    }

    public void setIdCargoPostulacion(long idCargoPostulacion) {
        this.idCargoPostulacion = idCargoPostulacion;
    }

    @Basic
    @Column(name = "num_referencia", nullable = false, length = 150)
    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    @Basic
    @Column(name = "nombre_cargo", nullable = false, length = -1)
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    @Basic
    @Column(name = "departamento_ciudad", nullable = false, length = -1)
    public String getDepartamentoCiudad() {
        return departamentoCiudad;
    }

    public void setDepartamentoCiudad(String departamentoCiudad) {
        this.departamentoCiudad = departamentoCiudad;
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

        posCargoPostulacionEntity that = (posCargoPostulacionEntity) o;

        if (idCargoPostulacion != that.idCargoPostulacion) return false;
        if (numReferencia != null ? !numReferencia.equals(that.numReferencia) : that.numReferencia != null)
            return false;
        if (nombreCargo != null ? !nombreCargo.equals(that.nombreCargo) : that.nombreCargo != null) return false;
        if (departamentoCiudad != null ? !departamentoCiudad.equals(that.departamentoCiudad) : that.departamentoCiudad != null)
            return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idCargoPostulacion ^ (idCargoPostulacion >>> 32));
        result = 31 * result + (numReferencia != null ? numReferencia.hashCode() : 0);
        result = 31 * result + (nombreCargo != null ? nombreCargo.hashCode() : 0);
        result = 31 * result + (departamentoCiudad != null ? departamentoCiudad.hashCode() : 0);
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

    @OneToMany(mappedBy = "cargoPostulacionByIdCargoPostulacion")
    public Collection<posResultadoPostulacionEntity> getResultadoPostulacionsByIdCargoPostulacion() {
        return resultadoPostulacionsByIdCargoPostulacion;
    }

    public void setResultadoPostulacionsByIdCargoPostulacion(Collection<posResultadoPostulacionEntity> resultadoPostulacionsByIdCargoPostulacion) {
        this.resultadoPostulacionsByIdCargoPostulacion = resultadoPostulacionsByIdCargoPostulacion;
    }
}
