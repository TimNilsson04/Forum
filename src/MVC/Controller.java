package MVC;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {
    ForumView view;
    Model model;
    Connection connection;

    public Controller(Model m, ForumView v) {
        String user = "te20";
        JPasswordField pf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String password = new String(pf.getPassword());

        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? "+
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
       /* this.setContentPane(ForumView.getForum());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
*/
    }

    public static void main(String[] args) {
        Model m = new Model(); // me
        // ClientModel m = new ClientModel("10.80.47.10", 5858); // Alexandro
        // ClientModel m = new ClientModel("10.80.46.47", 1234); // Tim
        ForumView v = new ForumView();
        Controller c = new Controller(m, v);
    }
}


