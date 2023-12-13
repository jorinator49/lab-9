public class Car extends Auto {//файл Car.java
    private String model;
    private int numDoors;
    private Boolean fullTime; //полный привод
    private String gosNum; // госномер
    public Car(){
        super();// вызываем конструктор класса-родителя без параметров (см. класс Auto)
        model=""; // добавляем инициализацию новых членов
        numDoors=4;
        fullTime=false;
        gosNum= "";
    }

    public Car(String firma, int speed, String name, int n, Boolean f, String num){
        super(firma,speed); //вызываем конструктор класса-родителя с параметрами (см. класс Auto)
        model=name; // добавляем инициализацию новых членов
        numDoors=n;
        fullTime=f;
        gosNum=num;
    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setNumDoors(int n){
        numDoors=n;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public void setFullTime(Boolean b){
        fullTime=b;
    }
    public Boolean isFullTime(){
        return fullTime;
    }

    public void setGosNum(String str) {
        gosNum = str;
    }

    public String getGosNum() {
        return gosNum;
    }
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+model+" "+numDoors+" "+fullTime + " " + gosNum;
    }
}
