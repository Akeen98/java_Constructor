public class Constructor {
  int x;  

  
  public Constructor () {
    x = 5; 
    System.out.println("This is a constructor"); 
  }

  public static void main(String[] args) {
   Constructor  myObj = new Constructor (); 
    System.out.println(myObj.x); 
  }
}
