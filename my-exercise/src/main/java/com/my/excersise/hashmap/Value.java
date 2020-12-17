package com.my.excersise.hashmap;

import java.util.Objects;

public class Value {
    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;

    public Value(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Double getRegulatedBonus() {
        return regulatedBonus;
    }

    public Double getChefBonus() {
        return chefBonus;
    }

    public Double getFunctionAddSalary() {
        return functionAddSalary;
    }

    @Override
    public String toString() {
        return "\n" + "Base Salary: " + baseSalary + "\n" + "Regulated Bonus: " + regulatedBonus + "\n" + "Chef Bonus: " + chefBonus + "\n" + "Function Add Salary: " + functionAddSalary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return baseSalary.equals(value.baseSalary) &&
                regulatedBonus.equals(value.regulatedBonus) &&
                chefBonus.equals(value.chefBonus) &&
                functionAddSalary.equals(value.functionAddSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSalary, regulatedBonus, chefBonus, functionAddSalary);
    }
}
