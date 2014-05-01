package br.unicastelo.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PrincipalTela extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public JPanel contentPane;


    public PrincipalTela() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(100, 100, 1266, 674);
        // setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JToolBar toolBar = new JToolBar();
        toolBar.setEnabled(false);
        toolBar.setFloatable(false);
        contentPane.add(toolBar, BorderLayout.NORTH);

        JButton btnCheckIn = new JButton("Check In");
        toolBar.add(btnCheckIn);
        btnCheckIn.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnCheckIn.setHorizontalTextPosition(SwingConstants.CENTER);

        JButton btnFila = new JButton("Fila");
        toolBar.add(btnFila);
        btnFila.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnFila.setHorizontalTextPosition(SwingConstants.CENTER);
        btnFila.setIcon(new ImageIcon(""));
        JButton btnChamada = new JButton("Chamada");
        toolBar.add(btnChamada);
        btnChamada.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnChamada.setHorizontalTextPosition(SwingConstants.CENTER);

        final JDesktopPane desktopPaneInterno = new JDesktopPane();
        desktopPaneInterno.setBackground(new Color(192, 192, 192));
        desktopPaneInterno.setBounds(0, 0, 1348, 708);
        contentPane.add(desktopPaneInterno);

        btnCheckIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                
                ViewCheckIn view = new ViewCheckIn();
                desktopPaneInterno.add(view);
                view.setVisible(true);
            }
        });
    }
}