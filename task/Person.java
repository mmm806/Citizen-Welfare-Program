package task;

// 주석 1 : 클래스 상속 (기본 Person 클래스)
public class Person {
    protected String name;
    protected int age;
    protected double income;

    public Person(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    // 소득수준을 반환하는 메서드
    public IncomeLevel getIncomeLevel() {
        if (income < 20000) {
            return IncomeLevel.LOW;
        } else if (income < 50000) {
            return IncomeLevel.MIDDLE;
        } else {
            return IncomeLevel.HIGH;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Income: %.2f, Income Level: %s", name, age, income, getIncomeLevel());
    }
}

// 주석 5 : 참조 타입 (열거형 선언) - 소득 수준을 분류하는데 사용
enum IncomeLevel {
    LOW, MIDDLE, HIGH
}
