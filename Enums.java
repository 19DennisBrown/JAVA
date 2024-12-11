


enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
  public class Enums {
    public static void main(String[] args) {
      Level selectVal = Level.MEDIUM;

      switch(selectVal){

        case LOW:
          System.out.println("At LOW level");
          break;
        
          case MEDIUM:
            System.out.println("At MEDIUM level.");
            break;

          case HIGH:
            System.out.println("At HIGH level.");
            break;
      }
    }
  }



    
