package model ;
public class Event {
    private String place ;
    private String eventRealizer ;
    private double value ;
    private String description ;
    private TypeEvent methodEnum ;
    private int year;
    public Event(String place, String eventRealizer, double value, String description, int option,int year) {
        this.placce = place ;
        this.eventRealizer=eventRealizer;
        this.value=value;
        this.description=description; 
        this.year = year;
        switch (option){
            case 1:setMethodEnum(TypeEvent.MAINTANCE) ;
            break;
            case 2:setMethodEnum(TypeEvent.VISIT) ;
            break ;
            case 3:setMethodEnum(TypeEvent.ACTIVITY);
            break ;
            case 4:setMethodEnum(TypeEvent.CELEBRATION) ;
            break ;
            
        }
        
    }
    

    public TypeEvent getMethodEnum() {
        return methodEnum;
    }


    public void setMethodEnum(TypeEvent methodEnum) {
        this.methodEnum = methodEnum;
    }


    public String getPlace() {
        return place;
    }


    public void setPlace(String place) {
        this.place = place;
    }


    public String getEventRealizer() {
        return eventRealizer;
    }
    public void setEventRealizer(String eventRealizer) {
        this.eventRealizer = eventRealizer;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value=value ;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    

    
}
