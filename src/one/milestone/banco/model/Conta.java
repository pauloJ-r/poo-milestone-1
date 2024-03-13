package one.milestone.banco.model;

/*
 * Programação Orientada a Objetos
 * Milestone 1
 * Discente:
 * 
 */
public class Conta {
    private String numero;
    private float saldo;
    private String dataAbertura;
    private boolean status;

    /*
     *  Complete o construtor atribuindo os argumentos 
     *  aos respectivos atributos de instância
     */
    public Conta(String numero, float saldo, String dataAbertura, boolean status) {
        
    }

    /*
     * Método deve verificar se quantia eh igual ou inferior ao saldo
     * Caso seja, decremente o valor do saldo. Se a quantia for superior ao saldo,
     * declare o statement na condição de verificação: throw new IllegalArgumentException("Operação inválida");
     */
    public void sacar(float quantia) {
        
    }

    /*
     * Método deve verificar se quantia é maior que zero.
     * Caso seja, incremente a quantia ao saldo. Se for igual ou menor que zero,
     * declare o statement na condição de verificação: throw new IllegalArgumentException("Operação inválida");
     */
    public void depositar(float quantia) {
        
    }

    /*
     * Método deve verificar se quantia, na conta de origem, eh igual ou inferior ao saldo e se
     * a conta de destino está ativa. Se as verificações forem atendidas, decremente o valor do saldo na conta de origem
     * e incremente o valor na conta destino. Se a quantia for superior ao saldo,
     * ou a conta destino esteja desativada, declare o statement na condição de verificação: throw new IllegalArgumentException("Operação inválida");
     */
    public void transferir(Conta destino, float quantia) {
        
    }

    // Getters e Setters - Não alterar
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
