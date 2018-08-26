
package stockmanager;

/**
 *
 * @author skand
 */
public class product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    
    public product(int pid,String pname,float pprice,String pAddDate,byte[] pimag){
        this.id=pid;
        this.name=pname;
        this.picture=pimag;
        this.price=pprice;
        this.addDate=pAddDate;
    }
    
    public int getId(){
      return id;
    }
    
    public String getName(){
      return name;
    }
    public float getPrice(){
      return price;
    }
    public String getDate(){
      return addDate;
    }
    public byte[] getImg(){
      return picture;
    }
    
}
