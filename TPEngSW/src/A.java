public class A{
    private int A1;
    private float A2;

    //Métodos set
    public void setA1(int A1){
        this.A1 = A1;
    }

    public void setA2(float A2){
        this.A2 = A2;
    }

    //Métodos get
    public int getA1(){
        return A1;
    }

    public float getA2(){
        return A2;
    }

    //Métodos M
    public void MA1(){
        System.out.println("Rodando metodo MA1");
    }

    public void MA2(){
        System.out.println("Rodando metodo MA2");
    }

    public void MA3(){
        System.out.println("Alteracao da classe A a partir do clone");
    }
}