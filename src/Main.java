public class Main {
    public static void main(String[] args) {

        var exameglicemia = new Glicemia();
        exameglicemia.cadastrarExames();
        exameglicemia.mostarResultados();

        var exameColesterol = new Colesterol();
        exameColesterol.cadastrarExames();
        exameColesterol.mostarResultados();

        var exameTriglicerideos = new Triglicerideos();
        exameTriglicerideos.cadastrarExames();
        exameTriglicerideos.mostarResultados();
    }
}