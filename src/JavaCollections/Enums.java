package JavaCollections;

enum DayOfwEEK {
MON,
TUE,
WED
,THU,
FRI,
SAT,
SUN
  }
  
 class Main {
    public static void main(String[] args) {
        DayOfwEEK myVar = DayOfwEEK.TUE;
  
      switch(myVar) {
        case MON:
          System.out.println("Monday");
          break;
        case TUE:
           System.out.println("Tuesday");
          break;
        case SUN:
          System.out.println("Sunday");
          break;
      }

    DayOfwEEK WOW=DayOfwEEK.FRI;
    System.out.println(WOW);

      //traverse
      for (DayOfwEEK x : DayOfwEEK.values()) {
        System.out.println(x);
      }
      
    }
  }
  