package slide2;

public class FullTimeEmployee extends Employee {
    private double bonus;   // >= 0
    private double penalty; // >= 0

    public FullTimeEmployee(String id, String name, double basicSalary,
                            double bonus, double penalty) {
        super(id, name, basicSalary);
        setBonus(bonus);
        setPenalty(penalty);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus phải >= 0");
        }
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        if (penalty < 0) {
            throw new IllegalArgumentException("Penalty phải >= 0");
        }
        this.penalty = penalty;
    }

    @Override
    public double income() {
        return getBasicSalary() + bonus - penalty;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{id='" + getId() + "', name='" + getName() +
               "', basicSalary=" + getBasicSalary() +
               ", bonus=" + bonus +
               ", penalty=" + penalty + "}";
    }
}
