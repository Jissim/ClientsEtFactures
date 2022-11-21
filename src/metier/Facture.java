package metier;

import java.time.LocalDate;

public class Facture
{
	private int montant;
	private LocalDate date;
	private Client client;
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	public Facture(int montant,Client client)
	{
		this.client=client;
		this.montant=montant;
		this.date =LocalDate.now();
	}
	public Client getClient()
	{
		return null;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return 0;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return true;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return null;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}