package Entidades;

public class Bebida extends Produto{
    private String tipo;

    public Bebida(int codigo, String nome, String tipo){
        super(codigo, nome)
        this.tipo;
        this.corte;
    }

    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        tipo = this.tipo;
    }

    public String getCorte(){
        return corte;
    }
    
    public void setCorte(String corte){
        corte = this.corte;
    }
}