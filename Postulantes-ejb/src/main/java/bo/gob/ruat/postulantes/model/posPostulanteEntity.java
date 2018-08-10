package bo.gob.ruat.postulantes.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "postulante", schema = "public", catalog = "postulantes")
public class posPostulanteEntity {
    private long idPostulante;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private Timestamp fechaNac;
    private String nacionalidad;
    private String domicilioActual;
    private String ci;
    private String expedido;
    private Integer telefonoDomicilio;
    private Integer telefonoCelular;
    private String sexo;
    private BigDecimal pretensionSalarial;
    private BigDecimal ultimoSalarioMensual;
    private Timestamp fechaRegistro;
    private Long idUsuarioRegistro;
    private Timestamp fechaModificacion;
    private Long idUsuarioModificacion;
    private Collection<posCargoPostulacionEntity> cargoPostulacionsByIdPostulante;
    private Collection<posConocimientosComputacionEntity> conocimientosComputacionsByIdPostulante;
    private Collection<posCursosActualizacionEntity> cursosActualizacionsByIdPostulante;
    private Collection<posDetalleFormacionAcademicaEntity> detalleFormacionAcademicasByIdPostulante;
    private Collection<posExperienciaDocenciaEntity> experienciaDocenciasByIdPostulante;
    private Collection<posExperienciaLaboralEntity> experienciaLaboralsByIdPostulante;
    private Collection<posFormacionAcademicaEntity> formacionAcademicasByIdPostulante;
    private Collection<posIdiomasEntity> idiomasByIdPostulante;
    private posUsuarioEntity usuarioByIdUsuarioRegistro;
    private Collection<posReferenciasPersonalesEntity> referenciasPersonalesByIdPostulante;

    @Id
    @Column(name = "id_postulante", nullable = false)
    @SequenceGenerator(name="postulante_id_postulante_seq", sequenceName="postulante_id_postulante_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="postulante_id_postulante_seq")
    public long getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(long idPostulante) {
        this.idPostulante = idPostulante;
    }

    @Basic
    @Column(name = "apellido_paterno", nullable = true, length = 150)
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @Basic
    @Column(name = "apellido_materno", nullable = true, length = 150)
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Basic
    @Column(name = "nombres", nullable = false, length = 250)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "fecha_nac", nullable = false)
    public Timestamp getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Timestamp fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Basic
    @Column(name = "nacionalidad", nullable = false, length = 150)
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Basic
    @Column(name = "domicilio_actual", nullable = false, length = -1)
    public String getDomicilioActual() {
        return domicilioActual;
    }

    public void setDomicilioActual(String domicilioActual) {
        this.domicilioActual = domicilioActual;
    }

    @Basic
    @Column(name = "ci", nullable = false, length = 50)
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "expedido", nullable = true, length = 2)
    public String getExpedido() {
        return expedido;
    }

    public void setExpedido(String expedido) {
        this.expedido = expedido;
    }

    @Basic
    @Column(name = "telefono_domicilio", nullable = true)
    public Integer getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    public void setTelefonoDomicilio(Integer telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    @Basic
    @Column(name = "telefono_celular", nullable = true)
    public Integer getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(Integer telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    @Basic
    @Column(name = "sexo", nullable = true, length = 1)
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "pretension_salarial", nullable = true, precision = 2)
    public BigDecimal getPretensionSalarial() {
        return pretensionSalarial;
    }

    public void setPretensionSalarial(BigDecimal pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }

    @Basic
    @Column(name = "ultimo_salario_mensual", nullable = true, precision = 2)
    public BigDecimal getUltimoSalarioMensual() {
        return ultimoSalarioMensual;
    }

    public void setUltimoSalarioMensual(BigDecimal ultimoSalarioMensual) {
        this.ultimoSalarioMensual = ultimoSalarioMensual;
    }

    @Basic
    @Column(name = "fecha_registro", nullable = true)
    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Basic
    @Column(name = "id_usuario_registro", nullable = true, insertable = false, updatable = false)
    public Long getIdUsuarioRegistro() {
        return idUsuarioRegistro;
    }

    public void setIdUsuarioRegistro(Long idUsuarioRegistro) {
        this.idUsuarioRegistro = idUsuarioRegistro;
    }

    @Basic
    @Column(name = "fecha_modificacion", nullable = true)
    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Basic
    @Column(name = "id_usuario_modificacion", nullable = true)
    public Long getIdUsuarioModificacion() {
        return idUsuarioModificacion;
    }

    public void setIdUsuarioModificacion(Long idUsuarioModificacion) {
        this.idUsuarioModificacion = idUsuarioModificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        posPostulanteEntity that = (posPostulanteEntity) o;

        if (idPostulante != that.idPostulante) return false;
        if (apellidoPaterno != null ? !apellidoPaterno.equals(that.apellidoPaterno) : that.apellidoPaterno != null)
            return false;
        if (apellidoMaterno != null ? !apellidoMaterno.equals(that.apellidoMaterno) : that.apellidoMaterno != null)
            return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (fechaNac != null ? !fechaNac.equals(that.fechaNac) : that.fechaNac != null) return false;
        if (nacionalidad != null ? !nacionalidad.equals(that.nacionalidad) : that.nacionalidad != null) return false;
        if (domicilioActual != null ? !domicilioActual.equals(that.domicilioActual) : that.domicilioActual != null)
            return false;
        if (ci != null ? !ci.equals(that.ci) : that.ci != null) return false;
        if (expedido != null ? !expedido.equals(that.expedido) : that.expedido != null) return false;
        if (telefonoDomicilio != null ? !telefonoDomicilio.equals(that.telefonoDomicilio) : that.telefonoDomicilio != null)
            return false;
        if (telefonoCelular != null ? !telefonoCelular.equals(that.telefonoCelular) : that.telefonoCelular != null)
            return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (pretensionSalarial != null ? !pretensionSalarial.equals(that.pretensionSalarial) : that.pretensionSalarial != null)
            return false;
        if (ultimoSalarioMensual != null ? !ultimoSalarioMensual.equals(that.ultimoSalarioMensual) : that.ultimoSalarioMensual != null)
            return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (idUsuarioRegistro != null ? !idUsuarioRegistro.equals(that.idUsuarioRegistro) : that.idUsuarioRegistro != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(that.fechaModificacion) : that.fechaModificacion != null)
            return false;
        if (idUsuarioModificacion != null ? !idUsuarioModificacion.equals(that.idUsuarioModificacion) : that.idUsuarioModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idPostulante ^ (idPostulante >>> 32));
        result = 31 * result + (apellidoPaterno != null ? apellidoPaterno.hashCode() : 0);
        result = 31 * result + (apellidoMaterno != null ? apellidoMaterno.hashCode() : 0);
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (fechaNac != null ? fechaNac.hashCode() : 0);
        result = 31 * result + (nacionalidad != null ? nacionalidad.hashCode() : 0);
        result = 31 * result + (domicilioActual != null ? domicilioActual.hashCode() : 0);
        result = 31 * result + (ci != null ? ci.hashCode() : 0);
        result = 31 * result + (expedido != null ? expedido.hashCode() : 0);
        result = 31 * result + (telefonoDomicilio != null ? telefonoDomicilio.hashCode() : 0);
        result = 31 * result + (telefonoCelular != null ? telefonoCelular.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (pretensionSalarial != null ? pretensionSalarial.hashCode() : 0);
        result = 31 * result + (ultimoSalarioMensual != null ? ultimoSalarioMensual.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (idUsuarioRegistro != null ? idUsuarioRegistro.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (idUsuarioModificacion != null ? idUsuarioModificacion.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posCargoPostulacionEntity> getCargoPostulacionsByIdPostulante() {
        return cargoPostulacionsByIdPostulante;
    }

    public void setCargoPostulacionsByIdPostulante(Collection<posCargoPostulacionEntity> cargoPostulacionsByIdPostulante) {
        this.cargoPostulacionsByIdPostulante = cargoPostulacionsByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posConocimientosComputacionEntity> getConocimientosComputacionsByIdPostulante() {
        return conocimientosComputacionsByIdPostulante;
    }

    public void setConocimientosComputacionsByIdPostulante(Collection<posConocimientosComputacionEntity> conocimientosComputacionsByIdPostulante) {
        this.conocimientosComputacionsByIdPostulante = conocimientosComputacionsByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posCursosActualizacionEntity> getCursosActualizacionsByIdPostulante() {
        return cursosActualizacionsByIdPostulante;
    }

    public void setCursosActualizacionsByIdPostulante(Collection<posCursosActualizacionEntity> cursosActualizacionsByIdPostulante) {
        this.cursosActualizacionsByIdPostulante = cursosActualizacionsByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posDetalleFormacionAcademicaEntity> getDetalleFormacionAcademicasByIdPostulante() {
        return detalleFormacionAcademicasByIdPostulante;
    }

    public void setDetalleFormacionAcademicasByIdPostulante(Collection<posDetalleFormacionAcademicaEntity> detalleFormacionAcademicasByIdPostulante) {
        this.detalleFormacionAcademicasByIdPostulante = detalleFormacionAcademicasByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posExperienciaDocenciaEntity> getExperienciaDocenciasByIdPostulante() {
        return experienciaDocenciasByIdPostulante;
    }

    public void setExperienciaDocenciasByIdPostulante(Collection<posExperienciaDocenciaEntity> experienciaDocenciasByIdPostulante) {
        this.experienciaDocenciasByIdPostulante = experienciaDocenciasByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posExperienciaLaboralEntity> getExperienciaLaboralsByIdPostulante() {
        return experienciaLaboralsByIdPostulante;
    }

    public void setExperienciaLaboralsByIdPostulante(Collection<posExperienciaLaboralEntity> experienciaLaboralsByIdPostulante) {
        this.experienciaLaboralsByIdPostulante = experienciaLaboralsByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posFormacionAcademicaEntity> getFormacionAcademicasByIdPostulante() {
        return formacionAcademicasByIdPostulante;
    }

    public void setFormacionAcademicasByIdPostulante(Collection<posFormacionAcademicaEntity> formacionAcademicasByIdPostulante) {
        this.formacionAcademicasByIdPostulante = formacionAcademicasByIdPostulante;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posIdiomasEntity> getIdiomasByIdPostulante() {
        return idiomasByIdPostulante;
    }

    public void setIdiomasByIdPostulante(Collection<posIdiomasEntity> idiomasByIdPostulante) {
        this.idiomasByIdPostulante = idiomasByIdPostulante;
    }

    @ManyToOne
    @JoinColumn(name = "id_usuario_registro", referencedColumnName = "id_usuario")
    public posUsuarioEntity getUsuarioByIdUsuarioRegistro() {
        return usuarioByIdUsuarioRegistro;
    }

    public void setUsuarioByIdUsuarioRegistro(posUsuarioEntity usuarioByIdUsuarioRegistro) {
        this.usuarioByIdUsuarioRegistro = usuarioByIdUsuarioRegistro;
    }

    @OneToMany(mappedBy = "postulanteByIdPostulante")
    public Collection<posReferenciasPersonalesEntity> getReferenciasPersonalesByIdPostulante() {
        return referenciasPersonalesByIdPostulante;
    }

    public void setReferenciasPersonalesByIdPostulante(Collection<posReferenciasPersonalesEntity> referenciasPersonalesByIdPostulante) {
        this.referenciasPersonalesByIdPostulante = referenciasPersonalesByIdPostulante;
    }
}
