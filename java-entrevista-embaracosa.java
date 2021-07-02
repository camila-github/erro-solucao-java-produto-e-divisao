import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ProdutoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal numeroAtual, resultado = new BigDecimal("1.0");
        String operador;
        String[] entradaDados;
        int quantidadeCasos = Integer.parseInt(scanner.nextLine());
     
        for (int i = 0; i < quantidadeCasos; ++i) {
            entradaDados = scanner.nextLine().trim().split(" ");

            numeroAtual = new BigDecimal(entradaDados[0]);
            operador = entradaDados[1];

            if (operador.equals("*")) {
                resultado = resultado.multiply(numeroAtual);
            } else if (operador.equals("/")) {
                resultado = resultado.divide(numeroAtual, MathContext.DECIMAL128);
            }
        }
        System.out.println(resultado.setScale(0, RoundingMode.DOWN));
        scanner.close();
    }
}