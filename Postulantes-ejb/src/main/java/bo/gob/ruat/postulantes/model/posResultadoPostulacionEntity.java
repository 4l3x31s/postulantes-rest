package bo.gob.ruat.postulantes.model;

import javax.persistence.*;

@Entity
@Table(name = "resultado_postulacion", schema = "public", catalog = "postulantes")
public class posResultadoPostulacionEntity {
    private long idResultadoCargo;
    private Long idCargoPostulacion;
    private Boolean resultado;
    private Integer etapa;
    private String motivos;
    private posCargoPostulacionEntity cargoPostulacionByIdCargoPostulacion;

    @Id
    @Column(name = "id_resultado_cargo", nullable = false)
    @SequenceGenerator(name="resultado_postulacion_id_resultado_cargo_seq", sequenceName="resultado_postulacion_id_resultado_cargo_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="resultado_postulacion_id_resultado_cargo_seq")
    public long getIdResultadoCargo() {
        return idResultadoCargo;
    }

    public void setIdResultadoCargo(long idResultadoCargo) {
        this.idResultadoCargo = idResultadoCargo;
    }

    @Basic
    @Column(name = "id_cargo_postulacion", nullable = true, insertable = false, updatable = false)
    public Long getIdCargoPostulacion() {
        return idCargoPostulacion;
    }

    public void setIdCargoPostulacion(Long idCargoPostulacion) {
        this.idCargoPostulacion = idCargoPostulacion;
    }

    @Basic
    @Column(name = "resultado", nullable = true)
    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    @Basic
    @Column(name = "etapa", nullable = true)
    public Integer getEtapa() {
        return etapa;
    }

    public void setEtapa(Integer etapa) {
        this.etapa = etapa;
    }

    @Basic
    @Column(name = "motivos", nullable = true, length = -1)
    public String getMotivos() {
        return motivos;
    }

    public void setMotivos(String motivos) {
        this.motivos = motivos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        posResultadoPostulacionEntity that = (posResultadoPostulacionEntity) o;

        if (idResultadoCargo != that.idResultadoCargo) return false;
        if (idCargoPostulacion != null ? !idCargoPostulacion.equals(that.idCargoPostulacion) : that.idCargoPostulacion != null)
            return false;
        if (resultado != null ? !resultado.equals(that.resultado) : that.resultado != null) return false;
        if (etapa != null ? !etapa.equals(that.etapa) : that.etapa != null) return false;
        if (motivos != null ? !motivos.equals(that.motivos) : that.motivos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idResultadoCargo ^ (idResultadoCargo >>> 32));
        result = 31 * result + (idCargoPostulacion != null ? idCargoPostulacion.hashCode() : 0);
        result = 31 * result + (resultado != null ? resultado.hashCode() : 0);
        result = 31 * result + (etapa != null ? etapa.hashCode() : 0);
        result = 31 * result + (motivos != null ? motivos.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_cargo_postulacion", referencedColumnName = "id_cargo_postulacion")
    public posCargoPostulacionEntity getCargoPostulacionByIdCargoPostulacion() {
        return cargoPostulacionByIdCargoPostulacion;
    }

    public void setCargoPostulacionByIdCargoPostulacion(posCargoPostulacionEntity cargoPostulacionByIdCargoPostulacion) {
        this.cargoPostulacionByIdCargoPostulacion = cargoPostulacionByIdCargoPostulacion;
    }
}
