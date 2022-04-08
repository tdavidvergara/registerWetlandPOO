package model ;

import java.time.Year;

public class App {
    public static final int MAX = 80;
    //Relacion 
    private  WetLand[] humedales ;



    public App() {
        humedales = new WetLand [MAX];
    }

    public WetLand searchWetLand(String nameWetLand){
        boolean redFlag = true ;
        WetLand objEncontrado=null;
        for (int i=0; i< MAX && redFlag != false; i++){
            if (humedales[i]!=null && humedales[i].getNameWetland().equals(nameWetLand)){
                objEncontrado=humedales[i];
                redFlag = false;

            }
        }
        return objEncontrado ;

        
    }
    /*public String registerEvent(String typeEvent, String eventRealizer, double value, String description, int option){
        boolean flag = true ;
        for(int i=0; i<MAX && flag!= false; i++){
            if(humedales[i]!=null){
                humedales[i].registerEvent(typeEvent, eventRealizer, value, description,option) ;
                flag =true ;

            }

        }
        return "event registered" ;

    }*/
    public String registerEvent(String place, String eventRealizer, double value, String description, int option, int year){
        String mensaje = "error" ;
        WetLand objWet = searchWetLand(place);
        if (objWet!=null){
            objWet.registerEvent(place, eventRealizer, value, description,option, year) ;
            mensaje = "the event was added" ;
        }
        return mensaje ;

    }

    public String addSpecie(String nameWetLand, String nameSpecie, String scientificName, String migratory, int option1){
        String message="Error";
        WetLand objWet=searchWetLand(nameWetLand);
        if (objWet!=null){
            objWet.addSpecie(nameWetLand, nameSpecie, scientificName, migratory, option1) ;
            message="the specie was added" ;
        }
        return message;
    }

    public boolean existWetLand(String nameWetland){
        boolean continuar = false;
        for(int i=0;i<MAX && continuar==false;i++){
            if(humedales[i]!=null && humedales[i].getNameWetland().equals(nameWetland))  {
                continuar = true ;
            }
            
        }
        return continuar ;
    }

    public String  addWetLand(String nameWetland, String ubication, int km, String photo, String declaration, double likes){
        boolean continue1 = true ;
        boolean existeWetLand=existWetLand(nameWetland) ;
        String mensaje= "" ;
        if(existeWetLand==true) {
            mensaje = "this wetland already exist" ;
            continue1 = false;
        }else{
            for (int i=0; i<MAX && continue1 !=false; i++){
                if(humedales[i]==null){
                    humedales[i]= new WetLand(nameWetland, ubication,km, photo,declaration, likes) ;
                    continue1 = false ;
                    mensaje = "wetland registered" ;
                }
            }

        }
        return mensaje ;

    }
    
    public String showInfo(String nameWetland){
        String message = "";
        boolean bandera = true ;
        for(int i=0; i<MAX && bandera != false; i++){
            if(humedales[i]!=null && humedales[i].getNameWetland().equalsIgnoreCase(nameWetland)){
            message = "The wetland called "+humedales[i].getNameWetland() +" is located in "+humedales[i].getUbication()+" with an area of "+humedales[i].getKm()+ "km^2, with this URL: "+humedales[i].getPhoto()+", with this delcaration: "+ humedales[i].getDeclaration() +" has this quantity of likes: "+humedales[i].getLikes() ;
            bandera= false ;
           }

        }
        return message;
        
    }
    
    public int registerLikes(String nameWetLand) {
        boolean flag = true;
        int aux= 0;
        for (int i =0; i<MAX && flag != false && humedales[i]!=null ;i++){
            if (humedales[i].getNameWetland().equalsIgnoreCase(nameWetLand)){
                aux=i ;
                flag = false;
            }
        }

        return aux;
    }
    public String addLikes(double likes, int aux){
        String mensajito = "";
        double likess = humedales[aux].getLikes()+likes ;
        humedales[aux].setLikes(likess);
        mensajito = "se han guardado " ;
        return mensajito ;
    }

    public String totalLikes(){
        double counterLikes =  0;
        for (int i=0; i<MAX && humedales[i]!=null ; i++){
            counterLikes = humedales[i].getLikes()+counterLikes;

        }
        return  "the total amount of collected money is  "+(counterLikes*25)/100;
    }
    public String mayorLikes() {
        String mayor = "" ;
        double mayorL = 0;
        for (int i=0; i<MAX && humedales[i]!=null; i++){
            if (humedales[i].getLikes()>mayorL){
                mayorL=humedales[i].getLikes() ;
                mayor = humedales[i].getNameWetland() ;


            }

        }





        return "el humedal con más likes es "+mayor+ " con una cantidad de "+mayorL;
    }


    /*public int counterExistW(){
        int counter = 0;
        for (int i = 0; i < humedales.length && humedales[i]!= null; i++) {
            counter++;
        }
        return counter;

    }
    public String maintance(int year,int position){
        String menssage ="";
        menssage = "El humedal"+humedales[position].getNameWetland()+"ha tenido "+humedales[position].counterEvents(year)+" mantenimientos.";
        return menssage;

    }
    */
    public String lessFloraW(Specie [] especies) {
        int mayor= 1000000; 
        String name = "" ;
        for (int i=0; i<MAX && humedales[i]!= null; i++){
            int contador = 0; 
            for (int j=0; j<100 ; j++){
                if (especies[j].getMethodEnum()==TypeSpecie.TERRESTIALFLORA || especies[j].getMethodEnum()==TypeSpecie.ACUATICFLORA ) {
                    contador++ ;
                }
            }
            if (contador<mayor){
                mayor = contador ;
                name = humedales[i].getNameWetland() ;          
            }
        
        }
        return "the wetland with the less flora is: "+name ;
    }
    public String moreFauna (Specie [] especies){
        int menor = -1 ;
        String name = "" ;
        for (int i=0; i<MAX && humedales[i]!= null; i++){
            int contador = 0; 
            for (int j=0; j<100 && especies[j]!=null; j++){
            if(especies[i].getMethodEnum()==TypeSpecie.BIRD || especies[i].getMethodEnum()==TypeSpecie.MAMMAL || especies[i].getMethodEnum()==TypeSpecie.ACUATICFAUNA) {
                contador ++ ;
                if (contador>menor){
                    menor = contador ;
                    name =humedales[i].getNameWetland() ;
                }


            }
        }
    }


        return "the wetland with the most quantity of fauna is: " +name;

    }
}
      

 












    
