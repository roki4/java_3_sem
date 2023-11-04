import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Создание окна
        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание панели для отображения изображения
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\markg\\OneDrive\\Рабочий стол\\ani1.png");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }
        };

        // Установка предпочтительного размера панели
        panel.setPreferredSize(new Dimension(750, 750));

        // Добавление панели в окно
        frame.getContentPane().add(panel);

        // Отображение окна
        frame.pack();
        frame.setVisible(true);
    }
}
