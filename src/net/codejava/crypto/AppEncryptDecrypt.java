package net.codejava.crypto;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.crypto.*;
//baeldung.com/java-aes-encryption-decryption.

public class AppEncryptDecrypt extends JFrame{
    private Toolkit toolkit;
    public AppEncryptDecrypt(){
        setTitle("Encrypt & Decrypt");
        setSize(400,250);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        
        //Create ImageIcon
        ImageIcon encrypt_icon = new ImageIcon("icons/encrypt.png");
        ImageIcon decrypt_icon = new ImageIcon("icons/decrypt.png");
        
        //Encrypt window Button
        JButton encrypt_win_btn = new JButton(encrypt_icon/*"Encrypt a file"*/);
        encrypt_win_btn.setBounds(50,10,130,120);
        encrypt_win_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){

                //call the encrypt interface
               Encrypt encrypt_interface = new Encrypt();
                    encrypt_interface.setVisible(true);
                    dispose();
            }
        });

        //Decrypt window Button
        JButton decrypt_win_btn = new JButton(decrypt_icon/*"Decrypt a file"*/);
        decrypt_win_btn.setBounds(200,10,130,120);
        decrypt_win_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
               
                //call the decrypt interface
                Decrypt decrypt_interface = new Decrypt();
                    decrypt_interface.setVisible(true);
                    dispose();
            }
        });

        //Close Button

        JButton close = new JButton("Close");
        close.setBounds(250,160,80,30);
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });

        panel.add(encrypt_win_btn);
        panel.add(decrypt_win_btn);
        panel.add(close);

    }
        public static void main(String[]args){
            AppEncryptDecrypt menu_buttons = new AppEncryptDecrypt();
            menu_buttons.setVisible(true);
        }

}
