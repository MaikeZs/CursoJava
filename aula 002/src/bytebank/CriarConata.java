package bytebank;

public class CriarConata {
    public static void main(String[] args) {
        Conta primeiraConta=new Conta();
        primeiraConta.saldo=200;
        System.out.println("Saldo da primeira conta "+ primeiraConta.saldo);

        Conta segundaConta=primeiraConta;
        segundaConta.saldo=50;
        segundaConta.depositar(500);
        System.out.println("Saldo da segunda conta "+segundaConta.saldo);

        segundaConta.sacar(250);
        System.out.println("saldo atual e de > "+segundaConta.saldo);

        Conta terceriaConnta=new Conta();
        terceriaConnta.depositar(3000);
        System.out.println(terceriaConnta.saldo);

        terceriaConnta.transfirir(700,segundaConta);
        System.out.println("saldo da terceriaConta"+terceriaConnta.saldo);

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
        System.out.println(terceriaConnta);


    }
}
