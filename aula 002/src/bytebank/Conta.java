package bytebank;

public class Conta {
        String nome;
        int agencia;
        int numero;
        double saldo;

        public void depositar(double Valor){
                 this.saldo+=Valor;

        }
       public boolean sacar(double Valor){
              if(this.saldo>=Valor){
                      this.saldo=this.saldo-Valor;
                      return true;
              }else {
                      return false;
              }
        }
        public  boolean transfirir(double Valor, Conta destino){
                if(this.saldo>=Valor){
                        this.saldo-=Valor;
                        destino.depositar(Valor);
                        return true;
                }
                return false;
        }

}
