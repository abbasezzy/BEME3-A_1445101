public class AlarmClock extends Clock{

    private boolean alarmOn;
    private int hours, mins;
    public AlarmClock( ) {alarmOn = false;}  //the alarm is not set initially
    public void setAlarm(int hr, int min) 
    {
	hours = hr; mins = min; alarmOn = true;
   }
    public void tick( )
    {
	super.tick( );
	if ((viewhr()== hours)&&(viewmin() == mins)&&alarmOn)
	{
		System.out.println("ring ");
	}
    }
    public void resetAlarm( )  {alarmOn = false;}

}
