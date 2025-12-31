package codigo;

/**
 * @author jojo
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.border.Border;

public class Ventana extends JFrame {
    
    private JLabel evaluaciones, prioridad, popular, recomendado, valientes, migajeros, linea, notas, ponderacion, requerido, resumenText;
    private JTextField numero, prioridadCampo;
    private JTextArea notasArea, ponderacionArea, requeridoArea, resumenArea;
    private JButton ninguna, reciente, mayor, menor, calcular, borrar, formatear, guia, contactar;
    private Font letra1, letra2, letra3, letra4, letra5;
    private JScrollPane sp;
    
    public Ventana(){
        super("How Much I Need");
        this.setSize(800, 700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);        
        setLayout(null);
        
        letra1 = new Font("Comic Sans MS", Font.BOLD, 15);
        letra2 = new Font("Tahoma",Font.BOLD, 13);
        letra3 = new Font("Comic Sans MS", Font.BOLD, 20);
        letra4 = new Font("Comic Sans MS", Font.BOLD, 13);
        letra5 = new Font("Comic Sans MS", Font.BOLD, 10);
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border border2 = BorderFactory.createLineBorder(Color.BLUE, 2);
        
        evaluaciones = new JLabel("Evaluaciones:");
        evaluaciones.setBounds(300, 14, 115, 15);
        evaluaciones.setFont(letra1);
        add(evaluaciones);
        
        numero = new JTextField();
        numero.setBounds(400, 10, 70, 24);
        numero.setFont(letra1);
        numero.setBorder(border2);
        add(numero);
        
        prioridad = new JLabel("Prioridad de las evaluaciones:");
        prioridad.setBounds(180, 50, 300, 20);
        prioridad.setFont(letra1);
        add(prioridad);
        
        prioridadCampo = new JTextField();
        prioridadCampo.setBounds(400, 48, 200, 24);
        prioridadCampo.setFont(letra1);
        prioridadCampo.setBorder(border2);
        add(prioridadCampo);
        
        ninguna = new JButton("Ninguna");
        ninguna.setBounds(20, 80, 90, 30);
        ninguna.setFont(letra2);
        ninguna.setBackground(Color.PINK);
        ninguna.setBorder(border);
        add(ninguna);
        
        reciente = new JButton("Por fecha más reciente");
        reciente.setBounds(140, 80, 200, 30);
        reciente.setFont(letra2);
        reciente.setBackground(Color.PINK);
        reciente.setBorder(border);
        add(reciente);
        
        mayor = new JButton("Por mayor ponderación");
        mayor.setBounds(360, 80, 190, 30);
        mayor.setFont(letra2);
        mayor.setBackground(Color.PINK);
        mayor.setBorder(border);
        add(mayor);
        
        menor = new JButton("Por menor ponderación");
        menor.setBounds(580, 80, 190, 30);
        menor.setFont(letra2);
        menor.setBackground(Color.PINK);
        menor.setBorder(border);
        add(menor);
        
        popular = new JLabel("(Popular)");
        popular.setBounds(35, 110, 90, 30);
        popular.setFont(letra2);
        add(popular);
        
        recomendado = new JLabel("(Recomendado)");
        recomendado.setBounds(190, 110, 130, 30);
        recomendado.setFont(letra2);
        add(recomendado);
        
        valientes = new JLabel("(Valientes)");
        valientes.setBounds(420, 110, 130, 30);
        valientes.setFont(letra2);
        add(valientes);
        
        migajeros = new JLabel("(Migajeros)");
        migajeros.setBounds(640, 110, 130, 30);
        migajeros.setFont(letra2);
        add(migajeros);
        
        linea = new JLabel("----------------------------------------------------------------------------------------------------------------------------------");
        linea.setBounds(5, 150, 800, 10);
        linea.setFont(letra2);
        add(linea);
        
        notas = new JLabel("Notas");
        notas.setBounds(45, 160, 130, 30);
        notas.setFont(letra1);
        add(notas);
        
        notasArea = new JTextArea();
        notasArea.setBounds(30, 200, 75, 320);
        notasArea.setFont(letra3);
        notasArea.setBorder(border);
        add(notasArea);
        
        ponderacion = new JLabel("Ponderación");
        ponderacion.setBounds(150, 160, 130, 30);
        ponderacion.setFont(letra1);
        add(ponderacion);
        
        ponderacionArea = new JTextArea();
        ponderacionArea.setBounds(155, 200, 75, 320);
        ponderacionArea.setFont(letra3);
        ponderacionArea.setBorder(border);
        add(ponderacionArea);
        
        requerido = new JLabel("Requerido");
        requerido.setBounds(285, 160, 130, 30);
        requerido.setFont(letra1);
        add(requerido);
        
        requeridoArea = new JTextArea();
        requeridoArea.setBounds(280, 200, 75, 320);
        requeridoArea.setFont(letra3);
        requeridoArea.setBorder(border);
        add(requeridoArea);
        
        calcular = new JButton("Calcular");
        calcular.setBounds(30, 530, 325, 50);
        calcular.setFont(letra3);
        calcular.setBackground(Color.CYAN);
        calcular.setBorder(border);
        add(calcular);
        
        borrar = new JButton("Borrar");
        borrar.setBounds(30, 590, 160, 50);
        borrar.setFont(letra3);
        borrar.setBackground(Color.yellow);
        borrar.setBorder(border);
        add(borrar);
        
        formatear = new JButton("Formatear");
        formatear.setBounds(200, 590, 155, 50);
        formatear.setFont(letra3);
        formatear.setBackground(Color.MAGENTA);
        formatear.setBorder(border);
        add(formatear);
        
        guia = new JButton("Cómo usar la app?");
        guia.setBounds(400,590,200, 30);
        guia.setFont(letra2);
        guia.setBorder(border);
        add(guia);
        
        contactar = new JButton("Contáctanos!");
        contactar.setBounds(620, 590, 150, 30);
        contactar.setFont(letra2);
        contactar.setBorder(border);
        add(contactar);
        
        resumenText = new JLabel("-----En Resumen Necesitas-----");
        resumenText.setBounds(470,170,400, 20);
        resumenText.setFont(letra1);
        add(resumenText);
        
        resumenArea = new JTextArea();
        sp = new JScrollPane(resumenArea);
        sp.setBounds(430, 200, 330, 320);
        resumenArea.setFont(letra4);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setBorder(border);
        add(sp);
    }
}
