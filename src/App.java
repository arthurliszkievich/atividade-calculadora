import java.util.ArrayList;

public class App {


    private static Double valor_total = null;
    private static Double valor_recebido = null;
    private static Double troco = null;

    private static ArrayList<Double> moedas = new ArrayList<>();
    static
    {
    moedas.add(200.00);
    moedas.add(100.00);
    moedas.add(50.00);
    moedas.add(20.00);
    moedas.add(10.00);
    moedas.add(5.00);
    moedas.add(2.00);
    moedas.add(1.00);
    moedas.add(0.5);
    moedas.add(0.25);
    moedas.add(0.10);
    moedas.add(0.05);
    moedas.add(0.01);
}




    public static void main(String[] args) throws Exception {
        
        System.out.println("Digite o valor total pedido:");

        Double valor_total = Double.parseDouble(System.console().readLine());

        System.out.println("Digite o valor recebido pedido:");

        Double valor_recebido = Double.parseDouble(System.console().readLine());

        System.out.println("O valor total da compra é de:" + valor_total);

        System.out.println("O valor recebido foi de:" + valor_recebido);

        System.out.println("Efetuando o calculo do troco:");

        troco =  valor_total - valor_recebido;

        System.out.println("O troco foi de:" + troco);

        System.out.println();

        ArrayList<Double> moedas = App.moedas;

        while (troco != 0)
        {
            //Obter a primeira moeda disponível que no caso é 200 e terminar com 1 centavo
            Double moeda = moedas.getFirst();
            if(troco >= moeda)
            {
                //Se o troco for maior do que a moeda atual, vai entrar a moeda atual
                System.out.println("Entregar " + moeda);

                //Subtrair o valor do troco com a moeda
                troco -= moeda;
            }
            
            else
            {
                //Se o troco for menor do que a moeda atual, entregue o troco e retire a primeira moeda da lista
                moedas.removeFirst();
            }
        }

    }

}
