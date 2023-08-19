public class Main {
    public static void main(String[] args) {

        var exameColesterol = new Colesterol();
        exameColesterol.cadastrarExames();
        exameColesterol.mostarResultados();

        var exameglicemia = new Glicemia();
        exameglicemia.cadastrarExames();
        exameglicemia.mostarResultados();

        var examecolesterol = new Colesterol();
    }
}