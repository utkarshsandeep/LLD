package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.AdapterDesignPattern;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
