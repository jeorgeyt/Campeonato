import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Campeonato {
    public ArrayList<Clube> clubes = new ArrayList<Clube>();
    Random random = new Random();

    public void jogarCampeonato(){
        int t = 0;
        int qtdjogos = 0;
        System.out.println("\n----------- Jogos ----------");
        while ( t < clubes.size()){
            for (int i = 0; i <clubes.size();i++){
                if (t != i){
                    System.out.println((qtdjogos+1) + " Rodada: " + clubes.get(t).nome + " x " + clubes.get(i).nome);
                    jogar(clubes.get(t), clubes.get(i));
                    qtdjogos++;
                }
            }
            t++;
        }
        gettabela();
        getcampeao();
    }
    private void jogar(Clube x, Clube y){
        int qtdGolsClubex = random.nextInt(6);
        int qtdGolsClubey = random.nextInt(6);
        int saldox = qtdGolsClubex - qtdGolsClubey;
        int saldoy = qtdGolsClubey - qtdGolsClubex;


        if(qtdGolsClubex > qtdGolsClubey){
            x.ganhar(saldox);
            y.perder(saldoy);
            System.out.println("vencedor: " + x.getnome());
            System.out.println(x.nome + " Marcou " + qtdGolsClubex + " gols");
            System.out.println(y.nome + " Marcou " + qtdGolsClubey + " gols\n");
    
        }else if (qtdGolsClubex == qtdGolsClubey){
            x.empatar();
            y.empatar();
            System.out.println("Emapate");
            System.out.println(x.nome + " Marcou " + qtdGolsClubex + " gols");
            System.out.println(y.nome + " Marcou " + qtdGolsClubey + " gols\n");
        }else {
            y.ganhar(saldoy);
            x.perder(saldox);
            System.out.println("Vencedor: "+ y.getnome());
            System.out.println(x.nome + " Marcou " + qtdGolsClubex + " gols");
            System.out.println(y.nome + " Marcou " + qtdGolsClubey + " gols\n");
        }

    }
    public ArrayList<Clube> gettabela(){
        Collections.sort(clubes, new ClubeComparator());
        Collections.sort(clubes);
        return clubes;

    }
    public void getcampeao(){
        ArrayList<Clube> vencedor = gettabela();
        System.out.println("\nTabela final: " + gettabela());
        System.out.println("\n Vencedor ");
        System.out.println(vencedor.get(0).nome);
        System.out.println("pontos : " + vencedor.get(0).pontos);
        System.out.println("Saldo de gols: " + vencedor.get(0).saldo);
    }
    public ArrayList<Clube> getclubes() {
        
        return this.clubes;
    }
    public void setclubes(ArrayList<Clube> clubes){
        this.clubes = clubes;
    }
}
