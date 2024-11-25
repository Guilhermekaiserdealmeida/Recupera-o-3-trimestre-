package Entidades;

public class Bebida extends Produto{
    private String tipo;

    public Bebida(int codigo, String nome, String tipo){
        super(codigo, nome)
        this.tipo;
        this.marca;
    }

    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        tipo = this.tipo;
    }

    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        marca = this.marca;
    }
}