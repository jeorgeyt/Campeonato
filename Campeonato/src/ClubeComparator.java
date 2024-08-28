import java.util.Comparator;

public class ClubeComparator implements Comparator<Clube> {
    @Override
    public int compare (Clube clube1, Clube clube2){
        if (clube1.saldo > clube2.getsaldo()){
            return -1;
        }if (clube1.saldo < clube2.getsaldo()){
            return 1;
        }
        return 0;
    }

}
