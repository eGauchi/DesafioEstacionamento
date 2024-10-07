package classe;

public class Ticket {
        int numero;
        double valor;
        boolean pago;

        Ticket(int numero) {
            this.numero = numero;
            this.valor = 5;
            this.pago = false;
        }

        int getNumero() {
            return numero;
        }

        double getValor() {
            return valor;
        }

        boolean isPago() {
            return pago;
        }

        void pagar() {
            this.pago = true;
        }

        public String obterTicket() {
            return "Ticket #" + numero + " - Valor: R$ " + valor + " - Pago: " + (pago ? "Sim" : "Não");
        }
}
