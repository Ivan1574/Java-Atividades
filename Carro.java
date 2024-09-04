public class Carro
{
    //Atributos
    String marca;
    String modelo;
    int ano;
    
    /*Metodos
    public void alteraModelo(String modelo){
        this.modelo = modelo;
    }*/
    
    public Carro(){}
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void imprimirCarro(){
        System.out.println("Marca :" + marca);
        System.out.println("Ano :" + ano);
        System.out.println("Modelo :" + modelo);
    }
    
    public void ligar(){
        System.out.println("Carro ligando!!!");
    }
    public void acelerar(){
        System.out.println("Carro acelerando!!!");
    }
    public void frear(){
        System.out.println("Carro freando!!!");
    }
}
