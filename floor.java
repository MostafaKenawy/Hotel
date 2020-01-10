package hotel;
public class floor {
    private int floornum;
    private int numofrooms;
    public room rooms[];
    static double total;
    double floorprofit;
floor(int x)
{
    rooms=new room[x];
}
    public void reserve(int q,int a)
    {
        for (int i = 0; i < numofrooms; i++) {
           if(rooms[i].getRoomnum()==q)
           {
               rooms[i].reserve();
               rooms[i].setDaysnum(a);
               total+=rooms[i].totalprice(); 
               break;
           }else if(i==numofrooms-1)
           {
               System.out.println("please enter the correct number");
           }
        }
    }
    public void floorprofit()
    {
        for (int i = 0; i < numofrooms; i++) {
            floorprofit+=rooms[i].totalprice();
        }
    }
       public void cancel(int e)
    {
        for (int i = 0; i < numofrooms; i++) {
           if(rooms[i].getRoomnum()==e)
           {
               if(rooms[i].getisIsreserved())
               { 
               total-=rooms[i].totalprice();
                System.out.println("Done"); 
                   rooms[i].setIsreserved(false);break;}
               else
                      System.out.println("please check from your room number");break;  
           }else if(i==numofrooms-1)
           {
               System.out.println("please enter the correct number");
           }
        }  
    }
       public void checkout(int y)
       {
           for (int i = 0; i < numofrooms; i++) {
           if(rooms[i].getRoomnum()==y)
           {
              System.out.println("the price of your stay is :"+rooms[i].totalprice());
              rooms[i].setIsreserved(false);
           }else if(i==numofrooms-1)
           {
               System.out.println("please enter the correct number");
           } 
          }
       }
       public void check()
       {
           for (int i = 0; i < numofrooms; i++) {
          System.out.print("the room number "+rooms[i].getRoomnum());
          rooms[i].check();
          }
       }
    public void setfloornum(int num)
    {
        this.floornum=num;
    }
    public int getfloornum()
    {
        return this.floornum;
    }
    public void setnumofrooms(int numofrooms)
    {
        this.numofrooms=numofrooms;
    }
    public int getnumofrooms()
    {
        return this.numofrooms;
    }
}