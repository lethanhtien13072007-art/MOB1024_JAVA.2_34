package slide2;

public class PartTimeEmployee extends Employee {
    private double workingHours; // >= 0
    private double hourlyRate;   // >= 0

    public PartTimeEmployee(String id, String name,
                            double workingHours, double hourlyRate) {
        super(id, name, 0); 
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            throw new IllegalArgumentException("WorkingHours phải >= 0");
        }
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("HourlyRate phải >= 0");
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{id='" + getId() + "', name='" + getName() +
               "', workingHours=" + workingHours +
               ", hourlyRate=" + hourlyRate + "}";
    }
}
	


