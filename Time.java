public class Time
  public static void main(Static[] args){
  int hour=17;
    int minute=15;
    int second=30;
    int Min_Midnight= (hour*60)+ minute;//to calculate hours since midnight to minutes
    int Sec_Midnight= (Min_Midnight*60)+second;//to calculate minutes since midnight to seconds
    System.out.println(Sec_Midnight+" Seconds since midnight");
    int Sec_left= 86400-Sec_Midnight;//to calculate how many seconds left since theres 86400 sec a day
  System.out.println( Sec_left+" seconds left in the day");
    int percent=17.25/24 // to calculate the percent that has passed 17.25 hours divided by 24
      System.out.println( percent+"% of the day has passed");
  }
}
