package bo.gob.ruat.postulantes.model;

import javax.persistence.*;

@Entity
@Table(name = "conocimientos_computacion", schema = "public", catalog = "postulantes")
public class posConocimientosComputacionEntity {
    private long idConocimientos;
    private String paquetes;
    private Boolean certificado;
    private Integer nivelConocimiento;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_conocimientos", nullable = false)
    @SequenceGenerator(name="conocimientos_computacion_id_conocimientos_seq", sequenceName="conocimientos_computacion_id_conocimientos_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="conocimientos_computacion_id_conocimientos_seq")
    public long getIdConocimientos() {
        return idConocimientos;
    }

    public void setIdConocimientos(long idConocimientos) {
        this.idConocimientos = idConocimientos;
    }

    @Basic
    @Column(name = "paquetes", nullable = true, length = -1)
    public String getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(String paquetes) {
        this.paquetes = paquetes;
    }

    @Basic
    @Column(name = "certificado", nullable = true)
    public Boolean getCertificado() {
        return certificado;
    }

    public void setCertificado(Boolean certificado) {
        this.certificado = certificado;
    }

    @Basic
    @Column(name = "nivel_conocimiento", nullable = true)
    public Integer getNivelConocimiento() {
        return nivelConocimiento;
    }

    public void setNivelConocimiento(Integer nivelConocimiento) {
        this.nivelConocimiento = nivelConocimiento;
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

        posConocimientosComputacionEntity that = (posConocimientosComputacionEntity) o;

        if (idConocimientos != that.idConocimientos) return false;
        if (paquetes != null ? !paquetes.equals(that.paquetes) : that.paquetes != null) return false;
        if (certificado != null ? !certificado.equals(that.certificado) : that.certificado != null) return false;
        if (nivelConocimiento != null ? !nivelConocimiento.equals(that.nivelConocimiento) : that.nivelConocimiento != null)
            return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idConocimientos ^ (idConocimientos >>> 32));
        result = 31 * result + (paquetes != null ? paquetes.hashCode() : 0);
        result = 31 * result + (certificado != null ? certificado.hashCode() : 0);
        result = 31 * result + (nivelConocimiento != null ? nivelConocimiento.hashCode() : 0);
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
