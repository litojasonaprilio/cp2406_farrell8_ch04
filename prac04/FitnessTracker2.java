import java.time.*;
public class FitnessTracker2
{
    private String activity;
    private int minutesSpent;
    private LocalDate date;

    public FitnessTracker2(String a, int m, LocalDate d)
    {
        activity = a;
        minutesSpent = m;
        date = d;
    }

    public FitnessTracker2()
    {
        this("running", 0, LocalDate.of(2018, 1, 1));
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
