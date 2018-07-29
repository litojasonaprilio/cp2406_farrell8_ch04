import java.time.*;
public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker exercise1 = new FitnessTracker();
        System.out.println(exercise1.getActivity() + " " + exercise1.getMinutesSpent() + " minutes on " + exercise1.getDate());

        LocalDate date = LocalDate.of(2018, 7, 24);
        FitnessTracker exercise2 = new FitnessTracker("swimming", 30, date);
        System.out.println(exercise2.getActivity() + " " + exercise2.getMinutesSpent() + " minutes on " + exercise2.getDate());
    }
}
