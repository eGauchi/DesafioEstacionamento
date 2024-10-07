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

        int obterNumero() {
            return numero;
        }

        double obterValor() {
            return valor;
        }

        boolean jaPago() {
            return pago;
        }

        void pagar() {
            this.pago = true;
        }

        public String obterTicket() {
            return "Ticket #" + numero + " - Valor: R$ " + valor + " - Pago: " + (pago ? "Sim" : "Não");
        }
}
