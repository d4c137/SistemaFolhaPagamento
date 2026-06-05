import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Lista para guardar os colaboradores
        ArrayList<Colaborador> listaColaboradores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        int opcao;
        
        do {
            // Menu do sistema
            System.out.println("\n===== SISTEMA FOLHA DE PAGAMENTO =====");
            System.out.println("1 - Cadastrar colaborador");
            System.out.println("2 - Listar colaboradores");
            System.out.println("3 - Calcular folha de pagamento");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine(); // limpar o buffer
            
            if (opcao == 1) {
                // CADASTRAR
                System.out.println("\n--- CADASTRO ---");
                
                System.out.print("Número de registro: ");
                int registro = input.nextInt();
                input.nextLine();
                
                System.out.print("Nome completo: ");
                String nome = input.nextLine();
                
                System.out.print("Tipo (CLT/PJ/ESTAGIO): ");
                String tipo = input.nextLine();
                tipo = tipo.toUpperCase(); // converter para maiusculo
                
                // Criar o objeto e adicionar na lista
                Colaborador novo = new Colaborador(registro, nome, tipo);
                listaColaboradores.add(novo);
                
                System.out.println("Cadastrado com sucesso!");
                System.out.println("Salario base: R$ 2000,00");
                System.out.println("Salario final: R$ " + novo.calcularSalarioFinal());
                
            } else if (opcao == 2) {
                // LISTAR
                System.out.println("\n--- LISTA DE COLABORADORES ---");
                
                if (listaColaboradores.isEmpty()) {
                    System.out.println("Nenhum colaborador cadastrado.");
                } else {
                    for (int i = 0; i < listaColaboradores.size(); i++) {
                        Colaborador c = listaColaboradores.get(i);
                        System.out.println("Registro: " + c.getRegistro() + " | Nome: " + c.getNome() + " | Tipo: " + c.getTipoVinculo());
                    }
                    System.out.println("Total: " + listaColaboradores.size() + " colaboradores");
                }
                
            } else if (opcao == 3) {
                // CALCULAR FOLHA
                System.out.println("\n--- FOLHA DE PAGAMENTO ---");
                
                if (listaColaboradores.isEmpty()) {
                    System.out.println("Nenhum colaborador para calcular.");
                } else {
                    double totalGeral = 0;
                    
                    for (int i = 0; i < listaColaboradores.size(); i++) {
                        Colaborador c = listaColaboradores.get(i);
                        double salarioFinal = c.calcularSalarioFinal();
                        totalGeral = totalGeral + salarioFinal;
                        
                        System.out.println(c.getNome() + " - " + c.getTipoVinculo() + " - R$ " + salarioFinal);
                    }
                    
                    System.out.println("-----------------------------------");
                    System.out.println("TOTAL DA FOLHA: R$ " + totalGeral);
                }
                
            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opcao invalida! Digite 1, 2, 3 ou 4.");
            }
            
        } while (opcao != 4);
        
        input.close();
    }
}