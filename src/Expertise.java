import java.util.Date;

public abstract class Expertise {
    private String codeDossier;
    private Date dateHeureRDV;
    private String lieuRDV;
    private String adresse;
    private String immatriculation;
    private String marque;
    private String model;
    private Indisponibilite uneIndispo;

    public Expertise(String codeDossier, Date dateHeureRDV, String lieuRDV, String adresse, String immatriculation, String marque, String model, Indisponibilite uneIndispo) {
        this.codeDossier = codeDossier;
        this.dateHeureRDV = dateHeureRDV;
        this.lieuRDV = lieuRDV;
        this.adresse = adresse;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.model = model;
        this.uneIndispo = uneIndispo;
    }
}
