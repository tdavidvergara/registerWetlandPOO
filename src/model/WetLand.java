package model;

public class WetLand {
    public static final int MAX = 100;
    private String nameWetland ;
    private String ubication ;
    private int km; 
    private String photo ;
    private String declaration ;
    private double likes;
    //Relaciones
    private  Specie[] especies ;
    private  Event[] eventos ;


    
    public WetLand(String nameWetland, String ubication, int km, String photo, String declaration, double likes){
    this.nameWetland = nameWetland;
    this.ubication= ubication ;
    this.km = km;
    this.photo = photo;
    this.declaration = declaration;
    this.likes= likes ;
    especies = new Specie [MAX] ;
    eventos = new Event[MAX];
    }


    public String getUbication() {
        return ubication;
    }
    public Specie[] especies () {
        return especies ;
    }
    public Event[] eventos(){
        return eventos ;
    }
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getNameWetland() {
        return nameWetland;
    }
    public String getDeclaration() {
        return declaration;
    }
    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public void setNameWetland(String nameWetland) {
        this.nameWetland = nameWetland;
    }
    public void setLikes(double likes){
        this.likes = likes ;
    }
    public double getLikes() {
        return this.likes;
        
    }
    public String addSpecie(String nameWetLand, String nameSpecie, String scientificName, String migratory, int option1){
        boolean redFlag = true ;
        String mensaje1 = "the specie was registeres succesfully" ;
        for (int i=0; i< MAX && redFlag != false; i++){
            if (especies[i]!=null){
                especies[i] = new Specie(nameWetLand, nameSpecie, scientificName, migratory, option1) ;
                redFlag = false;

            }
        }
        return mensaje1 ;
    }
    public String registerEvent(String place, String eventRealizer, double value, String description, int option,int year){
        boolean flag = true ;
        String mensaje2 = "event registered" ;
        for(int i=0; i<MAX && flag!= false; i++){
            if(eventos[i]==null){
                eventos[i] = new Event(place, eventRealizer, value, description, option, year) ;
                flag =true ;

            }

        }
        return mensaje2 ;

    }

    /*public int counterEvents(int year){
        int counter = 0;
        for (int i = 0; i < eventos.length&&eventos[i]!= null; i++){
            if(eventos[i].getTypeEvent()==TypeEvent.MAINTANCE&&eventos[i].getYear()==year){
                counter++;
            }
            
        }

        return counter;


    }
    public int amountMaintance(int year){
        int aux = 0; 
        for (int i=0; i< MAX && eventos[i]!=null; i++){
            if (eventos[i].getTypeEvent()==TypeEvent.MAINTANCE){
                aux++;
            }
        }


        return aux ;
    }
    */


    public Specie[] getEspecies() {
        return especies;
    }


    public void setEspecies(Specie[] especies) {
        this.especies = especies;
    }


    public Event[] getEventos() {
        return eventos;
    }


    public void setEventos(Event[] eventos) {
        this.eventos = eventos;
    }


    
}
