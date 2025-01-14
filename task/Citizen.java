package task;

// 주석 1,2 : 클래스 상속, 인퍼페이스 구현 (Citizen 클래스)
public class Citizen extends Person implements WelfareEligibility {
    private boolean hasDisability;

    public Citizen(String name, int age, double income, boolean hasDisability) {
        super(name, age, income);
        this.hasDisability = hasDisability;
    }

    // 주석 4 : 다형성 (인터페이스 메서드 구현)
    @Override
    public boolean isEligibleForSupport() {
        return getIncomeLevel() == IncomeLevel.LOW || hasDisability;
    }

    // 주석 4 : 다형성 (toString 메서드 오버라이드)
    @Override
    public String toString() {
        return super.toString() + ", Disability: " + (hasDisability ? "Yes" : "No") + ", Eligible for Support: " + isEligibleForSupport();
    }
}
