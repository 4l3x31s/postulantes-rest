package bo.gob.ruat.postulantes.model;

import javax.persistence.*;

@Entity
@Table(name = "idiomas", schema = "public", catalog = "postulantes")
public class posIdiomasEntity {
    private long idIdiomas;
    private String idioma;
    private Integer lee;
    private Integer habla;
    private Integer escribe;
    private Boolean certificado;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_idiomas", nullable = false)
    @SequenceGenerator(name="idiomas_id_idiomas_seq", sequenceName="idiomas_id_idiomas_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idiomas_id_idiomas_seq")
    public long getIdIdiomas() {
        return idIdiomas;
    }

    public void setIdIdiomas(long idIdiomas) {
        this.idIdiomas = idIdiomas;
    }

    @Basic
    @Column(name = "idioma", nullable = true, length = -1)
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Basic
    @Column(name = "lee", nullable = true)
    public Integer getLee() {
        return lee;
    }

    public void setLee(Integer lee) {
        this.lee = lee;
    }

    @Basic
    @Column(name = "habla", nullable = true)
    public Integer getHabla() {
        return habla;
    }

    public void setHabla(Integer habla) {
        this.habla = habla;
    }

    @Basic
    @Column(name = "escribe", nullable = true)
    public Integer getEscribe() {
        return escribe;
    }

    public void setEscribe(Integer escribe) {
        this.escribe = escribe;
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

        posIdiomasEntity that = (posIdiomasEntity) o;

        if (idIdiomas != that.idIdiomas) return false;
        if (idioma != null ? !idioma.equals(that.idioma) : that.idioma != null) return false;
        if (lee != null ? !lee.equals(that.lee) : that.lee != null) return false;
        if (habla != null ? !habla.equals(that.habla) : that.habla != null) return false;
        if (escribe != null ? !escribe.equals(that.escribe) : that.escribe != null) return false;
        if (certificado != null ? !certificado.equals(that.certificado) : that.certificado != null) return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idIdiomas ^ (idIdiomas >>> 32));
        result = 31 * result + (idioma != null ? idioma.hashCode() : 0);
        result = 31 * result + (lee != null ? lee.hashCode() : 0);
        result = 31 * result + (habla != null ? habla.hashCode() : 0);
        result = 31 * result + (escribe != null ? escribe.hashCode() : 0);
        result = 31 * result + (certificado != null ? certificado.hashCode() : 0);
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
