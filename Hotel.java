package hotel;
import java.io.*;
import java.util.Scanner;
public class Hotel {
   static floor F[];
    public static void list(floor F[],int x)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("0-exit.");
        System.out.println("1-view the status of the hotal.");
         System.out.println("2-reserve room.");
          System.out.println("3-cancel reservation.");
           System.out.println("4-check out.");
            System.out.println("5-display available rooms in a floor.");
             System.out.println("6-display the total profit.");
           System.out.println("Enter the number of operation :");     
               int j=input.nextInt();
        switch(j)
        { 
     case 0:return;
     case 1:recepthionist();list(F,x);break;
     case 2:System.out.println("Enter the floor number :");
            int i=input.nextInt();
            if(x<i){
  System.out.println("Enter the correct number");list(F,x);break;}
                System.out.println("Enter the room number :");
            int q=input.nextInt();
            System.out.println("Enter the days of reservation :");
            int a=input.nextInt();
            F[i-1].reserve(q,a);list(F,x);break;
     case 3:System.out.println("Enter the floor number :");
            int w=input.nextInt();
            if(x<w){
  System.out.println("Enter the correct number");list(F,x);break;}
                System.out.println("Enter the room number :");
            int e=input.nextInt();
            F[w-1].cancel(e);list(F,x);
     case 4:System.out.println("Enter the floor number :");
            int u=input.nextInt();
            if(x<u){
  System.out.println("Enter the correct number");list(F,x);break;}
                System.out.println("Enter the room number :");
            int y=input.nextInt();
            F[u-1].checkout(y);list(F,x);break;
     case 5:System.out.println("Enter the floor number :");
            int c=input.nextInt();
            F[c-1].check();
     case 6: System.out.println("the total profit of the hotal is :"+floor.total);
     list(F,x);break;
                    }
    }
    public static void recepthionist()
    {
         File file=new File("C:\\Users\\LapTop MarKet\\Desktop\\ahmed.txt");
       
         try{
         Scanner input=new Scanner(file);
         while(input.hasNext())
         {
             String y=input.nextLine();
             System.out.println(y);
         }
        }catch(FileNotFoundException e)
        {
        }
    }
    public static void main(String[] args) {
       File file=new File("C:\\Users\\LapTop MarKet\\Desktop\\ahmed.txt");
   Scanner sc=new Scanner(System.in);
   int x;
    try{
    Scanner input=new Scanner(file);
     String s=input.next();
      if(s.equals("#floors:"))
      {
           x=input.nextInt();
            F=new floor[x];
     while(input.hasNext())
    {
        for (int i = 0; i < x; i++) {
            F[i]=new floor(x);
            String a=input.next();
        String b=a.charAt(6)+"";
        int y=Integer.parseInt(b);
        F[i].setfloornum(y);
        String c=input.next();
        if(c.equals("#Rooms:"))
        {
            int z=input.nextInt();
            F[i].setnumofrooms(z);
              input.nextLine();
            for (int j = 0; j < z; j++)
            {
                String d=input.nextLine();
                String e[]=d.split(",");
                int m=Integer.parseInt(e[1].trim());
                switch (e[0].trim()) {
                    case "Standard":
                    {
                            F[i].rooms[j]=new standard();
                            F[i].rooms[j].setRoomnum(m);
                            int n=Integer.parseInt(e[2].trim());
                             ((standard)F[i].rooms[j]).setNumofbeds(n);
                            double o=Double.parseDouble(e[3].trim());
                            ((standard)F[i].rooms[j]).setBedprice(o);
                            break;
                        }
                    case "Conference":
                        {
                           F[i].rooms[j]=new conference();
                            F[i].rooms[j].setRoomnum(m);
                            int n=Integer.parseInt(e[2].trim());
                            ((conference)F[i].rooms[j]).setNumofseats(n);
                            double o=Double.parseDouble(e[3].trim());
                            ((conference)F[i].rooms[j]).setSeatprice(o);
                            break;
                        }
                    case "Sweet":
                        {
                            F[i].rooms[j]=new sweet();
                            F[i].rooms[j].setRoomnum(m);
                            double o=Double.parseDouble(e[2].trim());
                            ((sweet)F[i].rooms[j]).setPricepernight(o);
                            break;
                        }
                    default:System.out.println("please the correct type of room");
                        break;
                }            
            }
        }
        }  
    }
     list(F,x);
      }
    }catch(Exception e){
    }
    }
}