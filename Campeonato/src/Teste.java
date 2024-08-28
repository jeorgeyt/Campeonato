public class Teste {
    public static void main(String[] args) throws Exception {
    Clube clube1 = new Clube("corinthians",0,0);
    Clube clube2 = new Clube("Flamengo",0,0);
    Clube clube3 = new Clube("Fortaleza",0,0);
    Clube clube4 = new Clube("Fluminense",0,0);
    Clube clube5 = new Clube("Botafogo",0,0);
    Clube clube6 = new Clube("Criciuma",0,0);
    Clube clube7 = new Clube("Cuiaba",0,0);
    Clube clube8 = new Clube("Gremio",0,0);

    Campeonato campeonato = new Campeonato();
    campeonato.clubes.add(clube1);
    campeonato.clubes.add(clube2);
    campeonato.clubes.add(clube3);
    campeonato.clubes.add(clube4);
    campeonato.clubes.add(clube5);
    campeonato.clubes.add(clube6);
    campeonato.clubes.add(clube7);
    campeonato.clubes.add(clube8);

    System.out.println("Participantes: " + campeonato.clubes);
    System.out.println("Numero de participantes: " + campeonato.clubes.size());

    campeonato.jogarCampeonato();
    }
}
