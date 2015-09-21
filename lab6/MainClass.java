public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Clock obj1 = new Clock();
		for(int i=0;i<=10000; i++)
		{
			obj1.ShowTime();
			obj1.tick();
		
		}*/
		
		AlarmClock obj2 = new AlarmClock();
		for(int i=0;i<=3600; i++)
		{
			obj2.setAlarm(0, 20);
			obj2.ShowTime();
			obj2.tick();
		
		}

	}

}
