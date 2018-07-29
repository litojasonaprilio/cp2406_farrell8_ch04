import java.time.*;
public class TestFitnessTracker2
{
    public static void main(String[] args)
    {
        FitnessTracker2 exercise1 = new FitnessTracker2();
        System.out.println(exercise1.getActivity() + " " + exercise1.getMinutesSpent() + " minutes on " + exercise1.getDate());

        LocalDate date = LocalDate.of(2018, 7, 24);
        FitnessTracker2 exercise2 = new FitnessTracker2("swimming", 30, date);
        System.out.println(exercise2.getActivity() + " " + exercise2.getMinutesSpent() + " minutes on " + exercise2.getDate());
    }
}
