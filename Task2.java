import java.util.Scanner;

class Task2 {

    public static final int MINUTES_IN_HOUR = 60;
    
    public static final int SECONDS_IN_MINUTE = 60;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter courseName: ");
        String courseName = scanner.nextLine();
        
        System.out.println("Enter courseCost: ");
        double courseCost = scanner.nextDouble();
        
        System.out.println("Enter lessonsCount: ");
        double lessonsCount = scanner.nextDouble();
        
        System.out.println("Enter hoursInLesson: ");
        double hoursInLesson = scanner.nextDouble();

        double oneLesson = courseCost / lessonsCount;
        double oneHour = oneLesson / hoursInLesson;
        double oneMinute = oneHour / MINUTES_IN_HOUR;
        double oneSecond = oneMinute / SECONDS_IN_MINUTE;
        
        System.out.println("coursename: " + courseName);
        System.out.println("oneLesson: " + oneLesson);
        System.out.println("oneHour: " + oneHour);
        System.out.println("oneMinute: " + oneMinute);
        System.out.println("oneSecond: " + oneSecond);	
    }
}