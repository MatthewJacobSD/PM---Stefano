import javax.swing.*;
import java.awt.*;
import java.util.List;

import static com.sun.tools.classfile.AccessFlags.Kind.Method;

public class ViewPasswordsGUI extends JFrame {
    User user;

    public ViewPasswordsGUI(User user) {
        this.user = user;
        initComponents(user);
    }

    private void initComponents(User user) {
        setTitle("View Passwords");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JTextArea passwordsTextArea = new JTextArea();
        passwordsTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(passwordsTextArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Get passwords from the user object
        List<Password> passwords = user.getPasswords();
        for (Password password : passwords) {
            passwordsTextArea.append("Service: " + passwords.getFirst().getServiceName() + "\n");
            passwordsTextArea.append("Username: " + passwords.get(1).getUsername() + "\n");
            passwordsTextArea.append("Password: " + passwords.get(2).getPassword() + "\n");
            passwordsTextArea.append("Purpose: " + passwords.get(3).getPurpose() + "\n\n");
        }

        getContentPane().add(panel);
        setVisible(true);
    }

}