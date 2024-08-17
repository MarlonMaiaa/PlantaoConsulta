import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DadosEntrada {

    String datainf;
    boolean statusAtual;  // Status para o dia atual

    public LocalDate dataInicio() {
        Scanner tc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Pergunta se está de plantão hoje
        System.out.println("Está de plantão hoje? 'sim' ou 'não'");
        String resp = tc.next().toLowerCase();
        statusAtual = resp.equals("sim") || resp.equals("s");

        LocalDate d1 = LocalDate.now();
        System.out.println("Hoje: " + d1);
        System.out.println("Status: " + (statusAtual ? "Trabalhando" : "De folga"));

        // Pergunta pela data que deseja consultar
        System.out.println("Informe a data que deseja consultar (formato yyyy-MM-dd):");
        datainf = tc.next();
        LocalDate dataConsulta = LocalDate.parse(datainf, formatter);

        // Verifica o status para todos os dias até a data consultada
        LocalDate dataAtual = d1;
        while (!dataAtual.isAfter(dataConsulta)) {
            String statusDia = (dataAtual.equals(d1) || statusAtual) ? "Trabalhando" : "De folga";
            System.out.println(dataAtual + " - " + statusDia);

            // Alterna o status a cada dia
            statusAtual = !statusAtual;

            dataAtual = dataAtual.plusDays(1); // Avança um dia
        }

        tc.close(); // Fecha o scanner
        return dataConsulta;
    }

    public static void main(String[] args) {
        DadosEntrada dados = new DadosEntrada();
        dados.dataInicio();
    }
}
