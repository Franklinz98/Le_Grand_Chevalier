/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import modelo.PlatoP;

/**
 *
 * @author mybas
 */
public class MPlatos extends javax.swing.JFrame {

    public static class Orden {

        int codigo;
        String nombre;
        int cantidad;
        int precio;
        Orden link;
    }

    public static Orden ptr = null;

    public static Orden agregarPlato(Orden ptr, int codigo, String nombre, int precio, int cantidad) {
        Orden p = new Orden();
        p.codigo = codigo;
        p.nombre = nombre;
        p.precio = precio;
        p.cantidad = cantidad;
        if (ptr == null) {
            ptr = p;
        } else {
            Orden q = ptr;
            while (q.link != null) {
                q = q.link;
            }
            q.link = p;
        }
        return ptr;
    }

    public static Orden actualizarPlato(Orden ptr, int codigo, int cantidad) {
        Orden p = ptr;
        while (p.codigo != codigo && p.link != null) {
            p = p.link;
        }
        p.cantidad = cantidad;
        return ptr;
    }

    public static Orden QuitarPlato(Orden ptr, int codigo) {
        if (ptr.codigo == codigo) {
            ptr = ptr.link;
        } else {
            Orden antq = ptr;
            Orden q = ptr.link;
            while (q.codigo != codigo && q.link != null) {
                antq = antq.link;
                q = q.link;
            }
            antq.link = q.link;
            q.link = null;
        }
        return ptr;
    }

    void mostrarOrden(Orden ptr) {
        DefaultListModel model = (DefaultListModel) OrdenPlatos.getModel();
        model.clear();

        Orden p = ptr;
        while (p != null) {
            model.addElement(p.cantidad + "," + p.nombre + ".");
            p = p.link;
        }

    }

    /**
     * Creates new form IntPrincipal
     */
    public MPlatos() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/LGC_Icon.png"));
        setIconImage(icon);
        //Color JFrame
        Color mostazarest = new Color(213,170,65);
        this.getContentPane().setBackground(mostazarest);
        DefaultListModel model = new DefaultListModel();
        OrdenPlatos.setModel(model);
        if (ptr != null) {
            Orden p = ptr;
            do {
                switch (p.codigo) {
                    case 2343:
                        CPlato1.setText(Integer.toString(p.cantidad));
                        Plato1.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 2792:
                        CPlato2.setText(Integer.toString(p.cantidad));
                        Plato2.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 9980:
                        CPlato3.setText(Integer.toString(p.cantidad));
                        Plato3.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 6236:
                        CPlato4.setText(Integer.toString(p.cantidad));
                        Plato4.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 7985:
                        CPlato5.setText(Integer.toString(p.cantidad));
                        Plato5.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 2850:
                        CPlato6.setText(Integer.toString(p.cantidad));
                        Plato6.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 5863:
                        CPlato2.setText(Integer.toString(p.cantidad));
                        Plato2.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 4496:
                        CPlato2.setText(Integer.toString(p.cantidad));
                        Plato2.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 4820:
                        CPlato7.setText(Integer.toString(p.cantidad));
                        Plato7.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 5177:
                        CPlato2.setText(Integer.toString(p.cantidad));
                        Plato2.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 3944:
                        CPlato2.setText(Integer.toString(p.cantidad));
                        Plato2.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                    case 2117:
                        CPlato8.setText(Integer.toString(p.cantidad));
                        Plato8.setSelected(true);
                        ptr = QuitarPlato(ptr, p.codigo);
                        mostrarOrden(ptr);
                        System.out.print(p.cantidad + "|");
                        break;
                }
                p = p.link;
            } while (p.link != null);
            mostrarOrden(ptr);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        PanelRojo = new javax.swing.JPanel();
        LabelOrden = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrdenPlatos = new javax.swing.JList<>();
        CocinaAD = new javax.swing.JButton();
        CocinaAD1 = new javax.swing.JButton();
        LabelPlatos = new javax.swing.JLabel();
        Scrollp = new javax.swing.JScrollPane();
        Menu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        VPlato1 = new javax.swing.JLabel();
        NPlato1 = new javax.swing.JLabel();
        PPlato1 = new javax.swing.JLabel();
        Plato1 = new javax.swing.JCheckBox();
        CPlato1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        VPlato3 = new javax.swing.JLabel();
        NPlato3 = new javax.swing.JLabel();
        PPlato3 = new javax.swing.JLabel();
        Plato3 = new javax.swing.JCheckBox();
        CPlato3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        VPlato2 = new javax.swing.JLabel();
        NPlato2 = new javax.swing.JLabel();
        PPlato2 = new javax.swing.JLabel();
        Plato2 = new javax.swing.JCheckBox();
        CPlato2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        VPlato4 = new javax.swing.JLabel();
        NPlato4 = new javax.swing.JLabel();
        PPlato4 = new javax.swing.JLabel();
        Plato4 = new javax.swing.JCheckBox();
        CPlato4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        VPlato5 = new javax.swing.JLabel();
        NPlato5 = new javax.swing.JLabel();
        PPlato5 = new javax.swing.JLabel();
        Plato5 = new javax.swing.JCheckBox();
        CPlato5 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        VPlato6 = new javax.swing.JLabel();
        NPlato6 = new javax.swing.JLabel();
        PPlato6 = new javax.swing.JLabel();
        Plato6 = new javax.swing.JCheckBox();
        CPlato6 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        VPlato7 = new javax.swing.JLabel();
        NPlato7 = new javax.swing.JLabel();
        PPlato7 = new javax.swing.JLabel();
        Plato7 = new javax.swing.JCheckBox();
        CPlato7 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        VPlato8 = new javax.swing.JLabel();
        NPlato8 = new javax.swing.JLabel();
        PPlato8 = new javax.swing.JLabel();
        Plato8 = new javax.swing.JCheckBox();
        CPlato8 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        VPlato9 = new javax.swing.JLabel();
        NPlato9 = new javax.swing.JLabel();
        PPlato9 = new javax.swing.JLabel();
        Plato9 = new javax.swing.JCheckBox();
        CPlato9 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        VPlato11 = new javax.swing.JLabel();
        NPlato11 = new javax.swing.JLabel();
        PPlato11 = new javax.swing.JLabel();
        Plato11 = new javax.swing.JCheckBox();
        CPlato11 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        VPlato12 = new javax.swing.JLabel();
        NPlato12 = new javax.swing.JLabel();
        PPlato12 = new javax.swing.JLabel();
        Plato12 = new javax.swing.JCheckBox();
        CPlato12 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        VPlato10 = new javax.swing.JLabel();
        NPlato10 = new javax.swing.JLabel();
        PPlato10 = new javax.swing.JLabel();
        Plato10 = new javax.swing.JCheckBox();
        CPlato10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Le Grand Chevalier");
        setBackground(new java.awt.Color(217, 120, 26));
        setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        setMinimumSize(new java.awt.Dimension(960, 600));
        setName("MP"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(960, 600));

        PanelRojo.setBackground(new java.awt.Color(0, 0, 0));

        LabelOrden.setFont(new java.awt.Font("Freestyle Script", 0, 72)); // NOI18N
        LabelOrden.setForeground(new java.awt.Color(255, 255, 255));
        LabelOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelOrden.setText("Orden");

        OrdenPlatos.setFont(new java.awt.Font("Freestyle Script", 0, 24)); // NOI18N
        OrdenPlatos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(OrdenPlatos);

        CocinaAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/enviar normal.png"))); // NOI18N
        CocinaAD.setBorder(null);
        CocinaAD.setBorderPainted(false);
        CocinaAD.setContentAreaFilled(false);
        CocinaAD.setMaximumSize(new java.awt.Dimension(90, 33));
        CocinaAD.setMinimumSize(new java.awt.Dimension(90, 33));
        CocinaAD.setPreferredSize(new java.awt.Dimension(90, 33));
        CocinaAD.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/enviar presionado.png"))); // NOI18N
        CocinaAD.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/Enviar arriba.png"))); // NOI18N
        CocinaAD.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/Enviar arriba.png"))); // NOI18N

        CocinaAD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/imprimir normal.png"))); // NOI18N
        CocinaAD1.setBorder(null);
        CocinaAD1.setBorderPainted(false);
        CocinaAD1.setContentAreaFilled(false);
        CocinaAD1.setMaximumSize(new java.awt.Dimension(90, 33));
        CocinaAD1.setMinimumSize(new java.awt.Dimension(90, 33));
        CocinaAD1.setPreferredSize(new java.awt.Dimension(90, 33));
        CocinaAD1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/imprimir presionado.png"))); // NOI18N
        CocinaAD1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/imprimir arriba.png"))); // NOI18N
        CocinaAD1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/imprimir arriba.png"))); // NOI18N

        javax.swing.GroupLayout PanelRojoLayout = new javax.swing.GroupLayout(PanelRojo);
        PanelRojo.setLayout(PanelRojoLayout);
        PanelRojoLayout.setHorizontalGroup(
            PanelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRojoLayout.createSequentialGroup()
                .addGroup(PanelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRojoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(LabelOrden))
                    .addGroup(PanelRojoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRojoLayout.createSequentialGroup()
                                .addComponent(CocinaAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CocinaAD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        PanelRojoLayout.setVerticalGroup(
            PanelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRojoLayout.createSequentialGroup()
                .addComponent(LabelOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CocinaAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CocinaAD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelPlatos.setFont(new java.awt.Font("Freestyle Script", 0, 72)); // NOI18N
        LabelPlatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPlatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/Platos.png"))); // NOI18N
        LabelPlatos.setMaximumSize(new java.awt.Dimension(163, 86));
        LabelPlatos.setMinimumSize(new java.awt.Dimension(163, 86));
        LabelPlatos.setPreferredSize(new java.awt.Dimension(163, 86));

        Scrollp.setBackground(new java.awt.Color(217, 120, 26));
        Scrollp.setBorder(null);
        Scrollp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Menu.setBackground(new java.awt.Color(213, 170, 65));
        Menu.setMaximumSize(new java.awt.Dimension(688, 1095));
        Menu.setMinimumSize(new java.awt.Dimension(688, 1095));
        Menu.setPreferredSize(new java.awt.Dimension(688, 1095));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel13.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel13.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Bar de ligne.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato1.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato1.setForeground(new java.awt.Color(255, 255, 255));
        NPlato1.setText("Bar de Ligne");

        PPlato1.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato1.setForeground(new java.awt.Color(255, 255, 255));
        PPlato1.setText("$ 423 000");

        Plato1.setBorder(null);
        Plato1.setContentAreaFilled(false);
        Plato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato1ItemStateChanged(evt);
            }
        });

        CPlato1.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato1.setForeground(new java.awt.Color(16, 19, 24));
        CPlato1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato1.setText("1");
        CPlato1.setBorder(null);
        CPlato1.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato1.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato1.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato1MouseClicked(evt);
            }
        });
        CPlato1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPlato1)
                            .addComponent(PPlato1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Plato1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato1)
                .addGap(6, 6, 6)
                .addComponent(PPlato1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato1)
                    .addComponent(CPlato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel15.setMinimumSize(new java.awt.Dimension(146, 146));

        VPlato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Caille de Race.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato3.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato3.setForeground(new java.awt.Color(255, 255, 255));
        NPlato3.setText("Caille de Race");

        PPlato3.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato3.setForeground(new java.awt.Color(255, 255, 255));
        PPlato3.setText("$ 329 000");

        Plato3.setBorder(null);
        Plato3.setContentAreaFilled(false);
        Plato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato3ItemStateChanged(evt);
            }
        });

        CPlato3.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato3.setForeground(new java.awt.Color(16, 19, 24));
        CPlato3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato3.setText("1");
        CPlato3.setBorder(null);
        CPlato3.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato3.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato3.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato3MouseClicked(evt);
            }
        });
        CPlato3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Plato3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NPlato3)
                    .addComponent(PPlato3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato3)
                    .addComponent(CPlato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel14.setMinimumSize(new java.awt.Dimension(146, 146));

        VPlato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Blanc de turbot.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato2.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato2.setForeground(new java.awt.Color(255, 255, 255));
        NPlato2.setText("Blanc de Turbot");

        PPlato2.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato2.setForeground(new java.awt.Color(255, 255, 255));
        PPlato2.setText("$ 438 700");

        Plato2.setBorder(null);
        Plato2.setContentAreaFilled(false);
        Plato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato2ItemStateChanged(evt);
            }
        });

        CPlato2.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato2.setForeground(new java.awt.Color(16, 19, 24));
        CPlato2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato2.setText("1");
        CPlato2.setBorder(null);
        CPlato2.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato2.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato2.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato2MouseClicked(evt);
            }
        });
        CPlato2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Plato2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NPlato2)
                    .addComponent(PPlato2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato2)
                    .addComponent(CPlato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel16.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel16.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Crêpes au Sarrasin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato4.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato4.setForeground(new java.awt.Color(255, 255, 255));
        NPlato4.setText("Crêpes au Sarrasin");

        PPlato4.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato4.setForeground(new java.awt.Color(255, 255, 255));
        PPlato4.setText("$ 287 500");

        Plato4.setBorder(null);
        Plato4.setContentAreaFilled(false);
        Plato4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato4ItemStateChanged(evt);
            }
        });

        CPlato4.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato4.setForeground(new java.awt.Color(16, 19, 24));
        CPlato4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato4.setText("1");
        CPlato4.setBorder(null);
        CPlato4.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato4.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato4.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato4MouseClicked(evt);
            }
        });
        CPlato4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPlato4)
                    .addComponent(PPlato4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Plato4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato4)
                    .addComponent(CPlato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel17.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel17.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Gratinée D'oignons.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato5.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato5.setForeground(new java.awt.Color(255, 255, 255));
        NPlato5.setText("Gratinée d'Oignons");

        PPlato5.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato5.setForeground(new java.awt.Color(255, 255, 255));
        PPlato5.setText("$ 219 400");

        Plato5.setBorder(null);
        Plato5.setContentAreaFilled(false);
        Plato5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato5ItemStateChanged(evt);
            }
        });

        CPlato5.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato5.setForeground(new java.awt.Color(16, 19, 24));
        CPlato5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato5.setText("1");
        CPlato5.setBorder(null);
        CPlato5.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato5.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato5.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato5MouseClicked(evt);
            }
        });
        CPlato5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Plato5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NPlato5)
                    .addComponent(PPlato5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato5)
                    .addComponent(CPlato5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel18.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel18.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Hachis Parmentier.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato6.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato6.setForeground(new java.awt.Color(255, 255, 255));
        NPlato6.setText("Hachis Parmentier");

        PPlato6.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato6.setForeground(new java.awt.Color(255, 255, 255));
        PPlato6.setText("$ 268 800");

        Plato6.setBorder(null);
        Plato6.setContentAreaFilled(false);
        Plato6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato6ItemStateChanged(evt);
            }
        });

        CPlato6.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato6.setForeground(new java.awt.Color(16, 19, 24));
        CPlato6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato6.setText("1");
        CPlato6.setBorder(null);
        CPlato6.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato6.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato6.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato6MouseClicked(evt);
            }
        });
        CPlato6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Plato6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NPlato6)
                    .addComponent(PPlato6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato6)
                    .addComponent(CPlato6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel19.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel19.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Homard Bleu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato7.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato7.setForeground(new java.awt.Color(255, 255, 255));
        NPlato7.setText("Homard Bleu");

        PPlato7.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato7.setForeground(new java.awt.Color(255, 255, 255));
        PPlato7.setText("$ 432 500");

        Plato7.setBorder(null);
        Plato7.setContentAreaFilled(false);
        Plato7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato7ItemStateChanged(evt);
            }
        });

        CPlato7.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato7.setForeground(new java.awt.Color(16, 19, 24));
        CPlato7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato7.setText("1");
        CPlato7.setBorder(null);
        CPlato7.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato7.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato7.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato7MouseClicked(evt);
            }
        });
        CPlato7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato7KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPlato7)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plato7)
                            .addComponent(PPlato7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato7)
                    .addComponent(CPlato7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel20.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel20.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Langoustine Bretonne.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato8.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato8.setForeground(new java.awt.Color(255, 255, 255));
        NPlato8.setText("Langoustine Bretonne");

        PPlato8.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato8.setForeground(new java.awt.Color(255, 255, 255));
        PPlato8.setText("$ 438 700");

        Plato8.setBorder(null);
        Plato8.setContentAreaFilled(false);
        Plato8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato8ItemStateChanged(evt);
            }
        });

        CPlato8.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato8.setForeground(new java.awt.Color(16, 19, 24));
        CPlato8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato8.setText("1");
        CPlato8.setBorder(null);
        CPlato8.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato8.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato8.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato8MouseClicked(evt);
            }
        });
        CPlato8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato8KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPlato8)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plato8)
                            .addComponent(PPlato8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato8)
                    .addComponent(CPlato8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel21.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel21.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Noix de Ris de Veau.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato9.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato9.setForeground(new java.awt.Color(255, 255, 255));
        NPlato9.setText("Noix de Ris de Veau");

        PPlato9.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato9.setForeground(new java.awt.Color(255, 255, 255));
        PPlato9.setText("$ 376 040");

        Plato9.setBorder(null);
        Plato9.setContentAreaFilled(false);
        Plato9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato9ItemStateChanged(evt);
            }
        });

        CPlato9.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato9.setForeground(new java.awt.Color(16, 19, 24));
        CPlato9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato9.setText("1");
        CPlato9.setBorder(null);
        CPlato9.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato9.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato9.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato9MouseClicked(evt);
            }
        });
        CPlato9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPlato9)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plato9)
                            .addComponent(PPlato9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato9)
                    .addComponent(CPlato9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel23.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel23.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Semoule D’agneau.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato11.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato11.setForeground(new java.awt.Color(255, 255, 255));
        NPlato11.setText("Semoule d’Agneau");

        PPlato11.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato11.setForeground(new java.awt.Color(255, 255, 255));
        PPlato11.setText("$ 297 700");

        Plato11.setBorder(null);
        Plato11.setContentAreaFilled(false);
        Plato11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato11.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato11ItemStateChanged(evt);
            }
        });

        CPlato11.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato11.setForeground(new java.awt.Color(16, 19, 24));
        CPlato11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato11.setText("1");
        CPlato11.setBorder(null);
        CPlato11.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato11.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato11.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato11MouseClicked(evt);
            }
        });
        CPlato11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato11KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPlato11)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plato11)
                            .addComponent(PPlato11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato11)
                    .addComponent(CPlato11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel12.setMinimumSize(new java.awt.Dimension(166, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(166, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setMaximumSize(new java.awt.Dimension(146, 146));
        jPanel24.setMinimumSize(new java.awt.Dimension(146, 146));
        jPanel24.setPreferredSize(new java.awt.Dimension(146, 146));

        VPlato12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Soupe à L’oignon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato12.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato12.setForeground(new java.awt.Color(255, 255, 255));
        NPlato12.setText("Soupe à L’oignon");

        PPlato12.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato12.setForeground(new java.awt.Color(255, 255, 255));
        PPlato12.setText("$ 136 400");

        Plato12.setBorder(null);
        Plato12.setContentAreaFilled(false);
        Plato12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato12.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato12ItemStateChanged(evt);
            }
        });

        CPlato12.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato12.setForeground(new java.awt.Color(16, 19, 24));
        CPlato12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato12.setText("1");
        CPlato12.setBorder(null);
        CPlato12.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato12.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato12.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato12MouseClicked(evt);
            }
        });
        CPlato12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato12KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Plato12)
                            .addComponent(NPlato12)
                            .addComponent(PPlato12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato12)
                    .addComponent(CPlato12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setMaximumSize(new java.awt.Dimension(166, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(166, 255));

        VPlato10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Carta/Platos/Poêlée de Sots.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VPlato10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NPlato10.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        NPlato10.setForeground(new java.awt.Color(255, 255, 255));
        NPlato10.setText("Poêlée de Sots");

        PPlato10.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        PPlato10.setForeground(new java.awt.Color(255, 255, 255));
        PPlato10.setText("$ 362 300");

        Plato10.setBorder(null);
        Plato10.setContentAreaFilled(false);
        Plato10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check normal.png"))); // NOI18N
        Plato10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba.png"))); // NOI18N
        Plato10.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check arriba s.png"))); // NOI18N
        Plato10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/check seleccionado.png"))); // NOI18N
        Plato10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Plato10ItemStateChanged(evt);
            }
        });

        CPlato10.setFont(new java.awt.Font("Freestyle Script", 0, 18)); // NOI18N
        CPlato10.setForeground(new java.awt.Color(16, 19, 24));
        CPlato10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CPlato10.setText("1");
        CPlato10.setBorder(null);
        CPlato10.setMaximumSize(new java.awt.Dimension(20, 20));
        CPlato10.setMinimumSize(new java.awt.Dimension(20, 20));
        CPlato10.setPreferredSize(new java.awt.Dimension(20, 20));
        CPlato10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPlato10MouseClicked(evt);
            }
        });
        CPlato10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPlato10KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Plato10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPlato10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPlato10)
                            .addComponent(PPlato10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlato10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPlato10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Plato10)
                    .addComponent(CPlato10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Scrollp.setViewportView(Menu);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/vMenu normal.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(81, 56));
        jButton1.setMinimumSize(new java.awt.Dimension(81, 56));
        jButton1.setPreferredSize(new java.awt.Dimension(81, 56));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/vMenu presionado.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/vMenu arriba.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonesMenu/vMenu arriba.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(LabelPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Scrollp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Scrollp, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(PanelRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuP elec = new MenuP();
        elec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Plato1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato1ItemStateChanged
        int codigo = 2343;
        if (Plato1.isSelected()) {
            if (CPlato1.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato1.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato1.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato1ItemStateChanged

    private void Plato2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato2ItemStateChanged
        int codigo = 2792;
        if (Plato2.isSelected()) {
            if (CPlato2.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato2.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato2.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato2ItemStateChanged

    private void Plato3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato3ItemStateChanged
        int codigo = 9980;
        if (Plato3.isSelected()) {
            if (CPlato3.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato3.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato3.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato3ItemStateChanged

    private void Plato4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato4ItemStateChanged
        int codigo = 6236;
        if (Plato4.isSelected()) {
            if (CPlato4.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato4.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato4.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato4ItemStateChanged

    private void Plato5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato5ItemStateChanged
        int codigo = 7985;
        if (Plato5.isSelected()) {
            if (CPlato5.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato5.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato5.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato5ItemStateChanged

    private void Plato6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato6ItemStateChanged
        int codigo = 2850;
        if (Plato6.isSelected()) {
            if (CPlato6.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato6.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato6.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato6ItemStateChanged

    private void Plato7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato7ItemStateChanged
        int codigo = 5863;
        if (Plato7.isSelected()) {
            if (CPlato7.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato7.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato7.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato7ItemStateChanged

    private void Plato8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato8ItemStateChanged
        int codigo = 4496;
        if (Plato8.isSelected()) {
            if (CPlato8.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato8.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato8.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato8ItemStateChanged

    private void Plato9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato9ItemStateChanged
        int codigo = 4820;
        if (Plato9.isSelected()) {
            if (CPlato9.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato9.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato9.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato9ItemStateChanged

    private void Plato10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato10ItemStateChanged
        int codigo = 5177;
        if (Plato10.isSelected()) {
            if (CPlato10.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato10.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato10.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato10ItemStateChanged

    private void Plato11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato11ItemStateChanged
        int codigo = 3944;
        if (Plato11.isSelected()) {
            if (CPlato11.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato11.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato11.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato11ItemStateChanged

    private void Plato12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Plato12ItemStateChanged
        int codigo = 2117;
        if (Plato12.isSelected()) {
            if (CPlato12.getText().isEmpty()) {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), 1);
                CPlato12.setText("1");
            } else {
                ptr = agregarPlato(ptr, codigo, PlatoP.Buscarnombre(codigo), PlatoP.Buscarprecio(codigo), Integer.parseInt(CPlato12.getText()));
            }
            mostrarOrden(ptr);
        } else {
            ptr = QuitarPlato(ptr, codigo);
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_Plato12ItemStateChanged

    private void CPlato1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato1KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato1.setText("1");
        } else {
            CPlato1.setText("");
            CPlato1.setText("" + c);
        }
        if (Plato1.isSelected()) {
            actualizarPlato(ptr, 2343, Integer.parseInt(CPlato1.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato1KeyTyped

    private void CPlato1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato1MouseClicked
        CPlato1.setText("");
    }//GEN-LAST:event_CPlato1MouseClicked

    private void CPlato2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato2MouseClicked
        CPlato2.setText("");
    }//GEN-LAST:event_CPlato2MouseClicked

    private void CPlato2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato2KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato2.setText("1");
        } else {
            CPlato2.setText("");
            CPlato2.setText("" + c);
        }
        if (Plato2.isSelected()) {
            actualizarPlato(ptr, 2792, Integer.parseInt(CPlato2.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato2KeyTyped

    private void CPlato3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato3MouseClicked
        CPlato3.setText("");
    }//GEN-LAST:event_CPlato3MouseClicked

    private void CPlato3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato3KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato3.setText("1");
        } else {
            CPlato3.setText("");
            CPlato3.setText("" + c);
        }
        if (Plato3.isSelected()) {
            actualizarPlato(ptr, 9980, Integer.parseInt(CPlato3.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato3KeyTyped

    private void CPlato4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato4MouseClicked
        CPlato4.setText("");
    }//GEN-LAST:event_CPlato4MouseClicked

    private void CPlato4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato4KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato4.setText("1");
        } else {
            CPlato4.setText("");
            CPlato4.setText("" + c);
        }
        if (Plato4.isSelected()) {
            actualizarPlato(ptr, 6236, Integer.parseInt(CPlato4.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato4KeyTyped

    private void CPlato5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato5MouseClicked
        CPlato5.setText("");
    }//GEN-LAST:event_CPlato5MouseClicked

    private void CPlato5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato5KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato5.setText("1");
        } else {
            CPlato5.setText("");
            CPlato5.setText("" + c);
        }
        if (Plato5.isSelected()) {
            actualizarPlato(ptr, 7985, Integer.parseInt(CPlato5.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato5KeyTyped

    private void CPlato6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato6MouseClicked
        CPlato6.setText("");
    }//GEN-LAST:event_CPlato6MouseClicked

    private void CPlato6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato6KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato6.setText("1");
        } else {
            CPlato6.setText("");
            CPlato6.setText("" + c);
        }
        if (Plato6.isSelected()) {
            actualizarPlato(ptr, 2850, Integer.parseInt(CPlato6.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato6KeyTyped

    private void CPlato7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato7MouseClicked
        CPlato7.setText("");
    }//GEN-LAST:event_CPlato7MouseClicked

    private void CPlato7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato7KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato7.setText("1");
        } else {
            CPlato7.setText("");
            CPlato7.setText("" + c);
        }
        if (Plato7.isSelected()) {
            actualizarPlato(ptr, 5863, Integer.parseInt(CPlato7.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato7KeyTyped

    private void CPlato8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato8MouseClicked
        CPlato8.setText("");
    }//GEN-LAST:event_CPlato8MouseClicked

    private void CPlato8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato8KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato8.setText("1");
        } else {
            CPlato8.setText("");
            CPlato8.setText("" + c);
        }
        if (Plato8.isSelected()) {
            actualizarPlato(ptr, 4496, Integer.parseInt(CPlato8.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato8KeyTyped

    private void CPlato9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato9MouseClicked
        CPlato9.setText("");
    }//GEN-LAST:event_CPlato9MouseClicked

    private void CPlato9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato9KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato9.setText("1");
        } else {
            CPlato9.setText("");
            CPlato9.setText("" + c);
        }
        if (Plato9.isSelected()) {
            actualizarPlato(ptr, 4820, Integer.parseInt(CPlato9.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato9KeyTyped

    private void CPlato10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato10MouseClicked
        CPlato10.setText("");
    }//GEN-LAST:event_CPlato10MouseClicked

    private void CPlato10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato10KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato10.setText("1");
        } else {
            CPlato10.setText("");
            CPlato10.setText("" + c);
        }
        if (Plato10.isSelected()) {
            actualizarPlato(ptr, 5177, Integer.parseInt(CPlato10.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato10KeyTyped

    private void CPlato11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato11MouseClicked
        CPlato11.setText("");
    }//GEN-LAST:event_CPlato11MouseClicked

    private void CPlato11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato11KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato11.setText("1");
        } else {
            CPlato11.setText("");
            CPlato11.setText("" + c);
        }
        if (Plato11.isSelected()) {
            actualizarPlato(ptr, 3944, Integer.parseInt(CPlato11.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato11KeyTyped

    private void CPlato12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPlato12MouseClicked
        CPlato12.setText("");
    }//GEN-LAST:event_CPlato12MouseClicked

    private void CPlato12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPlato12KeyTyped
        char c = evt.getKeyChar();
        evt.consume();
        if (!Character.isDigit(c) || c == '0') {
            CPlato12.setText("1");
        } else {
            CPlato12.setText("");
            CPlato12.setText("" + c);
        }
        if (Plato12.isSelected()) {
            actualizarPlato(ptr, 2117, Integer.parseInt(CPlato12.getText()));
            mostrarOrden(ptr);
        }
    }//GEN-LAST:event_CPlato12KeyTyped
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MPlatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPlato1;
    private javax.swing.JTextField CPlato10;
    private javax.swing.JTextField CPlato11;
    private javax.swing.JTextField CPlato12;
    private javax.swing.JTextField CPlato2;
    private javax.swing.JTextField CPlato3;
    private javax.swing.JTextField CPlato4;
    private javax.swing.JTextField CPlato5;
    private javax.swing.JTextField CPlato6;
    private javax.swing.JTextField CPlato7;
    private javax.swing.JTextField CPlato8;
    private javax.swing.JTextField CPlato9;
    private javax.swing.JButton CocinaAD;
    private javax.swing.JButton CocinaAD1;
    private javax.swing.JLabel LabelOrden;
    private javax.swing.JLabel LabelPlatos;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel NPlato1;
    private javax.swing.JLabel NPlato10;
    private javax.swing.JLabel NPlato11;
    private javax.swing.JLabel NPlato12;
    private javax.swing.JLabel NPlato2;
    private javax.swing.JLabel NPlato3;
    private javax.swing.JLabel NPlato4;
    private javax.swing.JLabel NPlato5;
    private javax.swing.JLabel NPlato6;
    private javax.swing.JLabel NPlato7;
    private javax.swing.JLabel NPlato8;
    private javax.swing.JLabel NPlato9;
    private javax.swing.JList<String> OrdenPlatos;
    private javax.swing.JLabel PPlato1;
    private javax.swing.JLabel PPlato10;
    private javax.swing.JLabel PPlato11;
    private javax.swing.JLabel PPlato12;
    private javax.swing.JLabel PPlato2;
    private javax.swing.JLabel PPlato3;
    private javax.swing.JLabel PPlato4;
    private javax.swing.JLabel PPlato5;
    private javax.swing.JLabel PPlato6;
    private javax.swing.JLabel PPlato7;
    private javax.swing.JLabel PPlato8;
    private javax.swing.JLabel PPlato9;
    private javax.swing.JPanel PanelRojo;
    private javax.swing.JCheckBox Plato1;
    private javax.swing.JCheckBox Plato10;
    private javax.swing.JCheckBox Plato11;
    private javax.swing.JCheckBox Plato12;
    private javax.swing.JCheckBox Plato2;
    private javax.swing.JCheckBox Plato3;
    private javax.swing.JCheckBox Plato4;
    private javax.swing.JCheckBox Plato5;
    private javax.swing.JCheckBox Plato6;
    private javax.swing.JCheckBox Plato7;
    private javax.swing.JCheckBox Plato8;
    private javax.swing.JCheckBox Plato9;
    private javax.swing.JScrollPane Scrollp;
    private javax.swing.JLabel VPlato1;
    private javax.swing.JLabel VPlato10;
    private javax.swing.JLabel VPlato11;
    private javax.swing.JLabel VPlato12;
    private javax.swing.JLabel VPlato2;
    private javax.swing.JLabel VPlato3;
    private javax.swing.JLabel VPlato4;
    private javax.swing.JLabel VPlato5;
    private javax.swing.JLabel VPlato6;
    private javax.swing.JLabel VPlato7;
    private javax.swing.JLabel VPlato8;
    private javax.swing.JLabel VPlato9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
