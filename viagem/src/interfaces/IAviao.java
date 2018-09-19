
package interfaces;

import classes.Passageiro;
import classes.Poltrona;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public interface IAviao {
    
    public String adicionarPassageiro(int lugar, Passageiro p);
    
    public ArrayList<Poltrona> listaPasageiros();
}
