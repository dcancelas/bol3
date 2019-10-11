package bol3;

public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    //constructores
    public Consumo(float k,float l,float v,float p) {
        km=k;
        litros=l;
        vMed=v;
        pGas=p;
    }
    public Consumo() {

    }

    public float getTempo() {
        return (km/vMed);
    }
    public float consumoMedio() {
        return ((litros/km)*100f);
    }
    public float consumoEuros() {
        return (((litros/km)*100f)*pGas);
    }
    public void setKms(float k) {
        km=k;
    }
    public void setLitros(float l) {
        litros=l;
    }
    public void setvMed(float v) {
        vMed=v;
    }
    public void setPGas(float p) {
        pGas=p;
    }
    public void printTodo() {
        System.out.print("Km: "+km+"\nLitros: "+litros+"\nV.media: "+vMed+"\nP.gasolina: "+pGas+"\n");
    }
    public void printLitros() {
        System.out.println("Litros consumidos: "+litros);
    }
    public void printVMed() {
        System.out.println("Velocidad media: "+vMed);
    }
    public void saltoLinea() {
        System.out.println("");
    }

}