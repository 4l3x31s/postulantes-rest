package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "experiencia_laboral", schema = "public", catalog = "postulantes")
public class posExperienciaLaboralEntity {
    private long idExpLaboral;
    private Timestamp desde;
    private Timestamp hasta;
    private String empresa;
    private String cargoEntrada;
    private String cargoSalida;
    private String funciones;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_exp_laboral", nullable = false)
    @SequenceGenerator(name="experiencia_laboral_id_exp_laboral_seq", sequenceName="experiencia_laboral_id_exp_laboral_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="experiencia_laboral_id_exp_laboral_seq")
    public long getIdExpLaboral() {
        return idExpLaboral;
    }

    public void setIdExpLaboral(long idExpLaboral) {
        this.idExpLaboral = idExpLaboral;
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
    @Column(name = "empresa", nullable = true, length = -1)
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Basic
    @Column(name = "cargo_entrada", nullable = true, length = -1)
    public String getCargoEntrada() {
        return cargoEntrada;
    }

    public void setCargoEntrada(String cargoEntrada) {
        this.cargoEntrada = cargoEntrada;
    }

    @Basic
    @Column(name = "cargo_salida", nullable = true, length = -1)
    public String getCargoSalida() {
        return cargoSalida;
    }

    public void setCargoSalida(String cargoSalida) {
        this.cargoSalida = cargoSalida;
    }

    @Basic
    @Column(name = "funciones", nullable = true, length = -1)
    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
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

        posExperienciaLaboralEntity that = (posExperienciaLaboralEntity) o;

        if (idExpLaboral != that.idExpLaboral) return false;
        if (desde != null ? !desde.equals(that.desde) : that.desde != null) return false;
        if (hasta != null ? !hasta.equals(that.hasta) : that.hasta != null) return false;
        if (empresa != null ? !empresa.equals(that.empresa) : that.empresa != null) return false;
        if (cargoEntrada != null ? !cargoEntrada.equals(that.cargoEntrada) : that.cargoEntrada != null) return false;
        if (cargoSalida != null ? !cargoSalida.equals(that.cargoSalida) : that.cargoSalida != null) return false;
        if (funciones != null ? !funciones.equals(that.funciones) : that.funciones != null) return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idExpLaboral ^ (idExpLaboral >>> 32));
        result = 31 * result + (desde != null ? desde.hashCode() : 0);
        result = 31 * result + (hasta != null ? hasta.hashCode() : 0);
        result = 31 * result + (empresa != null ? empresa.hashCode() : 0);
        result = 31 * result + (cargoEntrada != null ? cargoEntrada.hashCode() : 0);
        result = 31 * result + (cargoSalida != null ? cargoSalida.hashCode() : 0);
        result = 31 * result + (funciones != null ? funciones.hashCode() : 0);
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
