
public class GestioneDip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dipendente op1 = new Dipendente(123, Dipartimento.PRODUZIONE);
		Dipendente op2 = new Dipendente(254, Dipartimento.PRODUZIONE);
		Dipendente imp3 = new Dipendente(890, 1500, 35, Livello.IMPIEGATO , Dipartimento.AMMINISTRAZIONE);
		Dipendente dir4 = new Dipendente(993, 2500, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		op1.stampaDatiDipendente();
		op1.promuovi();
		System.out.println("Dopo la promzione, il nuovo livello della matricola " + op1.getMatricola() + " è " + op1.getLivello());
	
		op2.stampaDatiDipendente();
		
		imp3.stampaDatiDipendente();
		imp3.promuovi();
		System.out.println("Dopo la promozione, il nuovo livello della matricola " + imp3.getMatricola() + " è " + imp3.getLivello());
		
		dir4.stampaDatiDipendente();
		
		System.out.println("\n********************************************************************************");
		System.out.println();
		System.out.println("Con uno straoridinario di 5 ore, lo stipendio della matricola " + op1.getMatricola() + " " + op1.getLivello() +  " passa a " + Dipendente.calcolaPagaStraordinari(op1, 5));
		System.out.println("Con uno straoridinario di 5 ore, lo stipendio della matricola " + op2.getMatricola() + " " + op2.getLivello() +  " passa a " + Dipendente.calcolaPagaStraordinari(op2, 5));
		System.out.println("Con uno straoridinario di 5 ore, lo stipendio della matricola " + imp3.getMatricola() + " " + imp3.getLivello() +  " passa a " + Dipendente.calcolaPagaStraordinari(imp3, 5));
		System.out.println("Con uno straoridinario di 5 ore, lo stipendio della matricola " + dir4.getMatricola() + " " + dir4.getLivello() +  " passa a " + Dipendente.calcolaPagaStraordinari(dir4, 5));
		System.out.println();
		System.out.println("TOTALE");
		System.out.println("La somma totale di tutti gli stipendi dei dipenti è " + (op1.getStipendio()+op2.getStipendio()+imp3.getStipendio()+dir4.getStipendio()));
	}

}
