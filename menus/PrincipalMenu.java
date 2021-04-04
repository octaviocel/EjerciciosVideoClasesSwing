/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class PrincipalMenu extends JFrame{
    
    private JMenuBar mbMenu;
    private Menu1 mMenu;
    private Menu2 mMenu1;
    private Menu3 mMenu2;
    private JPanel pnl;
    
    public PrincipalMenu(){
        super("Menu");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        mbMenu = new JMenuBar();
        mMenu = new Menu1();
        mMenu1 = new Menu2();
        pnl = new JPanel();        
        pnl.setBackground(Color.LIGHT_GRAY);
        mMenu1.setListener(new ColorListener() {
            @Override
            public void colorClick() {
                pnl.setBackground(mMenu1.color());
            }
        });
        mMenu2 = new Menu3();
        mbMenu.add(mMenu);
        mbMenu.add(mMenu1);
        mbMenu.add(mMenu2);
        
        super.add(mbMenu, BorderLayout.NORTH);
        super.add(pnl);
        
        super.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new PrincipalMenu();
    }
}
