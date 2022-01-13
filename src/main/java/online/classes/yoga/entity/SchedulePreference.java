package online.classes.yoga.entity;

public enum SchedulePreference {
	
	MORNING_SESSION1("Morning Session - 9:00AM to 11:00AM"),
	MORNING_SESSION2("Morning Session - 11:00AM to 1:00PM"),
	AFTERNOON_SESSION("Afternoon Session - 5:30PM to 7:30PM"),
	EVENING_SESSION("Evening Session - 7:30PM to 9:30PM");

	private final String toString;

    private SchedulePreference(String toString) {
         this.toString = toString;
    }
    public String toString(){
        return toString;
   }
	
}
