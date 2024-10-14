package POO.Classes;

public class OptionalData {
    // Usando wrapper classes para permitir valores null
    private Integer idade; // campo opcional, pode ser null
    private Double salario; // campo opcional, pode ser null

    // Construtor
    public OptionalData(Integer idade, Double salario) {
        this.idade = idade;  // Boxing automático
        this.salario = salario;  // Boxing automático
    }

    // Getters e Setters
    public Integer getIdade() {
        return idade;  // Retorna o Integer (pode ser null)
    }

    public void setIdade(Integer idade) {
        this.idade = idade;  // Boxing automático
    }

    public Double getSalario() {
        return salario;  // Retorna o Double (pode ser null)
    }

    public void setSalario(Double salario) {
        this.salario = salario;  // Boxing automático
    }

    // Método para demonstrar unboxing
    public void mostrarDados() {
        // Unboxing dos valores, se não forem null
        if (idade != null) {
            int idadePrimitiva =(int) idade;  // Unboxing automático
            System.out.println("Idade: " + idadePrimitiva);
        } else {
            System.out.println("Idade: Não especificada");
        }

        if (salario != null) {
            double salarioPrimitivo = (double)salario;  // Unboxing automático
            System.out.println("Salário: " + salarioPrimitivo);
        } else {
            System.out.println("Salário: Não especificado");
        }
    }
}