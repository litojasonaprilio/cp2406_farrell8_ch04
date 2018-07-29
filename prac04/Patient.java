public class Patient
{
    private int patientId;
    private int patientAge;
    private BloodData blood;

    public Patient()
    {
        patientId = 0;
        patientAge = 0;
        blood = new BloodData();
    }
    public Patient(int id, int age, String type, String factor)
    {
        patientId = id;
        patientAge = age;
        blood = new BloodData(type, factor);
    }
    public int getPatientId()
    {
        return patientId;
    }
    public int getPatientAge()
    {
        return patientAge;
    }
    public BloodData getBlood()
    {
        return blood;
    }
}
