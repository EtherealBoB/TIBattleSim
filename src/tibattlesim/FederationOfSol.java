
package tibattlesim;

/**
 *
 * @author BoB
 */
public class FederationOfSol extends Fleet{
    
    //constructor
    FederationOfSol(int dreadnoughts, int carriers, int cruisers, int destroyers,
                int fighters, int warSun, int groundForces, int pds, int spaceDocks)
    {
        super(dreadnoughts, carriers, cruisers, destroyers, fighters, warSun, 
                groundForces, pds, spaceDocks);
    }//end of constructor
    
    public int rollDice(){
      return super.spaceBattle(5, 9, 7, 9, 9, 3);
    }
    
    public int rollPDSDice(){
      return super.pdsFire(6);
    }
    
    public int rollantifighterBarrageDice()
    {
       return super.antifighterBarrage(9);
    }
}//end of FederationOfSol
