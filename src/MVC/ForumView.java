package MVC;

import javax.swing.*;

public class ForumView {
    private JPanel Forum;
    private JTextArea textArea1;
    private JButton LOGINButton;
    private JButton NEWPOSTButton;

    public JPanel getForum() {
        return Forum;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JButton getLOGINButton() {
        return LOGINButton;
    }

    public void setLOGINButton(JButton LOGINButton) {
        this.LOGINButton = LOGINButton;
    }

    public JButton getNEWPOSTButton() {
        return NEWPOSTButton;
    }

    public void setNEWPOSTButton(JButton NEWPOSTButton) {
        this.NEWPOSTButton = NEWPOSTButton;
    }
}

