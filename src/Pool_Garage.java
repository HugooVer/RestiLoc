import java.util.Date;

public class Pool_Garage extends Expertise{

    public Pool_Garage(String codeDossier, Date dateHeureRDV, String lieuRDV, String adresse, String immatriculation, String marque, String model, Indisponibilite uneIndispo) {
        super(codeDossier, dateHeureRDV, lieuRDV, adresse, immatriculation, marque, model, uneIndispo);
    }
}
