/*
    MyFrame.java
*/

import javax.swing.JFrame;      // import biblioteki klasy JFrame
import javax.swing.JButton;     // przyciski: w pakiecie swing klasa JButton
import java.awt.FlowLayout;     // dodanie zarządcy rozkładu (Layout Manager)
import java.awt.event.*;        
import java.util.Date;

public class MyFrame extends JFrame implements ActionListener {    // + implementacja interfejsu ActionListener
    private static final long serialVersionUID = 1L;        // xt1: nie wiem co to..
    public MyFrame() {                                      // tworzymy publiczny i bezparametrowy konstruktor
        super("Tomi's Java");                               // tytuł okna wywołany instrukcją super()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // metoda zamykająca okno
        setLocation(700,400);                               // położenie na ekranie
        setSize(500,300);                                   // rozmiar ramki
        setResizable(false);                                // nie można zmieniać rozmiaru ramki
        setLayout(new FlowLayout(FlowLayout.CENTER));       // konstruktor
    
        JButton button_1 = new JButton("Podaj datę");
        JButton button_2 = new JButton("Button 2");
        JButton button_3 = new JButton("Button 3");
        
        add(button_1);
        
        // button_1 jest źródłem zdarzeń. w momencie kliknięcia zostaje wysłane zdarzenie które musi ktoś odebrać.
        // w tym celu musimy dodajemy słuchacza zdarzeń
        // this oznacza że tym słuchaczem zdarzeń jest ramka
        // zdarzenie zostaje przechwycone przez ramkę i zostaje wykonana metoda actionPerformed()
        button_1.addActionListener(this);

        add(button_2);
        add(button_3);
        
        // add(new JButton("Button 1"));                       
        // add(new JButton("Button 2"));
        // add(new JButton("Button 3"));
       
        setVisible(true);                                   // wyświetlenie ramki na ekranie metodą setVisible()
    }

    /*
    klasa MyFrame musi implementować metodę actionPerformed()
    */
    @Override
        public void actionPerformed(ActionEvent e) {   // argumentem metody jest obiekt ActionEvent
            // ActionEvent jest to obiekt zdarzenia który jest wysyłany przez przycisk w momencie kliknięcia do słuchacza zdarzeń
            
            // następnie definicja tego co ma się stać w momencie kliknięcia przycisku
            System.out.println(new Date());      // tworzymy obiekt Date który wypisze w konsoli aktualną datę
        }
}