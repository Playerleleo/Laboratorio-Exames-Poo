import javax.swing.*;
import java.time.LocalDate;

public class Triglicerideos extends Exames {
    private Integer triglicerideos;

    public Triglicerideos(String nome, String tipoSanguinio, Integer anoDeNacimento, Integer triglicerideos) {
        super(nome, tipoSanguinio, anoDeNacimento);
        this.triglicerideos = triglicerideos;
    }

    public Triglicerideos(Integer triglicerideos) {
        this.triglicerideos = triglicerideos;
    }

    public Triglicerideos() {
    }

    public Integer getTriglicerideos() {
        return triglicerideos;
    }

    public void setTriglicerideos(Integer triglicerideos) {
        this.triglicerideos = triglicerideos;
    }

    @Override
    public void cadastrarExames() {
        super.cadastrarExames();
        this.triglicerideos = Integer.valueOf(JOptionPane.showInputDialog("Quantidade triglicerideo: "));
    }

    public String classificarResultado() {
        Integer idade = pegandoIdade(getAnoDeNacimento());

        if (idade >= 0 && idade <= 9) {
            if (getTriglicerideos() < 75) {
                return "Triglicerideo - BOM";
            } else {
                return "Triglicerideo - RUIM";
            }
        } else if (idade >= 10 && idade <= 19) {
            if (getTriglicerideos() < 90) {
                return "Triglicerideo - BOM";
            } else {
                return "Triglicerideo - RUIM";
            }
        } else if (idade >= 20) {
            if (getTriglicerideos() < 150) {
                return "Triglicerideo - BOM";
            } else {
                return "Triglicerideo - RUIM";
            }
        }
        return "Não foi possível classificar";
    }

    @Override
    public void mostarResultados() {
        String mensagem = "Nome: " + this.getNome() + "\n";
        mensagem += "Tipo sanguinio: " + this.getTipoSanguinio() + "\n";
        mensagem += "Ano de nacimento: " + this.getAnoDeNacimento() + "\n";
        mensagem += "Resultado: " + this.triglicerideos + "\n";
        mensagem += "Classificação: " + this.classificarResultado() + "\n";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
