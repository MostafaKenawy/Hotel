package hotel;
public abstract class room {
    private int roomnum;
    private int daysnum;
    private boolean isreserved;
   
    
    public int getRoomnum() {
        return roomnum;
    }
    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }
    public int getDaysnum() {
        return daysnum;
    }
    public void setDaysnum(int daysnum) {
        this.daysnum = daysnum;
    }
    public boolean getisIsreserved() {
        return isreserved;
    }
    public void setIsreserved(boolean isreserved) {
        this.isreserved = isreserved;
    }
   
    public abstract void reserve();
    public abstract double totalprice();
    public abstract void check();
}