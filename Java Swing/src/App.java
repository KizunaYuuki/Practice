import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        JFrame jframe = new JFrame("Swing");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jframe.setSize(400, 400);

        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
