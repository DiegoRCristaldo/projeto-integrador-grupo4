import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static void main(String[] args) {
        // Informações de conexão
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        // Objeto de conexão
        Connection conexao = null;

        try {
            // Carregar o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // Realizar operações no banco de dados aqui...

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar a conexão quando não for mais necessária
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Pessoa {
    // Método para cadastrar aluno
    public static void aluno(boolean ensinoMedio) {
        if (ensinoMedio) {
            // Código para cadastrar um aluno aqui
            String nome;
            String cpf;
            String rg;
            String orgaoExpedidor;
            String telFixo;
            String telCelular;
            String endereco;
            String complemento;
            String bairro;
            String estado;
            String cidade;
            String cep;
        } else {
            System.out.println("Você precisa do Ensino Médio Completo para realizar a matrícula");
        }
    }

    // Método para cadastrar professor
    public static void professor() {
        cadastrarNotas();
        cadastrarFrequencia(true); // Passando true para indicar que o aluno está presente
    }

    // Método para calcular a média de notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para cadastrar frequência
    public static void cadastrarFrequencia(boolean alunoPresente) {
        int presente = 0;
        int falta = 0;
        int qtdAulas = 50;
        for (int i = 0; i < qtdAulas; i++) {
            if (alunoPresente) {
                presente++;
            } else {
                falta++;
            }
        }
        System.out.println("Aulas presentes: " + presente);
        System.out.println("Aulas com falta: " + falta);
    }

    // Método para cadastrar empresa (pessoa jurídica)
    public static void pessoaJuridica() {
        cadastrarFornecedor();
    }

    // Método para cadastrar fornecedor
    public static void cadastrarFornecedor() {
        String razaoSocial;
        String nomeFantasia;
        String cnpj;
        String telFixo;
        String telCelular;
        String endereco;
        String complemento;
        String bairro;
        String estado;
        String cidade;
        String cep;
    }

    public static void main(String[] args) {
        // Exemplo de chamada do método aluno com ensino médio
        aluno(true);

        // Exemplo de chamada do método aluno sem ensino médio
        aluno(false);

        // Exemplo de chamada do método professor
        professor();

        // Exemplo de chamada do método cadastrarFornecedor
        pessoaJuridica();
    }
}