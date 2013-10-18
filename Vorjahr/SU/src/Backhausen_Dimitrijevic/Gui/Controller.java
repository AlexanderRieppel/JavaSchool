package Backhausen_Dimitrijevic.Gui;


/**
 * Das Ist der Controller der die Komunikation der Zeichnung, der ZeichnenGui und der Hinzuf�genGui regelt.
 * @author Dominik
 * 
 */
public class Controller {
	public static void main(String[] args){
		new Controller();
	}
	
	private GuiHinzu gh;
	private DanielGui dg;
	private Zeichnung z;
	/**
	 * DefaultKonstrutor
	 */
	public Controller(){
		z = new Zeichnung();
		gh = new GuiHinzu(this);
		dg = new DanielGui(this,z);
		new MyFrame(dg);
	}
	/**
	 * Diese Methode �ffnet die Hinzuf�genGui
	 */
	public void openEdit(){
		new NewFrame(gh);
	}
	/**
	 * Diese Methode F�gt eine igur der Zeichnung hinzu
	 * @param f die Figur die der Zeichnung hinzugef�gt werden soll
	 */
	public void addfigur(Figuren f){
		z.addFigure(f);
		z.repaint();
		dg.repaint();
		dg.addFig(z.getList());
		gh.refresh();
		dg.addLogger("Hinzugef�gt: \n" + f.toString() + "\n");
	}
	/**
	 * Diese Methode l�scht eine Figur von der Zeichung
	 * @param index
	 */
	public void deletef(Integer index){
		z.deleteFigur(index);
		dg.addFig(z.getList());
		z.repaint();
		dg.repaint();
		gh.refresh();
		dg.addLogger("Gel�scht! \n");
	}
	/**
	 * Diese Methode bereitet f�r das Editieren einer Figur vor
	 * @param i der Index der Figur in der Figuren Liste die Editiert werden soll
	 */
	public void setEdit(int i){
		gh.setAll(i,z.getList().get(i));
		gh.refresh();
	}
	/**
	 * Diese Methode editiert eine Figur in Zeichnung
	 * @param i der Index der Figur in der FigurenListe von Zeichung
	 * @param f die Figur mit den neuen Werten
	 */
	public void setfigur(int i, Figuren f){
		z.getList().set(i, f);
		gh.refresh();
		z.repaint();
		dg.addLogger("Ge�ndert auf: \n" + f.toString() + "\n");
	}
}
