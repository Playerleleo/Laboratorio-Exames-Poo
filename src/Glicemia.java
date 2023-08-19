import javax.swing.*;

public class Glicemia extends Exames {
    private Integer glicose;

    public Glicemia(String nome, String tipoSanguinio, Integer anoDeNacimento, Integer glicose) {
        super(nome, tipoSanguinio, anoDeNacimento);
        this.glicose = glicose;
    }

    public Glicemia(Integer glicose) {
        this.glicose = glicose;
    }

    public Glicemia() {
    }

    public Integer getGlicose() {
        return glicose;
    }

    public void setGlicose(Integer glicose) {
        this.glicose = glicose;
    }

    public String classificarResultado(Integer glicose) {
        if (glicose < 100) {
            return "Classificação: Normoglicemia";
        } else if (glicose >= 100 && glicose < 126) {
            return "Classificação: Pré-diabetes";
        } else if (glicose >= 126) {
            return "Classificação: Diabetes estabelecido";
        }
        return "Classificação: Não foi possível classificar";
    }

    @Override
    public void cadastrarExames() {
        super.cadastrarExames();
        this.glicose = Integer.valueOf(JOptionPane.showInputDialog("Quantidade Glicose: "));
    }

    @Override
    public void mostarResultados() {
        String mensagem = "Nome: " + this.getNome() + "\n";
        mensagem += "Tipo sanguinio: " + this.getTipoSanguinio() + "\n";
        mensagem += "Ano de nacimento: " + this.getAnoDeNacimento() + "\n";
        mensagem += "Resultado: " + this.glicose + "\n";
        mensagem += "Classificação: " + this.classificarResultado(this.glicose) + "\n";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
