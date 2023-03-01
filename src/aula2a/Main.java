package aula2a;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:h2:mem:test";
        Connection connection = DriverManager.getConnection(jdbcURL);
        System.out.println("Conectado ao Banco de Dados!");

        String sql = "CREATE TABLE carrinho (" +
                " id INTEGER PRIMARY KEY," +
                " nome_produto VARCHAR(255) NOT NULL," +
                " quantidade INTEGER NOT NULL," +
                " preco numeric(6, 2) NOT NULL)";

        Statement statement = connection.createStatement();
        statement.execute(sql);
        System.out.println("Tabela criada!");
        sql = "INSERT INTO carrinho VALUES (1, 'iPhone 14', 21, 7900.00)";

        int rows = statement.executeUpdate(sql);

        if (rows > 0) {
            System.out.println("Registro inserido!");
        }

        sql = "SELECT * FROM carrinho";

        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;

        while (resultSet.next()) {
            count++;

            int id = resultSet.getInt("id");
            String nome_produto = resultSet.getString("nome_produto");
            int quantidade = resultSet.getInt("quantidade");
            double preco = resultSet.getDouble("preco");
            System.out.println("Produto #" + id + ": " + nome_produto +
                    ", " + quantidade + " unidade(s) ao preço de R$ " + preco);
        }

        connection.close();
    }
}