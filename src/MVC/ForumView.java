package MVC;

import javax.swing.*;

public class ForumView {
    private JPanel Forum;
    private JTextArea textArea1;
    private JButton LOGINButton;
    private JButton NEWPOSTButton;

    public ForumView(JPanel forum, JTextArea textArea1, JButton LOGINButton, JButton NEWPOSTButton) {
        Forum = forum;
        this.textArea1 = textArea1;
        this.LOGINButton = LOGINButton;
        this.NEWPOSTButton = NEWPOSTButton;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JButton getLOGINButton() {
        return LOGINButton;
    }

    public JButton getNEWPOSTButton() {
        return NEWPOSTButton;
    }
}

