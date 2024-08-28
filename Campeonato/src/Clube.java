public class Clube implements Comparable<Clube> {
    public String nome;
    public int pontos;
    public int saldo;

    Clube(String nome, int pontos, int saldo){
        this.nome = nome;
        this.pontos = pontos;
        this.saldo = saldo;
    }

    public String toString(){
        return "\nNome: " + nome + "\tpontos: " + pontos + "\tsaldo de gols: " + saldo;

    }
    public int ganhar(int saldo){
        this.pontos = pontos + 3;
        this.saldo = this.saldo + saldo;
        return pontos;

    }
    public int empatar(){
        this.pontos = this.pontos + 1;
        return pontos;

    }
    public int perder (int saldo){
        this.pontos = this.pontos + 0;
        this.saldo = this.saldo + saldo;
        return pontos;
    }
    public String getnome(){
        return nome;
    }
    public int getpontos(){
        return pontos;
    }
    public int getsaldo(){
        return saldo;
    }
    public void setnome(String nome){
        this.nome = nome;
        
    }
    public void setpontos(int pontos){
        this.pontos = pontos;
        
    }
    public void setsaldo(int saldo){
        this.saldo = saldo;
        
    }
    @Override
    public int compareTo(Clube clube){
        if (this.pontos > clube.getpontos()){
            return -1;

        }if (this.pontos < clube.getpontos()){
            return 1;
        }
        return 0;
    }
}
