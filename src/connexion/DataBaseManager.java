package connexion;
import Model.CenterUser;
import Model.*;
import java.sql.*;

public class DataBaseManager {

    private Connection connection;

    public DataBaseManager(){
        try{
            String url = "jdbc:mysql://localhost:3306/data_base-name";
            String username = "root";
            String password = "";

            // charger le pilote JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Etablit la connexion à la base de données
            connection = DriverManager.getConnection(url, username, password);

            System.out.println("conexion à la base de donnée établie");
        } catch (ClassNotFoundException e){
            System.err.println("ERREUR lors du chargement du pilote JDBC: " + e.getMessage());
        } catch (SQLException e){
            System.err.println("ERREUR lors de la connexion à la base de donnée" + e.getMessage());
        }
    }

    public void insertCenterUser(CenterUser u) {
        int id = u.getId();

        String query = "INSERT INTO CenterUser(id, id_center, email, password) VALUES ('id')";

        try(PreparedStatement statement = connection.prepareStatement(query))
    }
}
