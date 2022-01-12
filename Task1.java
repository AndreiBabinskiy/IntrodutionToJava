class Task1 {
	
	public static final int MINUTES_IN_HOUR = 60;
    
    public static final int SECONDS_IN_MINUTE = 60;
    
	public static void main(String[] args) {
		double courseCost = 1000;
        double lessonsCount = 30;
        double hoursInLesson = 3;
		
		double oneLesson = courseCost / lessonsCount;
        double oneHour = oneLesson / hoursInLesson;
        double oneMinute = oneHour / MINUTES_IN_HOUR;
        double oneSecond = oneMinute / SECONDS_IN_MINUTE;
        
  		System.out.println("oneLesson: " + oneLesson);
        System.out.println("oneHour: " + oneHour);
        System.out.println("oneMinute: " + oneMinute);
        System.out.println("oneSecond: " + oneSecond);	
	}
}