package br.com.alura.screenmatch.desafios.cpf;

public class ValidadorCPF {
    private String cpf;

    public ValidadorCPF(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.cpf;
    }

    public boolean validarCPF(){
        //52600270272
        if(cpf.length() == 11){
            return true;
        }else{
            throw new CPFInvalidoException("CPF inválido.Favor verificar dados digitados!");
        }
    }
}
