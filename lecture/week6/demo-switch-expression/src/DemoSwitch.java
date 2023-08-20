public class DemoSwitch {
    // static final (constant) (0-2)
    // instance variable (1X)
    // static variable (1-2)
    // contructors
    // public instance method // main logic
    // static method // tools
    // private methods
    public static void main(String[] args) throws Exception {
        System.out.println(grade(90));

        WeekDay weekDay = WeekDay.TUE;
        // Approach 1
        int result = switch (weekDay) { // enum
            case MON, TUE -> 1;
            // case TUE -> 2;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
            // default -> 0; // enum no need to add default
        };
        // Approach 2
        int result2 = switch (weekDay) { // enum
            case MON:
                System.out.println("Mondy");
                yield 1; // yield means "return" + break 
            case TUE:
                System.out.println("Tuesday");
                yield 2;
            case WED:
                System.out.println("Wednesday");
                yield 3;
            case THU:
                System.out.println("Thursday");
                yield 4;
            case FRI:
                System.out.println("Friday");
                yield 5;
        };
    }

    public static int getDayNumber(WeekDay weekDay) {
        switch (weekDay) { // enum
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THU:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;
        }
    }

    public static char grade(int score) {
        char grade = ' ';
        switch (score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }
}
