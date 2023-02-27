public class Planeta 
{
    /**
     * @param
     */
    String nom;
    int diametre;
    int pes;    

    /**
     * 
     * @param nom
     * @param diametre
     * @param pes
     */

    //Contructor amb tots els parametres    
    public Planeta(String nom, int diametre, int pes)
    {
        this.nom = nom;
        this.diametre = diametre;
        this.pes = pes;
    }

    /**
     * @param
     */
    //Constructor buit
    public Planeta(){}

    /**
     * 
     * @return
     */
    public int planetaEnano()
    {
        if(this.diametre < 1300)
        {
            return 1;
        }
        else
        {
            return 0;
        }        
    }

    /**
     * @param
     */
    public void expansio()
    {        
        this.diametre = (this.diametre * 3);
    }

    /**
     * 
     * @param meteorito
     * @return
     */
    public int colisio(int meteorito)
    {
        this.pes = meteorito - this.pes;
        this.diametre = (meteorito/2) + (this.pes);

        if(this.pes >= 1800){
        return -1;
        }

        else {
        return 0;
        }
    }

    //Getters i setters
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getDiametre()
    {
        return this.diametre;
    }

    public void setDiametre(int diametre)
    {
        this.diametre = diametre;
    }
    
    public int getPes()
    {
        return this.pes;
    }

    public void setPes(int pes)
    {
        this.pes = pes;
    }    
}
