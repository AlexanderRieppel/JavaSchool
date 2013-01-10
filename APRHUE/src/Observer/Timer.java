package Observer;

import java.sql.Time;
import java.util.Date;
import javax.swing.JPanel;

/**
 * Klasse gibt aktuelle Uhrzeit mit Hilfe eines Threads zurück
 * 
 * @author Rieppel Alexander
 * @version 10.01.2013
 */
public class Timer extends JPanel implements Runnable {

	private Date date;
	private Time time;
	private Thread thr;

	/**
	 * Konstruktor in dem das Label initialisiert wird und der Font zugewiesen
	 */
	public Timer() {
		start();
	}

	/**
	 * Holt die Zeit
	 */
	public void getDate() {
		time = new Time(date.getTime());
	}

	/**
	 * Startet den Thread
	 */
	public void start() {
		if (thr == null) {
			thr = new Thread(this);
			thr.start();
		}
	}

	/**
	 * Code des Threads
	 */
	@Override
	public void run() {
		while (true) {
			date = new Date();
			getDate();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Gibt die aktuelle Zeit zurück
	 * 
	 * @return time
	 */
	public Time getCurrent() {
		return time;
	}
}
