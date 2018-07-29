import java.time.*;
public class FitnessTracker
{
    private String activity;
    private int minutesSpent;
    private LocalDate date;

    public FitnessTracker()
    {
        activity = "running";
        minutesSpent = 0;
        date = LocalDate.of(2018, 1, 1);
    }
    public FitnessTracker(String a, int m, LocalDate d)
    {
        activity = a;
        minutesSpent = m;
        date = d;
    }
    public String getActivity()
    {
        return activity;
    }
    public int getMinutesSpent()
    {
        return minutesSpent;
    }
    public LocalDate getDate()
    {
        return date;
    }
}
