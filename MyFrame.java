import javax.swing.JFrame;                                  // import biblioteki klasy JFrame

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 1L;        // xt1: nie wiem co to..
    public MyFrame() {                                      // tworzymy publiczny i bezparametrowy konstruktor
        super("Tomi's Java");                              // tytuł okna wywołany instrukcją super()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // metoda zamykająca okno
        setVisible(true);                                   // wyświetlenie ramki na ekranie metodą setVisible()
        setLocation(700,400);                               // położenie na ekranie
        setSize(500,300);                                   // rozmiar ramki
        setResizable(false);                                // nie można zmieniać rozmiaru ramki
    }
}