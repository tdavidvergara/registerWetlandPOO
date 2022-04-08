package model;
public class Specie {
    //attributes
    private String nameWetland ;
    private String nameSpecie ;
    private String scientificName ;
    private String migratory ;
    private String typeSpecie ;
    private TypeSpecie methodEnum ;
//metodos
    public Specie(String nameWetland, String nameSpecie, String scientificName, String migratory, int option1) {
        this.setNameWetland(nameWetland) ;
        this.nameSpecie = nameSpecie;
        this.scientificName = scientificName;
        this.migratory=migratory;
        switch(option1){
            case 1:setMethodEnum(TypeSpecie.TERRESTIALFLORA) ;
            break ;
            case 2:setMethodEnum(TypeSpecie.ACUATICFLORA);
            break;
            case 3:setMethodEnum(TypeSpecie.BIRD);
            break;
            case 4:setMethodEnum(TypeSpecie.MAMMAL);
            break; 
            case 5: setMethodEnum(TypeSpecie.ACUATICFAUNA);
            break;
        }
    }
    

    public String getNameWetland() {
        return nameWetland;
    }


    public void setNameWetland(String nameWetland) {
        this.nameWetland = nameWetland;
    }


    public TypeSpecie getMethodEnum() {
        return methodEnum;
    }


    public void setMethodEnum(TypeSpecie methodEnum) {
        this.methodEnum = methodEnum;
    }


    public String getTypeSpecie() {
        return typeSpecie;
    }


    public void setTypeSpecie(String typeSpecie) {
        this.typeSpecie = typeSpecie;
    }


    public String getMigratory() {
        return migratory;
    }


    public void setMigratory(String migratory) { 
        this.migratory = migratory;
    }


    public String getNameSpecie() {
        return nameSpecie;
    }
    public String getScientificName() {
        return scientificName;
    }
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }
    public void setNameSpecie(String nameSpecie) {
        this.nameSpecie = nameSpecie;
    }
    
}