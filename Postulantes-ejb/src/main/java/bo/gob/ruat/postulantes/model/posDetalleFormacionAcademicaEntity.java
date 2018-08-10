package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "detalle_formacion_academica", schema = "public", catalog = "postulantes")
public class posDetalleFormacionAcademicaEntity {
    private long idDetalleForAc;
    private Timestamp desde;
    private Timestamp hasta;
    private String universidad;
    private String nomProgEstudios;
    private Boolean titulado;
    private String tipoFormacion;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_detalle_for_ac", nullable = false)
    @SequenceGenerator(name="detalle_formacion_academica_id_detalle_for_ac_seq", sequenceName="detalle_formacion_academica_id_detalle_for_ac_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="detalle_formacion_academica_id_detalle_for_ac_seq")
    public long getIdDetalleForAc() {
        return idDetalleForAc;
    }

    public void setIdDetalleForAc(long idDetalleForAc) {
        this.idDetalleForAc = idDetalleForAc;
    }

    @Basic
    @Column(name = "desde", nullable = false)
    public Timestamp getDesde() {
        return desde;
    }

    public void setDesde(Timestamp desde) {
        this.desde = desde;
    }

    @Basic
    @Column(name = "hasta", nullable = false)
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
    @Column(name = "nom_prog_estudios", nullable = true, length = -1)
    public String getNomProgEstudios() {
        return nomProgEstudios;
    }

    public void setNomProgEstudios(String nomProgEstudios) {
        this.nomProgEstudios = nomProgEstudios;
    }

    @Basic
    @Column(name = "titulado", nullable = true)
    public Boolean getTitulado() {
        return titulado;
    }

    public void setTitulado(Boolean titulado) {
        this.titulado = titulado;
    }

    @Basic
    @Column(name = "tipo_formacion", nullable = true, length = 150)
    public String getTipoFormacion() {
        return tipoFormacion;
    }

    public void setTipoFormacion(String tipoFormacion) {
        this.tipoFormacion = tipoFormacion;
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

        posDetalleFormacionAcademicaEntity that = (posDetalleFormacionAcademicaEntity) o;

        if (idDetalleForAc != that.idDetalleForAc) return false;
        if (desde != null ? !desde.equals(that.desde) : that.desde != null) return false;
        if (hasta != null ? !hasta.equals(that.hasta) : that.hasta != null) return false;
        if (universidad != null ? !universidad.equals(that.universidad) : that.universidad != null) return false;
        if (nomProgEstudios != null ? !nomProgEstudios.equals(that.nomProgEstudios) : that.nomProgEstudios != null)
            return false;
        if (titulado != null ? !titulado.equals(that.titulado) : that.titulado != null) return false;
        if (tipoFormacion != null ? !tipoFormacion.equals(that.tipoFormacion) : that.tipoFormacion != null)
            return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idDetalleForAc ^ (idDetalleForAc >>> 32));
        result = 31 * result + (desde != null ? desde.hashCode() : 0);
        result = 31 * result + (hasta != null ? hasta.hashCode() : 0);
        result = 31 * result + (universidad != null ? universidad.hashCode() : 0);
        result = 31 * result + (nomProgEstudios != null ? nomProgEstudios.hashCode() : 0);
        result = 31 * result + (titulado != null ? titulado.hashCode() : 0);
        result = 31 * result + (tipoFormacion != null ? tipoFormacion.hashCode() : 0);
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
