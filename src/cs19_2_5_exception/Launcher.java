package cs19_2_5_exception;

import java.util.Scanner;

public class Launcher {

    static void pingPong() throws PingPongException {

	System.out.println("Methode 'pingPong' wurde aufgerufen.");
	throw new PingPongException();
    }
    
    static void ping() throws PingException {
	
	System.out.println("Methode 'ping' wurde aufgerufen.");
	throw new PingException();
    }
    
    static void pong() throws PongException {

	System.out.println("Methode 'pong' wurde aufgerufen.");
	throw new PongException();
    }
    
    static void showMenu() throws PingPongException, PingException, PongException {

	System.out.println("Menue");
	System.out.println("1 – Ping");
	System.out.println("2 – Pong");
	System.out.println("3 – PingPong");
	System.out.println("");
	System.out.println("Ihre Wahl:");
	
	Scanner s = new Scanner(System.in);
	int i = s.nextInt();
	s.close();
	
	switch (i) {

	case 1:
	    Launcher.ping();
	    break;

	case 2:
	    Launcher.pong();
	    break;

	case 3:
	    Launcher.pingPong();
	    break;

	default:
	    System.err.println("Eingabefehler!");
	}
    }

    public static void main(String[] args) {

	try {

	    Launcher.showMenu();
	
	} catch (PingException e) {

	    System.out.println("PingException aufgetreten");

	} catch (PongException e) {

	    System.out.println("PongException aufgetreten");

	} catch (PingPongException e) {

	    System.out.println("PingPongException aufgetreten");
	}
    }
}
