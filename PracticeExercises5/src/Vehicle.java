interface Vehicle { 
    public static final boolean CAN_MOVE = true;  

    void speedUp(int n);
    void slowDown(int n);
}  
  
class Car implements Vehicle { 
    int speed; 
    int gear; 
 
    public void speedUp(int n){ 
        this.speed += n; 
    } 

    public void slowDown(int n){ 
        this.speed -= n; 
    } 
      
    public void changeGear(int g) { 
         gear = g;
    } 
} 