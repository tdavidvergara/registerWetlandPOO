package ui;
import java.util.Scanner;
import java.lang.StackWalker.Option;
import java.time.LocalDate;
import model.* ;
public class MainTarea{
    public static  Scanner lector = new Scanner (System.in) ;
    public static void main (String [] args){
        App objApp = new App() ;
        boolean flag = false ;
        while(!flag){
        System.out.println("(1) Create wetLand") ;
        System.out.println("(2) Register a new species in the wetland") ;
        System.out.println("(3) Register an event in the wetland  ") ;
        System.out.println("(4) See the quiantity of maintance in a year") ;
        System.out.println("(5) wetland with less flora") ;
        System.out.println("(6) to see in what wetland is the species ") ;
        System.out.println("(7) display the info of all wetlands including the likes") ;
        System.out.println("(8) name of the wetland with the highest quantity of fauna:") ;
        System.out.println("(9) agregar likes") ;
        System.out.println("(10) show likes") ;
        System.out.println("(11) wetland with the most quantity of likes") ;
        System.out.println("(12) finish") ;
        int respuesta = lector.nextInt() ;
        lector.nextLine() ;

        switch(respuesta){
            case 1: createWet(objApp) ;
            break; 
            case 2: newSpecie(objApp) ;
            break ;
            case 3: newEvent(objApp) ;
            break ;
            case 4: //quantityMaintance(objApp) ;
            break ;
            case 5: lessFLora(objApp) ;
            break ;
            case 6:
            break ;
            case 7:show(objApp); ;
            break;
            case 8:
            break ;
            case 9: likes(objApp) ;
            break;
            case 10: showMeLikes(objApp) ;
            break; 
            case 11: wer(objApp)  ;
            break;
            case 12:
            System.out.println("thanks for using our service");
            flag=true;
            break;
        }

        }
        


        }

     
        //this is the first method
        public static void createWet (App objApp){
        System.out.println("enter the name of the wetland") ;
        String nameW = lector.nextLine() ;
        System.out.println("enter the ubication of the wetland(rural or urban)") ;
        String ubicationW = lector.nextLine() ;
        System.out.println("enter the quantity of kms") ;
        int kmW = lector.nextInt() ;
        lector.nextLine();
        System.out.println("Enter the photo") ;
        String photoW = lector.nextLine() ;
        System.out.println("is the wetland protected?") ;
        String declarationW = lector.nextLine() ;
        double likes = 0;
        String humedal = objApp.addWetLand(nameW, ubicationW, kmW, photoW, declarationW, likes) ;
        System.out.println(humedal) ;


    }
    //this is the second method
    public static void newSpecie(App objApp) {
        System.out.println("enter the name of the wetland");
        String nameWett = lector.nextLine() ;
        System.out.println("enter the name of the specie");
        String nameSpe = lector.nextLine() ;
        System.out.println("enter its cientific name ");
        String cientific = lector.nextLine() ;
        System.out.println("is the specie migratory?");
        String migrate = lector.nextLine() ;
        System.out.println("wich is the type (1)flora terrestre, (2)flora acuatica, (3)bird, (4)mammal, (5)acuatic fauna");
        int opcion = lector.nextInt() ;
        String especie =objApp.addSpecie(nameWett,nameSpe,cientific, migrate,opcion) ;
        System.out.println(especie) ;

    }
    //this is the third method
    public static void newEvent(App objApp){
        System.out.println("enter the name of the wetland") ;
        String place = lector.nextLine() ;
        System.out.println("enter the date when the event will take place: ") ;
        int year = lector.nextInt() ;
        lector.nextLine() ;
        System.out.println("who is the organizer of the event: ") ;
        String organizer=lector.nextLine()  ;
        lector.nextLine() ;
        System.out.println("enter the cost of the event: ") ;
        double value=lector.nextDouble() ;
        lector.nextLine() ;
        System.out.println("type a description of the event") ;
        String descripction = lector.nextLine() ;
        System.out.println("enter the type of the event (1)Maintainance, (2)School visits, (3)Improvment activities, (4)Celebrations"); 
        int opcion =lector.nextInt() ;
        lector.nextLine() ;
        String eventos = objApp.registerEvent(place, organizer, value, descripction, opcion, year);
        System.out.println(eventos) ;
        


    }
    
    public  static void show(App objApp) {
        System.out.println("digite qué humedal quiere buscar") ;
        String nombrecito = lector.nextLine() ;
        String message = objApp.showInfo(nombrecito) ;
        System.out.println(message);
        
    }

    public static void likes(App objApp){
        System.out.println("digite qué humedal quiere buscar") ;
        String nombrecito = lector.nextLine() ;
        int busque = objApp.registerLikes(nombrecito);
        System.out.println(busque);
        System.out.println("cuántos likes quiere darle?") ;
        double like = lector.nextDouble();
        lector.nextLine();
        String mensajito = objApp.addLikes(like, busque) ;
        System.out.println(mensajito);


        

    } 
    public static void showMeLikes(App objApp){
        String numero =objApp.totalLikes() ;
        System.out.println(numero);
        

    }
    public static void wer(App objApp){
        String nombress = objApp.mayorLikes() ;
        System.out.println(nombress) ;

    }
    //this is the fourth method
    /*public static void quantityMaintance(App objApp){
        System.out.println("enter the year that wanna know") ;
        fecha year =lector.nextInt() ;
        LocalDate fecha=LocalDate.of(year) ;
        lector.nextLine();
        String mensaje = "";
        int counterExistW = objApp.counterExistW();
        for(int i = 0;i<counterExistW;i++){
            System.out.println(objApp.maintance(year,i));
        }
        System.out.println(mensaje);
    }*/
    public static void lessFLora(App objApp){
        String theName =objApp.lessFloraW() ;
        System.out.println(theName) ;
    }
    public static void mostFauna (App objApp){
        String theName2=objApp.moreFauna();
        System.out.println(theName2);
    }




}