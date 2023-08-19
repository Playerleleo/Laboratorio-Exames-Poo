public class Main {
    public static void main(String[] args) {
        var exameglicemia = new Glicemia();
        exameglicemia.cadastrarExames();
        exameglicemia.mostarResultados();

        var exame = new Exames();
        exame.cadastrarExames();
        exame.mostarResultados();
    }
}