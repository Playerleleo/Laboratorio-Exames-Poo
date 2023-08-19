public class Main {
    public static void main(String[] args) {
        var exameglicemia = new Glicemia();
        exameglicemia.cadastrarExames();
        exameglicemia.mostarResultados();

        var examecolesterol = new Colesterol();
    }
}