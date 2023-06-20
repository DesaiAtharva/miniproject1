import Compressor_Decompressor_compress;
import Compressor_Decompressor_decompress;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class frame extends JFrame implements ActionListener {
    JFrame compressor;
    JButton block1, block2;

    frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressor = new JFrame("Compress and Decompress file");
        compressor.setLayout(null);
        compressor.setSize(1000, 700);
        compressor.setLocation(100, 100);

        block1 = new JButton("Compress");
        block1.setSize(300, 50);
        block1.setLocation(30, 40);
        block2 = new JButton("Decompress");
        block2.setSize(300, 50);
        block2.setLocation(400, 40);

        block1.addActionListener(this);
        block2.addActionListener(this);

        compressor.getContentPane().setBackground(Color.black);
        compressor.add(block1);
        compressor.add(block2);
        compressor.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == block1) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    compress.method(file);
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
        if (e.getSource() == block2) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    decompress.method(file);
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
    }

    public void decompressFile(File file) {
        JOptionPane.showMessageDialog(null, "File decompressed successfully!");
    }

    public void compressFile(File file) {
        JOptionPane.showMessageDialog(null, "File compressed successfully!");
    }
}

