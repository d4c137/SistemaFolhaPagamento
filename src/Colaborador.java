public class Colaborador {
    // Atributos
    int registro;
    String nome;
    String tipoVinculo;
    
    // Salario base fixo
    double salarioBase = 2000.00;
    
    // Construtor
    Colaborador(int registro, String nome, String tipoVinculo) {
        this.registro = registro;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
    }
    
    // Metodo para calcular o salario final
    double calcularSalarioFinal() {
        if (tipoVinculo.equals("CLT")) {
            return salarioBase * 1.10; // +10%
        } else if (tipoVinculo.equals("PJ")) {
            return salarioBase * 0.89; // -11%
        } else if (tipoVinculo.equals("ESTAGIO")) {
            return salarioBase * 0.80; // -20%
        } else {
            return salarioBase;
        }
    }
    
    // Metodos getters
    int getRegistro() {
        return registro;
    }
    
    String getNome() {
        return nome;
    }
    
    String getTipoVinculo() {
        return tipoVinculo;
    }
}