public class Instrument {
 String type;  
 double price;  

   //Constructor Parameter
   public Instrument(String type, double price) {  
    this.type = type;  
    this.price = price;  
   }

   //Contructor Default
   public Instrument() {
    type = "kosong";
    price = 0;
   }

    //Setter
   public void setType(String type) {  
    this.type = type;  
    }  
 
    public void setPrice(double price) {  
        this.price = price;  
     }  

     //Method
     public void print() {  
        System.out.println("Type: " + type);  
        System.out.println("Price: " + price);  
     }  
}
