package biblioteka;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Predstavlja knjigu u biblioteci. 
 * 
 * Svaka knjiga ima naslov, ISBN broj, listu autora izdavaca i izdanje.
 * 
 * @author Sara
 * @version 1.0
 *
 */
public class Knjiga {
	/**
	 * Naslov knjige kao String
	 */
	private String naslov;
	
	/**
	 * ISBN broj knjige.
	 */
	private long isbn;
	/**
	 * Lista autora knjige.
	 */
	private List<Autor> autori = new ArrayList<Autor>();
	/**
	 * Naziv izdavaca knjige.
	 */
	private String izdavac;
	/**
	 * Broj izdanja knjige.
	 */
	private int izdanje;

	/**
	 * Vraca naslov knjige
	 * 
	 * @return naslov knjige kao String.
	 */
	public String getNaslov() {
		return naslov;
	}

	/**
	 * Postavlja naslov knjige na unetu vrednost.
	 * 
	 * @param naslov Novi naslov knjige.
	 * 
	 * @throws java.lang.NullPointerException Ako je naslov null.
	 * @throws java.lang.IllegalArgumentException Ako je naslov prazan String.
	 */
	public void setNaslov(String naslov) {
		if (naslov == null) {
			throw new NullPointerException("NASLOV NE SME BITI NULL");
		}
		if (naslov.isEmpty()) {
			throw new IllegalArgumentException("NASLOV NE SME BITI PRAZAN");
		}
		this.naslov = naslov;
	}

	/**
	 * Vraca ISBN broj knjige
	 * @return ISBN broj kao long.
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * Postavlja ISBN broj knjige
	 * 
	 * @param isbn Novi ISBN broj.
	 * 
	 * @throws java.lang.IllegalArgumentException Ako je ISBN broj manji ili jednak nuli.
	 */
	public void setIsbn(long isbn) {
		if (isbn <= 0) {
			throw new IllegalArgumentException("ISBN MORA BITI VECI OD NULE");
		}
		this.isbn = isbn;
	}

	/**
	 * Vraca listu autora knjige.
	 * 
	 * @return lista autora.
	 */
	public List<Autor> getAutori() {
		return autori;
	}

	/**
	 * Postavlja listu autora knjige.
	 * 
	 * @param autori Lista autora.
	 */
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}

	/**
	 * Vraca naziv izdavaca knjige.
	 * 
	 * @return Izdavac kao String.
	 */
	public String getIzdavac() {
		return izdavac;
	}

	/**
	 * Postavlja izdavaca knjige.
	 * 
	 * @param izdavac Novi izdavac knjige
	 * 
	 * @throws java.lang.NullPointerException Ako je izdavac null.
	 * @throws java.lang.IllegalArgumentException Ako je izdavac prazan String.
	 */
	public void setIzdavac(String izdavac) {
		if (izdavac == null) {
			throw new NullPointerException("IZDAVAC NE SME BITI NULL");
		}
		if (izdavac.isEmpty()) {
			throw new IllegalArgumentException("IZDAVAC NE SME BITI PRAZAN");
		}
		this.izdavac = izdavac;
	}

	/**
	 * Vraca broj izdanja knjige.
	 * 
	 * @return Broj izdanja kao int.
	 */
	public int getIzdanje() {
		return izdanje;
	}

	/**
	 * Postavlja broj izdanja knjige.
	 * 
	 * @param izdanje Novo izdanje knjige.
	 * 
	 * @throws java.lang.IllegalArgumentException Ako je izdanje manje ili jednako nuli.
	 */
	public void setIzdanje(int izdanje) {
		if (izdanje <= 0) {
			throw new IllegalArgumentException("IZDANJE MORA BITI VECE OD NULE");
		}
		this.izdanje = izdanje;
	}

	/**
	 * Vraca String sa svim podacima o knjizi.
	 * 
	 * @return Svi podaci o knjizi u formatu "Knjiga [naslov = #####, isbn=#####, autori = #####, izdavac=####, izdanje=#### ]"
	 */
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	/**
	 * Poredi dve knjige po isbn broju.
	 * 
	 * @param obj Druga knjiga sa kojom se poredi.
	 * 
	 * @return
	 * <ul>
	 * <li><b>true</b> - ako su oba objekta klase Knjiga sa istim isbn brojem ili se nalaze na istoj adresi.</li>
	 * <li><b>false</b> - ako je drugi objekat null, razlicite klase ili ako isbn brojevi nisu isti.</li>
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return isbn == other.isbn;
	}

}
