import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<CadastrarGasto> listaGastos = new ArrayList<>();
        List<CadastrarGanho> listaGanhos = new ArrayList<>();
        int opcaoMenu = 0;

        // Inicio do codigo
        do {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" --- MENU DE CONSULTA - GESTÃO FINANCEIRA ---\n");
            stringBuilder.append("1 - Cadastrar gasto\n");
            stringBuilder.append("2 - Cadastrar ganho\n");
            stringBuilder.append("3 - Mostrar gastos\n");
            stringBuilder.append("4 - Mostrar ganhos\n");
            stringBuilder.append("5 - Relatorio mensal\n");
            stringBuilder.append("6 - Sair\n");
            System.out.println(stringBuilder.toString());
            Scanner in = new Scanner(System.in);
            opcaoMenu = in.nextInt();

            if (opcaoMenu == 1) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(" --- TIPOS DE GASTOS ---\n");
                stringBuilder1.append("1 - Alimentação\n");
                stringBuilder1.append("2 - Transporte\n");
                stringBuilder1.append("3 - Lazer\n");
                stringBuilder1.append("4 - Saúde\n");
                stringBuilder1.append("5 - Educação\n");
                stringBuilder1.append("6 - Cartão\n");
                stringBuilder1.append("7 - Internet\n");
                stringBuilder1.append("8 - Casa\n");
                stringBuilder1.append("9 - Outros\n");
                System.out.println(stringBuilder1.toString());
                String tipoGasto = in.next();

                System.out.println("Informe a data do gasto no padrão(ex: 19/02/2023) : ");
                String dataGasto = in.next();

                System.out.println("Informe o valor do gasto: ");
                double valorGasto = in.nextDouble();

                System.out.println("Informe a forma de pagamento: ");
                String formaPagamento = in.next();

                System.out.println("Informe um nome para o gasto do gasto: ");
                String nomeGasto = in.next();



                CadastrarGasto gasto = new CadastrarGasto(nomeGasto, valorGasto, tipoGasto, formaPagamento, dataGasto);
                listaGastos.add(gasto);
                System.out.println(gasto.toString());
            } else if (opcaoMenu == 2) {
                System.out.println("Informe o nome do seu ganho: ");
                String nomeGanho = in.next();
                System.out.println("Informe a data do ganho no padrão(ex: 19/02/2023) : ");
                String dataGanho = in.next();
                System.out.println("Informe o valor do ganho: ");
                double valorGanho = in.nextDouble();

                CadastrarGanho ganho = new CadastrarGanho(valorGanho, nomeGanho, dataGanho);
                listaGanhos.add(ganho);
                System.out.println(ganho.toString());

            } else if (opcaoMenu == 3) {
                StringBuilder stringBuilder2 = new StringBuilder();
                for (CadastrarGasto gasto : listaGastos) {
                    stringBuilder2.append(gasto.toString());
                }
                System.out.println(stringBuilder2.toString());

            } else if (opcaoMenu == 4) {
                StringBuilder stringBuilder3 = new StringBuilder();
                for (CadastrarGanho ganho : listaGanhos) {
                    stringBuilder3.append(ganho.toString());
                }
                System.out.println(stringBuilder3.toString());
            } else if (opcaoMenu == 5) {
                double getTotalGastos = 0;
                double getTotalGanhos = 0;
                double saldo = 0;

                System.out.println("Informe o mês: ");
                int mes = in.nextInt();
                System.out.println("Informe o ano: ");
                int ano = in.nextInt();
                FiltraData filtro = new FiltraData();
                for (CadastrarGasto gasto : listaGastos) {
                    try {
                        String dataGasto = gasto.getDataDoGasto();
                        String dataQueVaiSerFiltrada = filtro.filtraData(dataGasto, mes, ano);

                        if (!dataQueVaiSerFiltrada.equals("")) {
                            getTotalGastos += gasto.getValor();
                        }

                        for (CadastrarGanho ganho : listaGanhos) {
                            String dataGanho = ganho.getDataGanho();
                            String dataQueVaiSerFiltrada2 = filtro.filtraData(dataGanho, mes, ano);
                            if (!dataQueVaiSerFiltrada2.equals("")) {
                                getTotalGanhos += ganho.getValor();
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao realizar essa operação");
                    }
                }
                saldo = getTotalGanhos - getTotalGastos;
                System.out.println("\n\nGastos no MES "+mes+" no ANO de "+ano);
                System.out.println("Total de ganhos: "+getTotalGanhos);
                System.out.println("Total de gastos: "+getTotalGastos);
                System.out.println("Saldo: "+saldo);
                System.out.println("\n\n");
            }
            // Fim do codigo
        } while (opcaoMenu != 6);
    }

}