package bo.gob.ruat.postulantes.model;

import javax.persistence.*;

@Entity
@Table(name = "formacion_academica", schema = "public", catalog = "postulantes")
public class posFormacionAcademicaEntity {
    private long idFormacionAc;
    private String nivelAcademico;
    private String numRegistroProf;
    private String universidad;
    private String nomProgramaEstudios;
    private Long idPostulante;
    private posPostulanteEntity postulanteByIdPostulante;

    @Id
    @Column(name = "id_formacion_ac", nullable = false)
    @SequenceGenerator(name="formacion_academica_id_formacion_ac_seq", sequenceName="formacion_academica_id_formacion_ac_seq", allocationSize = 0, initialValue = 1000, schema = "public")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="formacion_academica_id_formacion_ac_seq")
    public long getIdFormacionAc() {
        return idFormacionAc;
    }

    public void setIdFormacionAc(long idFormacionAc) {
        this.idFormacionAc = idFormacionAc;
    }

    @Basic
    @Column(name = "nivel_academico", nullable = false, length = 150)
    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    @Basic
    @Column(name = "num_registro_prof", nullable = false, length = -1)
    public String getNumRegistroProf() {
        return numRegistroProf;
    }

    public void setNumRegistroProf(String numRegistroProf) {
        this.numRegistroProf = numRegistroProf;
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
    @Column(name = "nom_programa_estudios", nullable = true, length = -1)
    public String getNomProgramaEstudios() {
        return nomProgramaEstudios;
    }

    public void setNomProgramaEstudios(String nomProgramaEstudios) {
        this.nomProgramaEstudios = nomProgramaEstudios;
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

        posFormacionAcademicaEntity that = (posFormacionAcademicaEntity) o;

        if (idFormacionAc != that.idFormacionAc) return false;
        if (nivelAcademico != null ? !nivelAcademico.equals(that.nivelAcademico) : that.nivelAcademico != null)
            return false;
        if (numRegistroProf != null ? !numRegistroProf.equals(that.numRegistroProf) : that.numRegistroProf != null)
            return false;
        if (universidad != null ? !universidad.equals(that.universidad) : that.universidad != null) return false;
        if (nomProgramaEstudios != null ? !nomProgramaEstudios.equals(that.nomProgramaEstudios) : that.nomProgramaEstudios != null)
            return false;
        if (idPostulante != null ? !idPostulante.equals(that.idPostulante) : that.idPostulante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idFormacionAc ^ (idFormacionAc >>> 32));
        result = 31 * result + (nivelAcademico != null ? nivelAcademico.hashCode() : 0);
        result = 31 * result + (numRegistroProf != null ? numRegistroProf.hashCode() : 0);
        result = 31 * result + (universidad != null ? universidad.hashCode() : 0);
        result = 31 * result + (nomProgramaEstudios != null ? nomProgramaEstudios.hashCode() : 0);
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
