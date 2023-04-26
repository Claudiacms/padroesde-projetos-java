package strategy;

public class Robo {
    package one.digitalinnovation.gof.strategy;

    public class Robo {

        private Comportamento comportamento;

        public void setComportamento(Comportamento comportamento) {
            this.comportamento = comportamento;
        }

        public void mover() {
            comportamento.mover();
        }
    }
}
