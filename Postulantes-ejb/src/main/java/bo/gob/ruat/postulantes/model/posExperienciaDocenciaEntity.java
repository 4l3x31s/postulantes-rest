package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "experiencia_docencia", schema = "public", catalog = "postulantes")
public class posExperienciaDocenciaEntity {
    private long idDocencia;
    private String materia;
    private Boolean titular;
    private Boolean suplente;
    private String universidad;
    private String semestreContratacion;
    private Timestamp desde;
    private Timestamp hasta;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_docencia", nullable = false)
    @SequenceGenerator(name="experiencia_docencia_id_docencia_seq", sequenceName="experiencia_docencia_id_docencia_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="experiencia_docencia_id_docencia_seq")
    public long getIdDocencia() {
        return idDocencia;
    }

    public void setIdDocencia(long idDocencia) {
        this.idDocencia = idDocencia;
    }

    @Basic
    @Column(name = "materia", nullable = true, length = -1)
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Basic
    @Column(name = "titular", nullable = true)
    public Boolean getTitular() {
        return titular;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }

    @Basic
    @Column(name = "suplente", nullable = true)
    public Boolean getSuplente() {
        return suplente;
    }

    public void setSuplente(Boolean suplente) {
        this.suplente = suplente;
    }

    @Basic
    @Column(name = "universidad", nullable = true, length = -1)
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Basic
    @Column(name = "semestre_contratacion", nullable = true, length = -1)
    public String getSemestreContratacion() {
        return semestreContratacion;
    }

    public void setSemestreContratacion(String semestreContratacion) {
        this.semestreContratacion = semestreContratacion;
    }

    @Basic
    @Column(name = "desde", nullable = true)
    public Timestamp getDesde() {
        return desde;
    }

    public void setDesde(Timestamp desde) {
        this.desde = desde;
    }

    @Basic
    @Column(name = "hasta", nullable = true)
    public Timestamp getHasta() {
        return hasta;
    }

    public void setHasta(Timestamp hasta) {
        this.hasta = hasta;
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

        posExperienciaDocenciaEntity that = (posExperienciaDocenciaEntity) o;

        if (idDocencia != that.idDocencia) return false;
        if (materia != null ? !materia.equals(that.materia) : that.materia != null) return false;
        if (titular != null ? !titular.equals(that.titular) : that.titular != null) return false;
        if (suplente != null ? !suplente.equals(that.suplente) : that.suplente != null) return false;
        if (universidad != null ? !universidad.equals(that.universidad) : that.universidad != null) return false;
        if (semestreContratacion != null ? !semestreContratacion.equals(that.semestreContratacion) : that.semestreContratacion != null)
            return false;
        if (desde != null ? !desde.equals(that.desde) : that.desde != null) return false;
        if (hasta != null ? !hasta.equals(that.hasta) : that.hasta != null) return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idDocencia ^ (idDocencia >>> 32));
        result = 31 * result + (materia != null ? materia.hashCode() : 0);
        result = 31 * result + (titular != null ? titular.hashCode() : 0);
        result = 31 * result + (suplente != null ? suplente.hashCode() : 0);
        result = 31 * result + (universidad != null ? universidad.hashCode() : 0);
        result = 31 * result + (semestreContratacion != null ? semestreContratacion.hashCode() : 0);
        result = 31 * result + (desde != null ? desde.hashCode() : 0);
        result = 31 * result + (hasta != null ? hasta.hashCode() : 0);
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
