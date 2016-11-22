package Model;

import Dao.ClienteDao;
import java.sql.Date;

/**
 *
 * @author brucce
 */
public class PessoaFisica extends Cliente{

    private String rg;
    private String cpf;
    private Date dataNascimento;
    private String estadoCivil;

    public PessoaFisica() {
    }

    public int inserir() {
        ClienteDao dao = new ClienteDao();
        return dao.inserir(this);
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
