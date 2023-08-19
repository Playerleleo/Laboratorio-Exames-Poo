import javax.swing.*;

public class Exames {
    private String nome;
    private String tipoSanguinio;
    private Integer anoDeNacimento;

    public Exames(String nome, String tipoSanguinio, Integer anoDeNacimento) {
        this.nome = nome;
        this.tipoSanguinio = tipoSanguinio;
        this.anoDeNacimento = anoDeNacimento;
    }

    public Exames() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguinio() {
        return tipoSanguinio;
    }

    public void setTipoSanguinio(String tipoSanguinio) {
        this.tipoSanguinio = tipoSanguinio;
    }

    public Integer getAnoDeNacimento() {
        return anoDeNacimento;
    }

    public void setAnoDeNacimento(Integer anoDeNacimento) {
        this.anoDeNacimento = anoDeNacimento;
    }

    public void cadastrarExames() {
        this.nome = JOptionPane.showInputDialog("Informe seu nome: ");
        this.tipoSanguinio = JOptionPane.showInputDialog("Informe seu tipo sanguinio: ");
        this.anoDeNacimento = Integer.valueOf(JOptionPane.showInputDialog("Informe seu ano de nacimento: "));
    }

    public void mostarResultados() {
        String mensagem = "Nome: " + this.nome + "\n";
        mensagem += "Tipo sanguinio: " + this.tipoSanguinio + "\n";
        mensagem += "Ano de nacimento: " + this.anoDeNacimento + "\n";
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }


