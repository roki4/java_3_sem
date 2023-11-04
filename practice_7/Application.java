package practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    JButton labeled1 = new JButton("AC Milan");
    JButton labeled2 = new JButton("Real Madrid");
    JLabel label1 = new JLabel("Result: 0 x 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    Label label3 = new Label("Winner: DRAW");

    private int p1 = 0;
    private int p2 = 0;

    public Application() {
        super("Ac Milan x Real Madrid");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(label1);
        add(label2);
        add(labeled1);
        add(labeled2);
        add(label3);
        labeled1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1 += 1;
                changeScore();
                changeScorer("AC Milan");
                changeWinner();
            }
        });
        labeled2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2 += 1;
                changeScore();
                changeScorer("Real Madrid");
                changeWinner();
            }
        });
    }

    private void changeWinner() {
        if (this.p1 > this.p2) {
            label3.setText("Winner: AC Milan");
        } else if (this.p1 < this.p2) {
            label3.setText("Winner: Real Madrid");
        } else {
            label3.setText("Winner: DRAW");
        }
    }

    private void changeScore() {
        label1.setText("Result: " + this.p1 + " x " +  this.p2);
    }

    private void changeScorer(String team)
    {
        label2.setText("Last Scorer: " + team);
    }


    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
