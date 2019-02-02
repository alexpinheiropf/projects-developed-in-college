package aula08_oo;

import javax.swing.JOptionPane;

public class ContaCorrente {

    private static float s_SaldoTotal;
    private String _nome;
    private float _saldo;

    public ContaCorrente(){
        
    }
    
    public ContaCorrente(String nome) {
        this._nome = nome;
        this._saldo = 0;
    }

    public ContaCorrente(String nome, float saldo) {
        this._nome = nome;
        this._saldo = saldo;
        ContaCorrente.s_SaldoTotal += saldo;
    }

    public float sacar(float valor) {
        if (this._saldo >= valor) {
            this._saldo -= valor;
            ContaCorrente.s_SaldoTotal -= valor;

            JOptionPane.showMessageDialog(null, "Retire o Valor");
            return valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
            return 0;
        }
    }

    public void depositar(float valor) {
        this._saldo += valor;
        ContaCorrente.s_SaldoTotal += valor;
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Cliente " + this._nome + "\n Saldo: " + this._saldo
                + "\nTotal no Banco é: " + ContaCorrente.s_SaldoTotal);

    }
    
    public String[] teste (String[] vet ){
        for(int i = 0; i < vet.length;i++){
            vet[i] += " - " + i;
        }
        return vet;
                
    }
}
