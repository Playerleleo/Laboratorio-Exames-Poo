import javax.swing.*;
import java.time.LocalDate;

public class Colesterol extends Exames{
    private Integer ldl;
    private Integer hdl;
    private String risco;

    public Colesterol(String nome, String tipoSanguinio, Integer anoDeNacimento, Integer ldl, Integer hdl, String risco) {
        super(nome, tipoSanguinio, anoDeNacimento);
        this.ldl = ldl;
        this.hdl = hdl;
        this.risco = risco;
    }
    public Colesterol(Integer ldl, Integer hdl, String risco) {
        this.ldl = ldl;
        this.hdl = hdl;
        this.risco = risco;
    }

    public Colesterol() {
    }

    public Integer getLdl() {
        return ldl;
    }

    public void setLdl(Integer ldl) {
        this.ldl = ldl;
    }

    public Integer getHdl() {
        return hdl;
    }

    public void setHdl(Integer hdl) {
        this.hdl = hdl;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    @Override
    public void cadastrarExames() {
        super.cadastrarExames();
        this.ldl = Integer.valueOf(JOptionPane.showInputDialog("Quantidade LDL: "));
        this.hdl = Integer.valueOf(JOptionPane.showInputDialog("Quantidade HDL: "));
        this.risco =(JOptionPane.showInputDialog("Risco (B - baixo, M - medio e A - alto) "));
    }

    public void classificarResultado() {
        cLassificacaoHdl();
        cLassificacaoldl();
    }

    public String cLassificacaoHdl(){
        Integer idade = pegandoIdade(getAnoDeNacimento());

        if (idade >= 0 && idade <= 19) {
            if (getHdl() > 45){
                return "HDL - BOM";
            } else{
                return "HDL - RUIM";
            }
        } else if (idade > 20) {
            if (getHdl() > 40){
                return "HDL - BOM";
            } else{
                return "HDL - RUIM";
            }
        }
        return "Não foi possível classificar";
    }

    public String cLassificacaoldl(){
        if(getRisco().equals("B") || getRisco().equals("b")){
            if (getLdl() < 100){
                return "LDL - BOM";
            } else{
                return "LDL - RUIM";
            }
        }

        if(getRisco().equals("M") || getRisco().equals("m")){
            if (getLdl() < 70){
                return "LDL - BOM";
            } else{
                return "LDL - RUIM";
            }
        }
        if(getRisco().equals("A") || getRisco().equals("a")){
            if (getLdl() < 50){
                return "LDL - BOM";
            } else{
                return "LDL - RUIM";
            }
        }
        return "Não foi possível classificar";

    }

    public Integer pegandoIdade(Integer ano) {
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - ano;
        return idade;
    }

    @Override
    public void mostarResultados() {
        String mensagem = "Nome: " + this.getNome() + "\n";
        mensagem += "Tipo sanguinio: " + this.getTipoSanguinio() + "\n";
        mensagem += "Ano de nacimento: " + this.getAnoDeNacimento() + "\n";
        mensagem += "Resultado LDL: " + this.ldl + "\n";
        mensagem += "Resultado HDL: " + this.hdl + "\n";
        mensagem += "Resultado risco: " + this.risco + "\n";
        mensagem += "Resultado classificação HDL: " + cLassificacaoHdl() + "\n";
        mensagem += "Resultado classificação LDL: " + cLassificacaoldl() + "\n";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
