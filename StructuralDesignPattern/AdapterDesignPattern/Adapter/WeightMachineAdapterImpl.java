package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.AdapterDesignPattern.Adapter;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.AdapterDesignPattern.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return weightMachine.calculateWeight() * 0.45;
    }
}
