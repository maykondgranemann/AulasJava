package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.CategoriaDao;
import model.Categoria;

public class ViewCreate2 extends JFrame {
    private Container container;

    public ViewCreate2() {
        super("Categorias");
        setLayout(null);
       
        container = getContentPane();
        JLabel lbNome =  new JLabel("Nome:");
        lbNome.setBounds(10, 10, 50, 20);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(70, 10, 250, 20);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(10, 40, 100, 20);

        btnSalvar.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               Categoria model = new Categoria();
               model.setNome(txtNome.getText());
               salvar(model);               
            }
        });

        container.add(lbNome);
        container.add(txtNome);
        container.add(btnSalvar);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void salvar(Categoria model){
        CategoriaDao dao = new CategoriaDao();
        dao.insert(model);
        JOptionPane.showMessageDialog(container, "Categoria:"+model.getNome()+ " Salva com sucesso!" ); 
    }

}
