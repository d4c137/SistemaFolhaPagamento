public class Teste {
    public static void main(String[] args) {
        // Teste 1 - CLT
        Colaborador c1 = new Colaborador(101, "Ana Silva", "CLT");
        System.out.println(c1);
        System.out.println("Salário: R$ " + c1.calcularSalarioFinal());
        
        // Teste 2 - PJ
        Colaborador c2 = new Colaborador(102, "Bruno Souza", "PJ");
        System.out.println(c2);
        System.out.println("Salário: R$ " + c2.calcularSalarioFinal());
        
        // Teste 3 - ESTAGIO
        Colaborador c3 = new Colaborador(103, "Carla Dias", "ESTAGIO");
        System.out.println(c3);
        System.out.println("Salário: R$ " + c3.calcularSalarioFinal());
    }
}