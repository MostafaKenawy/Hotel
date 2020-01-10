package hotel;
public class conference extends room {
    private int numofseats;
    private double seatprice;

    
    public int getNumofseats() {
        return numofseats;
    }
    public void setNumofseats(int numofseats) {
        this.numofseats = numofseats;
    }
    public double getSeatprice() {
        return seatprice;
    }
    public void setSeatprice(double seatprice) {
        this.seatprice = seatprice;
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
               return this.numofseats*this.seatprice*this.getDaysnum();     
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
              +"\n the number of seats is :"+this.getNumofseats()
              +"\n the seat price is :"+this.getSeatprice()+"\n";          
     }
}