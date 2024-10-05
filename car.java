 class car {
    //declaration of private attribute
    private String modelName;
    private String owner;
    private int regnumber;


    public car(String modelName,String owner,int regnumber){
        this.modelName=modelName;
        this.owner=owner;
        this.regnumber=regnumber;
}
    public void startengine(){
        System.out.println("car can be started");
           
    }
public void acceleration(){
    System.out.println("car can be acceleration");

}
public void stopengine(){
    System.out.println("car can be stop");
}
public void showCarInformation(){
    System.out.println("The car is owned by " +owner);
    System.out.println("The car model is "+modelName);
    System.out.println("The car regnumber "+regnumber);
}

public static void main(String[] args){
    car mycar=new car("BMW","Rakesh",205);
    mycar.startengine();
    mycar.acceleration();
    mycar.stopengine();
    mycar.showCarInformation();
}
}
