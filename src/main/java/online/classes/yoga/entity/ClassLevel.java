package online.classes.yoga.entity;

public enum ClassLevel {
	LEVEL1("Level 1 - Beginner Class"), 
	LEVEL2("Level 2 - Intermediate Class"), 
	LEVEL3("Level 3 - Advanced Class"), 
	ALL_LEVEL("All Level Class");
	
	
	private final String toString;

    private ClassLevel(String toString) {
         this.toString = toString;
    }
    public String toString(){
        return toString;
   }
}
