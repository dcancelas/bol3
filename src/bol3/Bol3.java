package bol3;

public class Bol3 {

    public static void main(String[] args) {
        Consumo consume=new Consumo();
            consume.setLitros(50f);
            consume.setPGas(1.57f);
            consume.saltoLinea();
            consume.printTodo();
        Consumo consumo=new Consumo(300f,60f,70f,1.63f);
            consumo.saltoLinea();
            System.out.println("Consumo medio: "+consumo.consumoMedio()+" litros cada 100 km");
            consumo.printLitros();
            consumo.printVMed();
    }

}