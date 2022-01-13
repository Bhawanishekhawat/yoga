package online.classes.yoga.entity;

public enum SessionPackages {
	UNLIMITED_MONTHLY("$150.00 for eachmonth"),
	SESSIONS_10("$90.00 for eachmonth"),
	SESSIONS_6("$50.00 for eachmonth"),
	SESSIONS_3("$30.00 for eachmonth");

	private final String toString;

    private SessionPackages(String toString) {
         this.toString = toString;
    }
    public String toString(){
        return toString;
   }
}
