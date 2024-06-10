package test;

import enumeraciones.Dias;
import java.util.logging.Logger;  // Importar Logger
import java.util.logging.Level;   // Importar Level
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;
public class TestEnumeracion {
  private static final Logger logger = Logger.getLogger(TestEnumeracion.class.getName());
  
  
  public static void main(String[] args) {
    ConsoleHandler handler = new ConsoleHandler();
    logger.addHandler(handler);
    logger.setLevel(Level.ALL); // Mostrar todos los niveles de mensajes
    handler.setLevel(Level.ALL); // Asegurarse de que el handler también muestre todos los niveles

    System.out.println("Lunes: " + Dias.LUNES);

    System.out.println(".........................................");
    
    // Ejemplos de mensajes de registro con diferentes niveles
    logger.severe("Mensaje SEVERE");
    logger.warning("Mensaje WARNING");
    logger.info("Mensaje INFO");
    logger.config("Mensaje CONFIG");
    logger.fine("Mensaje FINE");
    logger.finer("Mensaje FINER");
    logger.finest("Mensaje FINEST");
  }



private static void indicarDiaSemana(Dias dias){

}

}
