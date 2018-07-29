public class TestPatient
{
    public static void main(String[] args)
    {
        Patient patient1 = new Patient();
        displayPatient(patient1);
        Patient patient2 = new Patient(12345, 20, "A", "+");
        displayPatient(patient2);
    }
    public static void displayPatient(Patient patient)
    {
        BloodData bloodData = patient.getBlood();
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Patient Age: " + patient.getPatientAge());
        System.out.println("Patient Blood:" +
                "\nType: " + bloodData.getBloodType() +
                "\nRh factor: " + bloodData.getRhFactor());
    }
}
