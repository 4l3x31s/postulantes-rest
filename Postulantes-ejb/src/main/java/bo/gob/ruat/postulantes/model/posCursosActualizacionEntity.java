package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cursos_actualizacion", schema = "public", catalog = "postulantes")
public class posCursosActualizacionEntity {
    private long idCursoAct;
    private Timestamp desde;
    private Timestamp hasta;
    private String universidad;
    private String nombreCurso;
    private Integer numHoras;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_curso_act", nullable = false)
    @SequenceGenerator(name="cursos_actualizacion_id_curso_act_seq", sequenceName="cursos_actualizacion_id_curso_act_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cursos_actualizacion_id_curso_act_seq")
    public long getIdCursoAct() {
        return idCursoAct;
    }

    public void setIdCursoAct(long idCursoAct) {
        this.idCursoAct = idCursoAct;
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
    @Column(name = "universidad", nullable = true, length = -1)
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Basic
    @Column(name = "nombre_curso", nullable = true, length = -1)
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Basic
    @Column(name = "num_horas", nullable = true)
    public Integer getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(Integer numHoras) {
        this.numHoras = numHoras;
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

        posCursosActualizacionEntity that = (posCursosActualizacionEntity) o;

        if (idCursoAct != that.idCursoAct) return false;
        if (desde != null ? !desde.equals(that.desde) : that.desde != null) return false;
        if (hasta != null ? !hasta.equals(that.hasta) : that.hasta != null) return false;
        if (universidad != null ? !universidad.equals(that.universidad) : that.universidad != null) return false;
        if (nombreCurso != null ? !nombreCurso.equals(that.nombreCurso) : that.nombreCurso != null) return false;
        if (numHoras != null ? !numHoras.equals(that.numHoras) : that.numHoras != null) return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idCursoAct ^ (idCursoAct >>> 32));
        result = 31 * result + (desde != null ? desde.hashCode() : 0);
        result = 31 * result + (hasta != null ? hasta.hashCode() : 0);
        result = 31 * result + (universidad != null ? universidad.hashCode() : 0);
        result = 31 * result + (nombreCurso != null ? nombreCurso.hashCode() : 0);
        result = 31 * result + (numHoras != null ? numHoras.hashCode() : 0);
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
