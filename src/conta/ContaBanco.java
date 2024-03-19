package conta;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipoConta;
    private String cliente;
    private float saldo;
    private boolean status;


    //Métodos Personalizados
    public void abrirConta(String tC) {
        this.setTipoConta(tC);
        this.setStatus(true); // Acessando o atributo pelo Metodo modificador
        //this.status = "true"; Acesso direto ao atributo
        if (tC.equals("CC")){
           this.setSaldo(50);
        } else if (tC.equals("CP")) {
            this.setSaldo(150);
        }
            System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(float saldo) {
        setSaldo(saldo);
        if (this.getSaldo() > 0) {
            System.out.println("Conta contém dinheiro!");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta contém débito!");
        } else {
        this.setStatus(false);
        }
        System.out.println("Conta fechada com sucesso!");
    }

    public void sacar(float v) {
        if (this.getSaldo() >= v) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de " + this.getCliente());
        } else {
            System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void depositar(float v){
        if (getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v); //Saldo atual + saldo novo
            System.out.println("Depósito realizado na conta de " + this.getCliente());
        } else {
            System.out.println("Impossível depositar!");
        }
    }

    public void pagarMensal(){
    }

    // Metodo construtor
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
