package hotel;
public class standard extends room {
    private int numofbeds;
    private double bedprice;

    
    public int getNumofbeds() {
        return numofbeds;
    }
    public void setNumofbeds(int numofbeds) {
        this.numofbeds = numofbeds;
    }

    public double getBedprice() {
        return bedprice;
    }
    public void setBedprice(double bedprice) {
        this.bedprice = bedprice;
    }
     public void reserve()
     {
         if(this.getisIsreserved())
             System.out.println("sorry the room is reserved");
         else {
             this.setIsreserved(true);
              System.out.println("Done"); 
         }   
     }
     public double totalprice()
     {
           {
               return this.bedprice*this.numofbeds*this.getDaysnum();
           }
     }
     public  void check()
     {
         if(this.getisIsreserved())
             System.out.println(" is reserved");
         else
             System.out.println(" is empty");
     }
     @Override
     public String toString()
     {
       return "the number of room is :"+super.getRoomnum()
              +"\nthe days number of reserved is :"+super.getDaysnum()
              +"\n the number of beds is :"+this.getNumofbeds()
              +"\n the bed price is :"+this.getBedprice()+"\n";          
     }
}