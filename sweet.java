package hotel;
public class sweet extends room{
    private double pricepernight;

    
    public double getPricepernight() {
        return pricepernight;
    }
    public void setPricepernight(double pricepernight) {
        this.pricepernight = pricepernight;
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
               return this.pricepernight*this.getDaysnum();
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
              +"\n the price per night is :"+this.getPricepernight()+"\n";          
     }
}